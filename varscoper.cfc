component {
	public function init() {
		local.paths = [
			ExpandPath("lib/antlr-4.0-complete.jar"),
			ExpandPath("compiled/")
		];
		
		local.classPaths = [
			ExpandPath("java/")
		];
		
		local.loader = createObject("component", "javaloader.JavaLoader").init(loadPaths = local.paths, sourceDirectories = local.classPaths);
		
		variables.processor = local.loader.create("Cfscript").init();
		
		return this;
	}
	
	public function handle() {
		param name = "url.action" default="home";
		
		if (!StructKeyExists(variables, "handler_" & url.action) || !IsCustomFunction(variables["handler_" & url.action])) {
			return "Invalid handler specified.";
		}
		
		local.method = variables["handler_" & url.action];
		return local.method(url);
	}
	
	public function handler_home(struct rc) {
		param name = "arguments.rc.errorMessage" default = "";
		return templateResult("container.cfm", { html = templateResult("home.cfm", arguments.rc) });
	}
	
	public function handler_processRequest(struct rc) {
		if (ReFind("\\$", arguments.rc.path)) {
			if (!DirectoryExists(arguments.rc.path)) {
				return handler_home({ errorMessage = "Directory #arguments.rc.path# was not found." });
			}
			
			local.html = processFolder(arguments.rc.path);
		} else {
			if (!FileExists(arguments.rc.path)) {
				return handler_home({ errorMessage = "File #arguments.rc.path# was not found." });
			}
			
			
			writeOutput("file processing not written yet");
		}
		
		return templateResult("container.cfm", { html = local.html });
	}
	
	public function processFile(required string path) {
		local.pass = {
			data = [],
			hasInvalid = false
		};
		
		
	}
	
	public function processFolder(required string path) {
		local.pass = {
			data = [],
			hasInvalid = false
		};
		
		local.files = directoryList(arguments.path, true, "path", "*.cfc");
		for(local.i = 1; local.i <= ArrayLen(local.files); local.i++) {
			local.temp = FileRead(local.files[local.i]);
			
			if (ReFindNoCase("\s*\<cfcomponent[^>]*\>", local.temp)) {
				continue;
			}
			
			local.component = processString(local.files[local.i]);
			
			if (local.component.hasUnvarred()) {
				local.pass.hasUnvarred = true;
			}
			
			ArrayAppend(local.pass.data, {
				component = local.component,
				path = local.files[local.i]
			});
		}
		
		return templateResult("results.cfm", local.pass);
	}
	
	public function processString(required string data) {
		return variables.processor.process(arguments.data);
	}
	
	
	public function templateResult(required string template, struct pass = {}) {
		local.pass = arguments.pass;
		
		local.template = "templates/" & arguments.template;
		
		savecontent variable = "local.return" {
			include local.template;
		}
		
		return local.return;
	}
}
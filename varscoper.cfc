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
		local.html = processFolder(ExpandPath("testing/"));
		
		return templateResult("container.cfm", { html = local.html });
	}

	public function processFolder(required string path) {
		local.pass = {
			data = [],
			hasInvalid = false
		};
		
		local.files = directoryList(arguments.path, true, "path", "*.cfc");
		for(local.i = 1; local.i <= ArrayLen(local.files); local.i++) {
			local.temp = FileRead(local.files[local.i]);
			/* if (ReFindNoCase("\s*\<cfcomponent[^>]*\>", local.temp)) {
				continue;
			} */
			local.component = processString(local.temp);
			
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
		return variables.processor.process(ExpandPath("test.cfc"));
	}
	
	
	public function templateResult(template, pass) {
		local.pass = arguments.pass;
		
		local.template = "templates/" & arguments.template;
		savecontent variable = "local.return" {
			include local.template;
		}
		
		return local.return;
	}
}
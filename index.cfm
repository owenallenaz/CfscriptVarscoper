<cfset local.varscoper = CreateObject("varscoper").init()>
<cfoutput>#local.varscoper.handle()#</cfoutput>

<!--- 
<cfset local.paths = [
	ExpandPath("lib/antlr-4.0-complete.jar"),
	ExpandPath("compiled/")
]>
<cfset local.classPaths = [
	ExpandPath("java/")
]>
<cfset local.custom = [ExpandPath("lib")]>

<cfset local.loader = createObject("component", "javaloader.JavaLoader").init(loadPaths = local.paths, sourceDirectories = local.classPaths)>

<cfset local.processor = local.loader.create("Cfscript").init()>

<cfset local.result = local.processor.process(ExpandPath("test.cfc"))>
<cfdump var="#local.result.hasUnvarred()#">
<Cfdump var="#local.result.functions#">

<cfdump var="#local.result.functions['test1'].unvarred#">
<cfdump var="#local.processor#">
--->
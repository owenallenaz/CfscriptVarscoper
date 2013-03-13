<cfoutput>
	<div class="home">
		<h2>Cfscript Varscoper</h2>
		<cfif local.pass.errorMessage is not "">
			<div class="alert alert-error">
				<b>Error:</b> #local.pass.errorMessage#
			</div>
		</cfif>
		<form method="get">
			<p>Absolute path to folder or file to test: (e.g. D:\inetpub\site1\test\)<br/><b>If you are specifying a folder you must specify a trailing slash!</b></p>
			<input type="text" name="path" placeholder="path" class="input-xxlarge"/>
			<input type="hidden" name="action" value="processRequest"/>
			<br/>
			<button type="submit" class="btn">Submit</button>
		</form>
	</div>
</cfoutput>
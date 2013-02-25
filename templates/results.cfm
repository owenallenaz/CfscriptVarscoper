<cfoutput>
	<div class="results">
		<h1>CFScript Components</h1>
		<cfoutput>ALL VALID - #!local.pass.hasUnvarred#</cfoutput>
		<cfloop array="#local.pass.data#" index="local.i">
			<h4>#local.i.path#</h4>
			<div class="file">
				<cfif local.i.component.hasUnvarred()>
					<p><b>INVALID</b></p>
					<cfloop list="#StructKeyList(local.i.component.functions)#" index="local.j">
						<cfset local.c = local.i.component.functions[local.j]>
						<cfif local.c.hasUnvarred()>
							<div class="function">
								<p>function <b>#local.j#</b> - #StructKeyList(local.c.unvarred)#</p>
							</div>
						</cfif>
					</cfloop>
				<cfelse>
					<p><b>VALID</b></p>
				</cfif>
			</div>
		</cfloop>
	</div>
</cfoutput>
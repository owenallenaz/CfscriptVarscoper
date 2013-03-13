<cfoutput>
	<div class="results">
		<h2>Results</h2>
		<p>Path: <b>#local.pass.path#</b></p>
		<p>Duration: <b>#local.pass.duration#ms</b></p>
		<cfloop array="#local.pass.data.data#" index="local.i">
			<div class="component <cfif local.i.component.hasUnvarred()>hasUnvarred open</cfif>">
				<div class="topLine">
					<button class="openButton btn btn-mini">
						<i class="closeIcon icon-minus"></i>
						<i class="openIcon icon-plus"></i>
					</button>
					<cfif local.i.component.hasUnvarred()>
						<i class="icon-exclamation-sign"></i>
					<cfelse>
						<i class="icon-ok"></i>
					</cfif>
					#local.i.path#
				</div>
				<div class="detailsRow">
					<table class="table">
						<thead>
							<th>Function</th>
							<th>Unvarred</th>
						</thead>
						<tbody>
							<cfloop list="#StructKeyList(local.i.component.functions)#" index="local.j">
								<cfset local.c = local.i.component.functions[local.j]>
								<tr class="<cfif local.c.hasUnvarred()>hasUnvarred error<cfelse>success</cfif>">
									<td>
										<cfif local.c.hasUnvarred()>
											<i class="icon-exclamation-sign"></i>
										<cfelse>
											<i class="icon-ok"></i>
										</cfif>
										#local.j#
									</td>
									<td>#StructKeyList(local.c.unvarred)#</td>
								</tr>
							</cfloop>
						</tbody>
					</table>
				</div>
			</div>
		</cfloop>
	</div>
	<script>
		$(function() {
			var root = $(".results");
			root.find(".openButton").click(function() {
				$(this).closest(".component").toggleClass("open");
			});
		});
	</script>
</cfoutput>
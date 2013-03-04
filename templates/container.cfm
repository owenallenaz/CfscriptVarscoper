<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
		<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
		<link rel="stylesheet" href="main.css"/>
	</head>
	<body>
		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="navbar-inner">
				<div class="container">
					<a class="brand" href="?action=home">Cfscript Varscoper</a>
					<ul class="nav">
						<li><a href="?action=home">Run Test</a></li>
						<li><a href="#">Results</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="container">
			<cfoutput>#local.pass.html#</cfoutput>
		</div>

		<script src="bootstrap/js/bootstrap.min.js"></script>
	</body>
</html>
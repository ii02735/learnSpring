<!DOCTYPE HTML>
<html>
	<head>
		<title>Hello world Spring MVC !</title>
		<meta charset="utf-8">
	</head>
	<body>
		<form method="GET" action="submit-get">
			<label for="name">Saisir un nom :</label>
			<input type="text" name="name"/>
			<input type="submit" value="envoyer"/>
		</form>
		<br/>
		<form method="POST" action="submit-post">
			<label for="name">Saisir un nom de famille :</label>
			<input type="text" name="lastname"/>
			<br/>
			<br/>
			<label for="name">Saisir un prénom :</label>
			<input type="text" name="firstname"/>
			<input type="submit" value="envoyer"/>
		</form>
	</body>
</html>
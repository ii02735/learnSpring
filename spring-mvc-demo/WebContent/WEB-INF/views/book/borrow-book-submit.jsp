<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
	<head>
		<title>Emprunter un livre</title>
		<meta charset="utf-8">
	</head>
	<body>
		<h2>Résultat de la soumission :</h2>
		<p>Titre : <strong>${book.title}</strong>
		<p>Auteur : <strong>${book.author}</strong>
		<p>Genre : <strong>${book.genre}</strong>
		<h3>Caractéristiques du livre</h3>
		<c:forEach var="spec" items="${book.specifications}">
			<li>${spec}</li>
		</c:forEach>
	</body>
</html>
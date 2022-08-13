<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
	<head>
		<title>Cr�er un livre</title>
		<meta charset="utf-8">
	</head>
	<body>
		<h2>R�sultat de la cr�ation :</h2>
		<p>Titre : <strong>${book.title}</strong>
		<p>Auteur : <strong>${book.author}</strong>
		<p>Genre : <strong>${book.genre}</strong>
		<p>Nombre de pages : <strong>${book.pagesNumber}</strong></p>
		<c:choose>
			<c:when test="${empty book.specifications}">
				<h3>Aucune caract�ristique pr�cis�e</h3>
			</c:when>
			<c:otherwise>
				<h3>Caract�ristiques du livre</h3>		    
				<c:forEach var="spec" items="${book.specifications}">
					<li>${spec}</li>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</body>
</html>
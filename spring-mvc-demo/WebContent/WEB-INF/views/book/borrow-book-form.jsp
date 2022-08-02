<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
	<head>
		<title>Emprunter un livre</title>
		<meta charset="utf-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/book/style.css"/>
	</head>
	<body>
		<form:form method="POST" action="${pageContext.request.contextPath}/book/borrow" modelAttribute="book">
			<form:label path="author">Auteur :</form:label>
			<form:input path="author" type="text"/>
			<br/>
			<form:label path="title">Titre :</form:label>
			<form:input path="title" type="text"/>
			<br/>
			<span>Sélectionner le genre : <br/</span>
			<form:radiobuttons path="genre" items="${book.genres}"/>
			<br/>
			<br/>
			<span>Ajouter des caractéristiques (si existant):</span>
			<br/>
			<form:checkboxes items="${book.availableSpecifications}" path="specifications"/>
			<br/>
			<br/>
			<input type="submit" value="emprunter"/>
		</form:form>
	</body>
</html>
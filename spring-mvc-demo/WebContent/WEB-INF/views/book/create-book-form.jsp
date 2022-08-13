<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
	<head>
		<title>Créer un livre</title>
		<meta charset="utf-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/book/style.css"/>
	</head>
	<body>
		<form:form method="POST" action="${pageContext.request.contextPath}/book/create" modelAttribute="book">
			<form:label path="author">Auteur :</form:label>
			<form:input path="author" type="text"/>
			<br/>
			<form:errors path="author" cssClass="error"/>
			<form:label path="title">Titre :</form:label>
			<form:input path="title" type="text"/>
			<br/>
			<form:errors path="title" cssClass="error"/>
			<span>Sélectionner le genre : <br/></span>
			<form:radiobuttons path="genre" items="${book.genres}"/>
			<form:errors path="genre" cssClass="error"/>
			<br/>
			<form:label path="pagesNumber">Nombre de pages :</form:label>
			<form:input type="text" path="pagesNumber"/>
			<form:errors path="pagesNumber" cssClass="error"/>
			<br/>
			<form:label path="identificationNumber">Numéro d'identification du livre (ISBN) :</form:label>
			<form:input type="text" path="identificationNumber"/>
			<form:errors path="identificationNumber" cssClass="error"/>
			<br/>
			<span>Ajouter des caractéristiques (si existant):</span>
			<br/>
			<form:checkboxes items="${book.availableSpecifications}" path="specifications"/>
			<br/>
			<br/>
			<input type="submit" value="Créer"/>
		</form:form>
	</body>
</html>
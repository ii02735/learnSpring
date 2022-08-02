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
			<form:select path="genre">
				<span>Sélectionner le genre</span>
				<form:options items="${book.genres}"/>
			</form:select>
			<input type="submit" value="emprunter"/>
		</form:form>
	</body>
</html>
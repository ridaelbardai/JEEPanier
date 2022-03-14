<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cataogue</title>
</head>
<body>
<h1>Catalogue :</h1>
	<form action="ajouterArticle" method="post">
		<input type="checkbox" id="Livre1" name="Livre" value="tour du monde">
		<label for="Livre1"> tour du monde</label><br>
		 <input type="checkbox" id="Livre2" name="Livre" value="la boite a merveilles"> 
		 <label for="Livre2"> la boite a merveilles</label><br> 
		 <input type="checkbox" id="Livre3" name="Livre" value="les miserables">
		 <label for="Livre3"> les miserables</label><br><br> 
		 
		 <input type="submit" value="Submit">
	</form>
</body>
</html>
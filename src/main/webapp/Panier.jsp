
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Panier</title>
</head>
<body>
	<h3>Vous avez choisis :</h3>
	<ul>
		<c:forEach items="${requestScope.cart}" var="lang">
				<li>
					<c:out value="${lang.nom}" />			
				</li>
			</br>
		</c:forEach>
	</ul>
	
</body>
</html>
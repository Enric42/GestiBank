<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.com">

<html>

<head>
<meta http-equiv = "Content-Type" content="text/html; charset=ISO-8859-1">

<title>Accueil client</title>
</head>


<body>

<a href = "<%= request.getContextPath()+ "/accueilClient.jsp" %>">Accueil</a>


	<% String pseudo = (String) session.getAttribute("utilisateur");%>
	<h2>Bonjour, <%= pseudo %></h2>


	<ul>
	<li><a href = "/GestiBank/client/pageClient.jsp">Mon espace client</a></li>
	<li><a href = "">Contacter mon conseiller</a></li>
	<li><a href = "<%=request.getContextPath() + "/fin.jsp"%>">Se déconnecter</a></li>
	</ul>
	



</body>
</html>
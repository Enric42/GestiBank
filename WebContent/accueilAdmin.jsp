<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.com">

<html>

<head>
<meta http-equiv = "Content-Type" content="text/html; charset="ISO-8859-1">

<title>Accueil administrateur</title>
</head>


<body>

<a href = "/GestiBank/accueilAdmin.jsp">Accueil</a> </br>
<a href = "<%=request.getContextPath() + "/fin.jsp"%>">Se d�connecter</a>

<% String pseudo = (String) session.getAttribute("utilisateur");%>
	<h2>Bonjour, <%= pseudo %></h2>   </br>

<h1>Gestion des conseillers</h1>
	<ul>
	<li>Tous</li>
	<li>Nouveaux</li>
	<li>Existants</li>
	</ul> </br>

<h1>Gestion des nouveaux clients</h1>
	<ul>
	<li>Assigner</li>
	</ul>

	



</body>
</html>
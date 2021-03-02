<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.com">

<html>

<head>
<meta http-equiv = "Content-Type" content="text/html; charset=ISO-8859-1">

<title>Accueil administrateur</title>
</head>


<body>

<a href = "<%=request.getContextPath() + "/accueilAdmin.jsp" %>">Accueil</a>
<a href = "<%=request.getContextPath() + "/fin.jsp"%>">Se déconnecter</a>

	<% String pseudo = (String) session.getAttribute("utilisateur");%>
	
	<h1>Gestion des conseillers</h1>
	<ul>
	<li>Tous</li>
	<li><a href = "/GestiBank/admin/listeConseillers.jsp">Editer</a></li>
	<li><a href = "/GestiBank/admin/ajout-conseiller.jsp">Ajouter</a></li>
	</ul>

<h1>Gestion des nouveaux clients</h1>
	<ul>
	<li>Assigner</li>
	</ul>

	



</body>
</html>
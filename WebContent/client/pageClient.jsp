<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.com">

<html>

<head>
<meta http-equiv = "Content-Type" content="text/html; charset=ISO-8859-1">

<title>Synth�se client</title>
</head>


<body>

<a href = "/GestiBank/accueilClient.jsp">Accueil</a>

<% String pseudo = (String) session.getAttribute("utilisateur");%>
	<h2>Bonjour, <%= pseudo %></h2>


	<ul>
	<li>Mon espace client</li>
	<li><a href = "">Contacter mon conseiller</a></li>
	<li><a href = "<%=request.getContextPath() + "/fin.jsp"%>">Se d�connecter</a></li>
	</ul>
	

<ul>
<li><a href = "/GestiBank/client/virement.jsp">Effectuer un virement</a></li>
<li><a href = "">Demande de ch�quier</a></li>
<li><a href = "">Editer un RIB</a></li>
</ul>	



<h1>Synth�se des comptes</h1>
<ul>
<li><a href = "/GestiBank/client/compte1.jsp">Compte d�pot n�123456</a></li>
<li>Compte d�pot n�32154</li>
</ul>

</body>

</html>
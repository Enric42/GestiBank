<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.com">

<html>

<head>
<meta http-equiv = "Content-Type" content="text/html; charset="ISO-8859-1">

<title>Edition de clients</title>
</head>


<body>

<a href = "/GestiBank/accueilConseiller.jsp">Accueil</a> </br>
<a href = "<%=request.getContextPath() + "/fin.jsp"%>">Se déconnecter</a>

<% String pseudo = (String) session.getAttribute("utilisateur");%>
	<h2>Bonjour, <%= pseudo %></h2> </br>


<p>
	<ul>
	<li>Client n 09669</a></li>
	<li> Emma Nuhelle</li>
	<li>16 chemin de la chaise</li>
    <li><a href = "/GestiBank/conseiller/edition-client.jsp">Editer</a></li>
	</ul>
</p>

<p>
	<ul>
	<li>Compte n 123456</li>
	<li>Compte standard</li>
	<li>Solde : + 1234.56 </li>
    <li><a href = "/GestiBank/client/compte1.jsp">Voir le détail</a></li>
    <li>Modifier</li>
	</ul>
</p>

<a href = "/GestiBank/conseiller/listeClients.jsp">Liste des clients</a>



</body>
</html>
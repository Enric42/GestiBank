<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.com">

<html>

<head>
<meta http-equiv = "Content-Type" content="text/html; charset=ISO-8859-1">

<title>Accueil conseiller</title>
</head>


<body>

<a href="<%=request.getContextPath()+ "/accueilConseiller.jsp" %>"p">Accueil</a>
<a href="<%=request.getContextPath()+ "/fin.jsp"%>">Se déconnecter</a>
	
	<h1>Gestion des clients</h1>
	<ul>
	<li><a href = "/GestiBank/conseiller/listeClients.jsp">Tous</a></li>
	<li>Nouveaux</li>
	<li>Existants</li>
	</ul>
	
</body>
</html>
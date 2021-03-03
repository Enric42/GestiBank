<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.com">

<html>

<head>
<meta http-equiv = "Content-Type" content="text/html; charset=ISO-8859-1">

<title>Compte</title>
</head>


<body>

<a href = "/GestiBank/accueilClient.jsp">Accueil</a>

	<h2>Bonjour, ${ utilisateur.getPrenom() }</h2>


	<ul>
	<li><a href = "/GestiBank/client/pageClient.jsp">Mon espace client</a></li>
	<li><a href = "">Contacter mon conseiller</a></li>
	<li><a href = "<%=request.getContextPath() + "/fin.jsp"%>">Se déconnecter</a></li>
	</ul>
	

<ul>
<li><a href = "/GestiBank/client/virement.jsp">Effectuer un virement</a></li>
<li><a href = "">Demande de chéquier</a></li>
<li><a href = "">Editer un RIB</a></li>
</ul>	


<a href = "/GestiBank/client/pageClient.jsp">Retour à mon espace</a>


<h1>Compte dépot n°123456</h1>
<ul>
<li>Virement maman                 01/02/2021              + 50.00</li>
<li>Paypal - GKSARL                01/02/2021              - 480.00</li>
<li>Carrefour Market               02/02/2021              - 67.87</li>
</ul>


</body>

</html>
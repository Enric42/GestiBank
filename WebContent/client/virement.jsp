<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.com">

<html>

<head>
<meta http-equiv = "Content-Type" content="text/html; charset=ISO-8859-1">

<title>Virement de fonds</title>
</head>


<body>

<a href = "/GestiBank/accueilClient.jsp">Accueil</a>

	<h2>Bonjour, ${ utilisateur.getPrenom() }</h2>


	<ul>
	<li><a href = "/GestiBank/client/pageClient.jsp">Mon espace client</a></li>
	<li><a href = "">Contacter mon conseiller</a></li>
	<li><a href = "<%=request.getContextPath() + "/fin.jsp"%>">Se d�connecter</a></li>
	</ul>
	

<ul>
<li>Effectuer un virement</li>
<li><a href = "">Demande de ch�quier</a></li>
<li><a href = "">Editer un RIB</a></li>
</ul>	



<form action = "traiterlogin" method = "POST">
<table border = "0">
<tr>
<td align = "center" width = "200" > Compte Emetteur: </td>
<td><input type = "text" name = "login" maxLength = "20" size = "20" value = ""></td>
</tr>
<tr>
<td align = "center" width = "200" > Compte Recepteur : </td>
<td><input type = "text" name = "login" maxLength = "20" size = "20" value = ""></td>
</tr>


<tr>
<td align = "center" width = "200" > Libell� du virement : </td>
<td><input type = "text" name = "login" maxLength = "20" size = "20" value = ""></td>
</tr>
<tr>
<td align = "center" width = "200" > Montant du virement : </td>
<td><input type = "text" name = "login" maxLength = "20" size = "20" value = ""></td>
</tr>

<tr>
<td align = "center"><input type = "reset" value = "Valider"></td>
</tr>


</table>

</form>


</body>

</html>
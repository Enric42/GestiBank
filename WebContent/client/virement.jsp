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

<% String pseudo = (String) session.getAttribute("utilisateur");%>
	<h2>Bonjour, <%= pseudo %></h2>


	<ul>
	<li><a href = "/GestiBank/client/accueilClient.jsp">Mon espace client</a></li>
	<li><a href = "">Contacter mon conseiller</a></li>
	<li><a href = "<%=request.getContextPath() + "/fin.jsp"%>">Se déconnecter</a></li>
	</ul>
	

<ul>
<li>Effectuer un virement</li>
<li><a href = "">Demande de chéquier</a></li>
<li><a href = "">Editer un RIB</a></li>
</ul>	



<form action = "" method = "POST">
<table border = "0">
<tr>
<td align = "center" width = "200" > Compte Emetteur: </td>
<td><input type = "text" name = "CmptEmetteur" maxLength = "20" size = "20" value = ""></td>
</tr>
<tr>
<td align = "center" width = "200" > Compte Recepteur : </td>
<td><input type = "text" name = "CmptRecepteur" maxLength = "20" size = "20" value = ""></td>
</tr>


<tr>
<td align = "center" width = "200" > Libellé du virement : </td>
<td><input type = "text" name = "LiblVirement" maxLength = "20" size = "20" value = ""></td>
</tr>
<tr>
<td align = "center" width = "200" > Montant du virement : </td>
<td><input type = "number" name = "MontVirement" maxLength = "20" size = "20" value = ""></td>
</tr>

<tr>
<td align = "center"><input type = "submit" value = "Valider"></td>
</tr>


</table>

</form>


</body>

</html>
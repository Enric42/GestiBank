<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.com">

<html>

<head>
<meta http-equiv = "Content-Type" content="text/html; charset=ISO-8859-1">

<title>Edition de clients</title>
</head>


<body>

<a href = "/GestiBank/accueilAdmin.jsp">Accueil</a>
<a href = "<%=request.getContextPath() + "/fin.jsp"%>">Se déconnecter</a>

<% String pseudo = (String) session.getAttribute("utilisateur");%>
	<h2>Bonjour, <%= pseudo %></h2>

<form action = "traiterlogin" method = "POST">
<table border = "0">
<tr>
<td align = "center" width = "200" > Nom : </td>
<td><input type = "text" name = "login" maxLength = "20" size = "20" value = ""></td>
</tr>
<tr>
<td align = "center" width = "200" > Prénom : </td>
<td><input type = "text" name = "motDePasse" maxLength = "20" size = "20" value = ""></td>
</tr>
<tr>
<td align = "center" width = "200" > Adresse : </td>
<td><input type = "text" name = "login" maxLength = "20" size = "20" value = ""></td>
</tr>
<tr>
<td align = "center" width = "200" > Code Postal : </td>
<td><input type = "text" name = "login" maxLength = "20" size = "20" value = ""></td>
</tr>
<tr>
<td align = "center" width = "200" > Ville : </td>
<td><input type = "text" name = "login" maxLength = "20" size = "20" value = ""></td>
</tr>


</table>

</form>

Enregistrer
<a href = "/GestiBank/admin/listeConseillers.jsp">Liste des conseillers</a>



</body>
</html>
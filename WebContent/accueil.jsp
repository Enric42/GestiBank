<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv = "Content-Type" content = "text/html ; charset = iso-8859-1">
</head>

<body>

<a href = "/GestiBank/accueil.jsp">Accueil</a>

	<h1>Bienvenue dans l'espace de connexion de GestiBank</h1>
	</br>
	<!--  connection admin -->
<form action = "traiterlogin" method = "POST">
<input type="hidden" id="whois" value="3">
<table border = "0">
<tr>
<td align = "center" width = "200" > Identifiant : </td>
<td><input type = "text" name = "login" maxLength = "20" size = "20" value = ""></td>
</tr>
<tr>
<td align = "center" width = "200" > Mot de Passe : </td>
<td><input type = "password" name = "motDePasse" maxLength = "20" size = "20" value = ""></td>
</tr>
<tr>
<td align = "right"><input type = "reset" value = "Reinitialiser"></td>
<td align = "right"><input type = "submit" value = "Se connecter"></td>
</tr>

<a href="${pageContext.request.contextPath}/inscription.jsp"> Inscription</a>


</table>

</form>

</body>


 </html>
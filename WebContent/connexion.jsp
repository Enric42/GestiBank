<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 	<!--  connection admin -->
<fieldset>
<legend>Connexion Administrateur</legend>
<form action = "traiterlogin" method = "POST">
<input type="hidden" name="whois" value="administrateur">
<table>
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
</table>
</form>
</fieldset>
</br>


 	<!--  connection conseiller -->
<fieldset>
<legend>Connexion Conseiller</legend>
<form action = "traiterlogin" method = "POST">
<input type="hidden" name="whois" value="conseiller">
<table>
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
</table>
</form>
</fieldset>
</br>

 	<!--  connection client -->
<fieldset>
<legend>Connexion Client</legend>
<form action = "traiterlogin" method = "POST">
<input type="hidden" name="whois" value="client">
<table>
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
</table>
</form>
</fieldset>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.com">

<html>

<head>
<meta http-equiv = "Content-Type" content="text/html; charset=ISO-8859-1">

<title>Liste des clients GestiBank</title>
</head>


<body>

<a href = "/GestiBank/accueilConseiller.jsp">Accueil</a>
<a href = "<%=request.getContextPath() + "/fin.jsp"%>">Se déconnecter</a>

<% String pseudo = (String) session.getAttribute("utilisateur");%>
	<h2>Bonjour, <%= pseudo %></h2>

<h1>Gestion des clients</h1>
	<ul>
	<li>Tous</li>
	<li>Nouveaux</li>
	<li>Existants</li>
	</ul>

<table>
    <tbody>
    
        <tr>
        	<td>Statut</td>
            <td>Nom (ID Client)</td>
            <td>Adresse</td>
            <td>Action</td>
        </tr>
        <tr>
        	<td>Client</td>
            <td><a href= "/GestiBank/conseiller/gestion-client.jsp" >Emma Nuhelle (09669)</a></td>
            <td>16 chemin de la chaise</td>
            <td><a href = "/GestiBank/conseiller/edition-client.jsp">Editer</a></td>
        </tr>
        <tr>
        	<td>Client</td>
            <td>Jean Mitoufle (00322)</td>
            <td>42 chemin de la vie</td>
            <td><a href = "/GestiBank/conseiller/edition-client.jsp">Editer</a></td>
        </tr>
              <tr>
        	<td>Guest</td>
            <td>John Dheuf (04598)</td>
            <td>1 avenue de l'Homme Lette</td>
            <td>Valider</td>
        </tr>
              <tr>
        	<td>Client</td>
            <td>Harry Potter (00880)</td>
            <td>4 Privet Drive</td>
            <td><a href = "/GestiBank/conseiller/edition-client.jsp">Editer</a></td>
        </tr>
        
    </tbody>
</table>


</body>
</html>
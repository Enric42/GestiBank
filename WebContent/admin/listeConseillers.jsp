<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.com">

<html>

<head>
<meta http-equiv = "Content-Type" content="text/html; charset=ISO-8859-1">

<title>Liste des clients GestiBank</title>
</head>


<body>

<a href = "/GestiBank/accueilAdmin.jsp">Accueil</a>
<a href = "<%=request.getContextPath() + "/fin.jsp"%>">Se déconnecter</a>

<% String pseudo = (String) session.getAttribute("utilisateur");%>
	<h2>Bonjour, <%= pseudo %></h2>

<h1>Gestion des conseillers</h1>
	<ul>
	<li>Tous</li>
	<li>Nouveaux</li>
	<li>Existants</li>
	</ul>

<table>
    <tbody>
    
        <tr>
            <td>Nom (matricule)</td>
            <td>Adresse</td>
            <td>Action</td>
        </tr>
        <tr>
            <td>Paul Hamploa (25)</td>
            <td>42 chemin des frères pauvres</td>
            <td>Editer  Supprimer</td>
        </tr>
        <tr>
            <td>Camille Onette (35)</td>
            <td>1 route des foins</td>
            <td>Editer  Supprimer</td>
        </tr>
              <tr>
            <td>Alain Deloin (37)</td>
            <td>3 avenue des inconnus</td>
            <td>Editer  Supprimer</td>
        </tr>
        
    </tbody>
</table>
<a href = "/GestiBank/admin/ajout-conseiller.jsp" >Ajouter</a>



</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<title>Accueil conseiller</title>
<meta http-equiv = "Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" type="image/ico" href="favicon.png.ico"/>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900italic,900' rel='stylesheet' type='text/css'>
<link href="https://fonts.googleapis.com/css2?family=Cedarville+Cursive&family=Courgette&display=swap" rel="stylesheet">

<!-- Import des feuilles de styles -->
<link href="css/animation.css" rel="stylesheet">
<link href="css/common.css" rel="stylesheet">

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
<script defer type="text/javascript" src="js/annotation.js"></script>
</head>

<body>
<div class="container-fluid" style="background: linear-gradient(90deg, rgba(25,135,84,1) 0%, rgba(71,110,145,1) 39%, rgba(13,110,253,1) 100%)">
  <nav class="navbar navbar-light" style="background: linear-gradient(90deg, rgba(25,135,84,1) 0%, rgba(71,110,145,1) 39%, rgba(13,110,253,1) 100%)">
    <a class="navbar-brand" href="/GestiBank/accueil.jsp"><img class="spring" src="css/img/bank.svg" alt="" width="100" height="100"></a>
  </nav>
</div>

<a href="<%=request.getContextPath()+ "/conseiller.jsp"%>">Accueil</a>
<a href="<%=request.getContextPath()+ "/fin.jsp"%>">Se déconnecter</a>

	<% String pseudo = (String) session.getAttribute("utilisateur");%>
	<h2>Bonjour, <%= pseudo %></h2>
	
	<h1>Gestion des clients</h1>
	<ul>
	<li><a href = "/GestiBank/conseiller/listeClients.jsp">Tous</a></li>
	<li>Nouveaux</li>
	<li>Existants</li>
	</ul>
	
</body>
</html>
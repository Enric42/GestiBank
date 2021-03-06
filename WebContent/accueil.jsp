<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
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

<body class="test">

<div class="container-fluid" style="background: linear-gradient(50deg, rgba(25,135,84,0.5) 0%, rgba(71,110,145,0.5) 39%, rgba(13,110,253,0.5) 100%)">
	<nav class="navbar navbar-light">
 			<a class="navbar-brand" href="/GestiBank/accueil.jsp"><img class="spring" src="css/img/bank.svg" alt="" width="100" height="100"></a>
   				<ul class="nav nav-pills">
  					<li class="nav-item">
    					<a class="btn btn-success" type="button" href="<%=request.getContextPath() + "/connexion.jsp"%>">Connexion</a>
  					</li>
  					<li class="nav-item">  
  					</li>
  					<li class="nav-item">
    					<a class="btn btn-success" type="button" href="<%=request.getContextPath() + "/inscription.jsp"%>">Inscription</a>
  					</li>
  					</ul>
   	</nav>
</div>
<!--<div class="test">-->

		<div class="text-center anim anim-1" style="padding-top: 5%">
			<h1 style="font-family: Roboto; font-weight: 900; font-style: italic">
			<span style="color: #198754; text-shadow: 2px 2px 2px white;">Gesti</span>
			<span style="color: #0d6efd; text-shadow: 2px 2px 2px white;">Bank</span>
			</h1>
		</div>

  <div class="circle a-slide" data-animation="one" style="--animdel:100ms;--animic: 1.5;"></div>
  		<div class="text-center anim anim-2">
			<h2 style="color: black; text-shadow: 2px 2px 2px white; font-family: Courgette">Rapidité 🚀</h2>
		</div>
  <div class="circle a-slide" data-animation="two" style="--bgc:green;--animdel:300ms;--animic: 1.5;"></div>
  		<div class="text-center anim anim-3">
			<h2 style="color: black; text-shadow: 2px 2px 2px white; font-family: Courgette">Sécurité 🔐</h2>
		</div>
  <div class="circle a-slide" data-animation="third" style="--animdel:500ms;--animic: 1.5;"></div>
  		<div class="text-center anim anim-4">
			<h2 style="color: black; text-shadow: 2px 2px 2px white; font-family: Courgette">Performance 📈</h2>
		</div>
  <div class="circle a-slide" data-animation="four" style="--bgc:green;--animdel:700ms;--animic: 1.5;"></div>
  		<div class="text-center anim anim-5">
			<h2 style="color: black; text-shadow: 2px 2px 2px whitek; font-family: Courgette">Qu'attendez-vous ?</h2>
		</div>
  <div class="circle a-slide" data-animation="five" style="--animdel:900ms;--animic: 1.5;"></div>
  
<!--</div>-->
</body>
 </html>
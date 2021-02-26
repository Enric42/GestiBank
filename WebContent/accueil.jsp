<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv = "Content-Type" content="text/html; charset=ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900italic,900' rel='stylesheet' type='text/css'>
<link href="https://fonts.googleapis.com/css2?family=Cedarville+Cursive&family=Courgette&display=swap" rel="stylesheet">
<link href="css/animation.css" rel="stylesheet">
</head>

<body>

<nav class="navbar navbar-light" style="background: linear-gradient(90deg, rgba(25,135,84,1) 0%, rgba(71,110,145,1) 39%, rgba(13,110,253,1) 100%)">
  <div class="container-fluid">
    <a class="navbar-brand col-10" href="/GestiBank/accueil.jsp"><img class="spring" src="css/img/bank.svg" alt="" width="100" height="100"></a>
    <a class="btn btn-success pull-right" type="button" href="<%=request.getContextPath() + "/connexion.jsp"%>">Connexion</a>
    <a class="btn btn-success" type="button" href="<%=request.getContextPath() + "/inscription.jsp"%>">Inscription</a>
  </div>
</nav>

<div class="gesti text-center" style="padding-top: 5%">
		<h1 style="font-family: Roboto; font-weight: 700; font-style: italic">
		<span style="color: #198754">Gesti</span>
		<span style="color: #0d6efd">Bank</span>
		</h1>
		<h2 style="color: #476e91; font-family: Courgette">Ma sécurité financière axée sur demain !</h2>
</div>

  <div class="circle a-slide" data-animation="one" style="--animdel:100ms;--animic: 1.5;"></div>
  <div class="circle a-slide" data-animation="two" style="--bgc:green;--animdel:300ms;--animic: 1.5;"></div>
  <div class="circle a-slide" data-animation="third" style="--animdel:500ms;--animic: 1.5;"></div>
  <div class="circle a-slide" data-animation="four" style="--bgc:green;--animdel:700ms;--animic: 1.5;"></div>
  <div class="circle a-slide" data-animation="five" style="--animdel:900ms;--animic: 1.5;"></div>

</body>
 </html>
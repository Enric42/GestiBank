<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<title>Espace Connexion</title>

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

<div>
  <div>
    <div class="container register">          
      <div class="row">
      <div class="tab-content col-md-3 register-left">
          <img class="animate-boing" src="css/img/people.svg" alt=""/>
          <h3>Bienvenue sur votre Espace</h3>
          <p>un accès ultra rapide à vos comptes en quelques clics</p>
          <a class="btn btn-form btn-form-success" href="<%=request.getContextPath()%>">Retour à l'accueil</a><br/>
      </div>
        
        <!-- choix du type utilisateur -->
        <div class="col-md-9 register-right">
        	<div class="col-md-12">
          <ul class="nav nav-tabs nav-justified" id="myTab" role="tablist">

              <li class="nav-item">
                  <a class="nav-link active" id="client-tab" role="tab" data-toggle="tab" data-target=".tab-client" aria-controls="client" aria-selected="true">Client</a>
              </li>
              <li class="nav-item">
                  <a class="nav-link" id="conseiller-tab" role="tab" data-toggle="tab" data-target=".tab-conseiller" aria-controls="conseiller" aria-selected="false">Conseiller</a>
              </li>
              <li class="nav-item">
                  <a class="nav-link" id="administrateur-tab" role="tab" data-toggle="tab" data-target=".tab-administrateur" aria-controls="administrateur" aria-selected="false">Administrateur</a>
              </li>
          </ul>
          	</div>
	      <!-- Conteneur des sections -->
	      <div class="tab-content anim anim-6" id="myTabContent">
	        <%@ include file="WEB-INF/connexions/client.jsp" %>
	        <%@ include file="WEB-INF/connexions/conseiller.jsp" %>
	        <%@ include file="WEB-INF/connexions/administrateur.jsp" %>
	      </div>
	      
        </div>
      </div>
    </div>
  </div>
</div>

</body>
</html>
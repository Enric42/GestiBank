<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<title>Ouvrir un compte chez GestiBank</title>
<meta http-equiv = "Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" type="image/ico" href="favicon.png.ico"/>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900italic,900' rel='stylesheet' type='text/css'>
<link href="https://fonts.googleapis.com/css2?family=Cedarville+Cursive&family=Courgette&display=swap" rel="stylesheet">

<!-- Import des feuilles de styles -->
<link href="css/animation.css" rel="stylesheet">
<link href="css/common.css" rel="stylesheet">

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
<script defer type="text/javascript" src="js/annotation.js"></script>
</head>

<body>

<div class="container-fluid" style="background: linear-gradient(50deg, rgba(25,135,84,1) 0%, rgba(71,110,145,1) 39%, rgba(13,110,253,1) 100%)">
	<nav class="navbar navbar-light" style="background: linear-gradient(50deg, rgba(25,135,84,1) 0%, rgba(71,110,145,1) 39%, rgba(13,110,253,1) 100%)">
 			<a class="navbar-brand" href="/GestiBank/accueil.jsp"><img class="spring" src="css/img/bank.svg" alt="" width="100" height="100"></a>
   	</nav>
</div>	
<div class="container register anim anim-6">
                <div class="row">
                    <div class="col-md-3 register-left">
                        <img class="animate-boing" src="<%=request.getContextPath()%>/css/img/cash.svg" alt=""/>
                        <h3>GestiBank</h3>
                        <p>une inscription rapide en 30 secondes pour gagner de l'argent !</p>
          <a class="btn btn-form btn-form-success back" href="<%=request.getContextPath()%>"><img src="css/img/back.svg" height="50px" width="50px" alt=""/></br>Accueil</a><br/>
      </div>
                    <div class="col-md-8 register-right">
							<h3 class="register-heading">Formulaire d'inscription</h3>
                                <form class="needs-validation" novalidate action="<%=request.getContextPath()%>/public/inscription" method="POST" >
                                
                                <div class="row register-form">
                                    <div class="col-md-6">
                                    	<div class="form-group position-relative">
                                        	<label for="validationTooltip01" class="form-label">Nom</label>
                                            <input type="text" class="form-control" id="validationTooltip01" name="nom" placeholder="Votre Nom" value="" required>
                                        	<div class="valid-tooltip">
      											Validé !
      										</div>
      										<div class="invalid-tooltip">
	      										"Nom" manquant.
	    									</div>
	    								</div></br>
	    								<div class="form-group position-relative">
                                         	<label for="validationTooltip02" class="form-label">Prénom</label>
                                            <input type="text" class="form-control" id="validationTooltip02" name="prenom" placeholder="Votre Prénom" value="" required>
	                                        <div class="valid-tooltip">
	      										Validé !
	      									</div>
	      									<div class="invalid-tooltip">
	      										"Prénom" manquant.
	    									</div>
	    								</div></br></br>
	    								<div class="form-group position-relative">
                                            <div class="maxl">
                                            	Selectionner votre genre :</br>
                                                <input id="validationTooltip10" type="radio" name="genre" value="Homme" required>
                                                <label class="radio inline" for="validationTooltip10"> 
                                                    <span> Homme </span> 
                                                </label></br>
                                                <input id="validationTooltip11" type="radio" name="genre" value="Femme" required>
                                                <label class="radio inline" for="validationTooltip11"> 
                                                    <span> Femme </span>
                                                </label></br>
                                                <input id="validationTooltip12" type="radio" name="genre" value="Autre" required>
                                                <label class="radio inline" for="validationTooltip12"> 
                                                    <span> Autre </span> 
                                                </label>
                                            	<div class="invalid-tooltip">
	      											"Selection" manquante.
												</div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-6 position-relative">
                                    	<div class="form-group position-relative">
                                        	<label for="validationTooltip03" class="form-label">Email</label>
                                            <input type="email" class="form-control" id="validationTooltip03" name="mail" placeholder="Votre Email" value="" required>
                                        	<div class="valid-tooltip">
	      										Validé !
	      									</div>
	      									<div class="invalid-tooltip">
	      										"Email" manquant.
	    									</div>
	    								</div></br>
	    								<div class="form-group position-relative">
                                        	<label for="validationTooltip04" class="form-label">Tel</label>
                                            <input type="tel" minlength="10" maxlength="10" name="tel" class="form-control" id="validationTooltip04" placeholder="Votre Téléphone" value="" required>
	                                        <div class="valid-tooltip">
	      										Validé !
	      									</div>
	      									<div class="invalid-tooltip">
	      										"Téléphone" manquant.
	    									</div>
	    								</div></br>
	    								<div class="form-group position-relative">
                                        	<label for="validationTooltip05" class="form-label">Adresse</label>
                                            <input type="text" class="form-control" id="validationTooltip05" name="adresse" placeholder="Votre Adresse" value="" required>
	                                        <div class="valid-tooltip">
	      										Validé !
	      									</div>
	      									<div class="invalid-tooltip">
	      										"Adresse" manquante.
	                                        </div>
	                                    </div></br>
	                                    <div class="form-group position-relative">
                                        	<label for="validationTooltip06" class="form-label">Ville</label>
                                            <input type="text" class="form-control" id="validationTooltip06" name="ville" placeholder="Votre Ville" value="" required>
	                                        <div class="valid-tooltip">
	      										Validé !
	      									</div>
	      									<div class="invalid-tooltip">
	      										"Ville" manquante.
	                                        </div>
	                                    </div></br>
	                                    <div class="form-group position-relative">
											<label for="validationTooltip07" class="form-label">CP</label>
											<input type="number" minlength="5" maxlength="5" name="cp" class="form-control" id="validationTooltip07" placeholder="Votre Code postal" value="" required>
											<div class="valid-tooltip">
	      										Validé !
	      									</div>
	      									<div class="invalid-tooltip">
	      										"Code postal" manquant.
											</div>
										</div></br>
											<input type="submit" class="btn-form btn-form-success f-right m-2p"  value="Inscription"/>
											<input type= "reset" class="btn-form btn-form-reset f-right m-2p" value = "Remettre à zéro"/>
                                    </div>
                                </div>
                                </form>
                            </div>
                                </div>
                            </div>
	</body>
 		</html>

<!-- formulaire de connexion client -->
<div class="section-form tab-pane fade show active tab-client" role="tabpanel">               
  <h3 class="register-heading">Connexion Client</h3>


  	<form class="row register-form needs-validation col-md-12" novalidate action="traiterlogin" method="POST">


        <input type="hidden" name="whois" value="client">
        <div class="form-group position-relative">
          <label for="validationTooltipClient01" class="form-label">Identifiant</label>
          <input type="text" class="form-control" id="validationTooltipClient01" name="login" placeholder="Votre Login" value="" required>
          <div class="valid-tooltip">Validé !</div>
          <div class="invalid-tooltip"> "Identifiant" manquant.</div>
        </div><br/>

        <div class="form-group position-relative">
          <label for="validationTooltipClient02" class="form-label">Mot de passe</label>
          <input type="password" class="form-control" id="validationTooltipClient02" name="motDePasse" placeholder="Votre Password" value="" required>
          <div class="valid-tooltip">Validé !</div>
          <div class="invalid-tooltip">"Mot de passe" manquant.</div>
        </div><br/>
		<div class="col-md-6"></div>
		<div class="col-md-6">
        <input type="submit" class="btn-form btn-form-success f-right m-2p" value="Se connecter"/>
        <input type="reset" class="btn-form btn-form-reset f-right m-2p" value="Remettre à zéro"/>
        </div>
  	</form>

</div>
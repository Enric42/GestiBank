<!-- formulaire de connexion administrateur -->
<div class="section-form tab-pane fade show tab-administrateur" role="tabpanel">               

  <form class="row register-form needs-validation col-md-12" novalidate action="traiterlogin" method="POST">
      <div class="text-center espace-admin">
  		<h3>Espace Administrateur <img src="css/img/admin.svg" height="80px" widht="80px" alt=""/></h3>
  	  </div>
        <input type="hidden" name="whois" value="administrateur">
        <div class="form-group position-relative">
          <label for="validationTooltipAdministrateur01" class="form-label">Identifiant</label>
          <input type="text" class="form-control" id="validationTooltipAdministrateur01" name="login" placeholder="Votre Login" value="" required>
          <div class="valid-tooltip">Valid? !</div>
          <div class="invalid-tooltip"> "Identifiant" manquant.</div>
        </div><br/>

        <div class="form-group position-relative">
          <label for="validationTooltipAdministrateur02" class="form-label">Mot de passe</label>
          <input type="password" class="form-control" id="validationTooltipAdministrateur02" name="motDePasse" placeholder="Votre Password" value="" required>
          <div class="valid-tooltip">Valid? !</div>
          <div class="invalid-tooltip">"Mot de passe" manquant.</div>
        </div><br/>
		<div class="col-md-6"></div>
		<div class="col-md-6">
        <input type="submit" class="btn-form btn-form-success f-right m-2p" value="Se connecter"/>
        <input type="reset" class="btn-form btn-form-reset f-right m-2p" value="Remettre ? z?ro"/>
        </div>
  </form>
</div>
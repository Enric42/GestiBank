import java.util.ArrayList;
import java.util.List;

public class Client extends AUtilisateur implements IEntitePhysique {

	private String nom;
	private String prenom;
	private String telephone;
	private String mail;
	private String adresse;
	private Boolean isValid;
	private ESituationMatrimuniale situationMatrimoniale;
	
	private Conseiller conseiller;
	private List<CompteBeneficiaire> comptesBenificiaires = new ArrayList<CompteBeneficiaire>();
	private List<Compte> comptes = new ArrayList<Compte>();
	
	public void effectuerVirement() {
		
	}

	public Compte consulterCompte(String rib) {
		// TODO
		return null;
	}

	private void ajouterCompteBeneficiaire(CompteBeneficiaire comtpeBeneficiaire) {
		// TODO
		
	}
	
	public void supprimerCompteBeneficiaire(String RIB) {
		// TODO
		
	}

	public void consulterComptes() {
		// TODO
		
	}

	@Override
	public void accederEspacePersonnalise() {
		// TODO Auto-generated method stub
		
	}
	
	// Getters & Setters

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public Boolean getIsValid() {
		return isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public ESituationMatrimuniale getSituationMatrimoniale() {
		return situationMatrimoniale;
	}

	public void setSituationMatrimoniale(ESituationMatrimuniale situationMatrimoniale) {
		this.situationMatrimoniale = situationMatrimoniale;
	}
	
	public List<CompteBeneficiaire> getComptesBenificiaires() {
		return comptesBenificiaires;
	}
	
	public void setComptesBenificiaires(List<CompteBeneficiaire> comptesBenificiaires) {
		this.comptesBenificiaires = comptesBenificiaires;
	}
	
	public List<Compte> getComptes() {
		return comptes;
	}
	
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
}
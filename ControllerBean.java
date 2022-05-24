package BEANS;



public class ControllerBean {
	private String nom;
	private String prénom;
	private String adresse;
	private String telephone;
	private String email;
	
	
	public ControllerBean() {
		setNom("");
		setPrénom("");
		setAdresse("");
		setTelephone("");
		setEmail("");
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrénom() {
		return prénom;
	}


	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

}

package structure;

public class Etablissement {
private int id_etablissement;
private String nom,tel,fax,adresse,raison_social;
public int getId_etablissement() {
	return id_etablissement;
}
public void setId_etablissement(int id_etablissement) {
	this.id_etablissement = id_etablissement;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getFax() {
	return fax;
}
public void setFax(String fax) {
	this.fax = fax;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getRaison_social() {
	return raison_social;
}
public void setRaison_social(String raison_social) {
	this.raison_social = raison_social;
}
public Etablissement() {
	super();
	// TODO Auto-generated constructor stub
}



}

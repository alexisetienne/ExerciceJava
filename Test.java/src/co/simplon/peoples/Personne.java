package co.simplon.peoples;

public class Personne {
private String nom;
private String prenom;
private int age;
private String adresse;

       



public Personne(String nom , String prenom, int age, String adresse) {
	   this.nom = nom;
	   this.prenom = prenom;
	   this.age = age;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public String toString(){
	return nom+" "+prenom+" a "+age+" et habite "+adresse;
}
}

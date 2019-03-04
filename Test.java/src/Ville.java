
public class Ville {
 private String nom;
 private String pays;
 private int nbhabitant;
 private static int nbrinstances = 0;
 

public Ville(String nom, String pays , int nbhabitant) {
	this.nom = nom ;
	this.pays = pays; 
	this.nbhabitant = nbhabitant ;
	nbrinstances++;
}
public Ville() {
	this.nom = "" ;
	this.pays = ""; 
	this.nbhabitant = 0 ;
}
public static int getnbrinstances()
{
  return nbrinstances;
} 

public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPays() {
	return pays;
}
public void setPays(String nom) {
	this.pays = pays;
}
public int getNbhabitant() {
	return nbhabitant;
}
public void setNbhabitant(int nbhabitants) {
	this.nbhabitant = nbhabitant;
}
public String  toString() {
	return nom+pays+nbhabitant+" habitants ";
}
}
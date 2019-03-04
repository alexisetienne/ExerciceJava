package co.simplon.towns;

public class  Ville {
	private String nom;
	private String pays;
	private int nbhabitant;


	public Ville(String nom, String pays , int nbhabitant) {
		this.nom = nom ;
		this.pays = pays; 
		this.nbhabitant = nbhabitant ;
	}
	public Ville() {
		this.nom = "" ;
		this.pays = ""; 
		this.nbhabitant = 0 ;
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
		return "la ville de "+nom+" est en "+pays+" et compte "+nbhabitant+" habitants ";
	}
}
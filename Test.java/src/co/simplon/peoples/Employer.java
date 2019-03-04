package co.simplon.peoples;

public class Employer extends Personne {
	private int salaire ; 
	
	public Employer(String nom, String prenom, int age, String adresse,int salaire) {
		
		super(nom,prenom,age,adresse);
		this.salaire = salaire;
	}
	public Employer() {
		super("","",0,"");
		this.salaire = 0;
	}
	
public String toString() {
	String str = super.toString();
	return str + salaire;
}

}

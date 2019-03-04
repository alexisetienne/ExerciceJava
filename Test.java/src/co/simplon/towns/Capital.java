package co.simplon.towns;

public class Capital extends Ville {
	
	private String monument; 

	public Capital(String nom, String pays , int nbhabitant,String monument) {
		super(nom,pays,nbhabitant);
		this.monument = monument;

	}
	public Capital() {
		super();
		this.monument = "aucun";
	}
	
	public String getMonument() {
		return monument;
	}

	public void setMonument(String monument) {
		this.monument = monument;
	}
	
	public String toString(){
		String str = super.toString()+monument;
		return str;
	}
}

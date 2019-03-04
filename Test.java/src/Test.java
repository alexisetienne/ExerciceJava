
public class Test {


	public static void main(String[] args) {
		System.out.println("nb d'objets : "+Ville.getnbrinstances());
		
		Ville v1 = new Ville ("TOULOUSE","FRANCE",500000);
		System.out.println(v1.getNom());
		v1.setNom("muret");
		System.out.println(v1.getNom());

		Ville v2 = new Ville ("PARIS","FRANCE",10000000);
		Ville v3 = new Ville ("MONACO","FRANCE",10000);
		v1.display();
		
		System.out.println(" nb d'objets : " + v1.getnbrinstances());

	}


}
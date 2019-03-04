import java.util.Scanner;
public class Chaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String mot3 = "";
    String chain = "il fait beau aujourd'hui ";
    Scanner scan = new Scanner(System.in);
    System.out.println("quel mots chercher vous ?");
    String mot = scan.nextLine();
    if ( chain.contains(mot)) {
    	System.out.println("trouver");
    	System.out.println("par quel mots voulez vous le remplacer?");
    	String mot2 = scan.nextLine();
    	chain = chain.replace(mot, mot2);
    	System.out.println(chain);
    
    }
    else {
    	System.out.println("introuvable");
    }
	}

}

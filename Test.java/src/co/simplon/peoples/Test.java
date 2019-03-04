package co.simplon.peoples;
import java.util.ArrayList;
import java.util.Arrays;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employer e1 = new Employer("nom ", "prenom", 20, "adresse", 2000);
     Employer e2 = new Employer("nom ", "prenom", 20, "adresse", 2000);
     Employer e3 = new Employer("nom ", "prenom", 20, "adresse", 2000);
     Employer e4 = new Employer("nom ", "prenom", 20, "adresse", 2000);
     Employer e5 = new Employer("nom ", "prenom", 20, "adresse", 2000);
     Employer e6 = new Employer("nom ", "prenom", 20, "adresse", 2000);
     Employer e7 = new Employer("nom ", "prenom", 20, "adresse", 2000);
     Employer e8 = new Employer("nom ", "prenom", 20, "adresse", 2000);
     Employer e9 = new Employer("nom ", "prenom", 20, "adresse", 2000);
     Employer e10 = new Employer("nom ", "prenom", 20, "adresse", 2000);
     Employer[] tab;
     tab = new Employer[10];
     tab[0] = new Employer("nom ", "prenom", 20, "adresse", 2000);
     tab[1] = new Employer("nom ", "prenom", 20, "adresse", 2000);
     tab[2] = new Employer("nom ", "prenom", 20, "adresse", 2000);
     tab[3] = new Employer("nom ", "prenom", 20, "adresse", 2000);
     tab[4] = new Employer("nom ", "prenom", 20, "adresse", 2000);
     tab[5] = new Employer("nom ", "prenom", 20, "adresse", 2000);
     tab[8] = new Employer("nom ", "prenom", 20, "adresse", 2000);
     tab[6] = new Employer("nom ", "prenom", 20, "adresse", 2000);
     tab[7] = new Employer("nom ", "prenom", 20, "adresse", 2000);
     tab[9] = new Employer("nom ", "prenom", 20, "adresse", 2000);
    
     for (int i = 0 ; i < tab.length ; i++) {
    	System.out.println(tab[i]);
     }
    ArrayList<Object> objet = new ArrayList<Object>();
    for (int x = 0 ; x < tab.length ; x++) {
    	objet.add(tab[x]);
    }
    
     System.out.println(objet);
	}
	

}

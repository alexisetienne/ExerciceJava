import java.util.Arrays;
import java.util.Scanner;
public class Garage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan = new Scanner(System.in);
   System.out.println("combien de voiture voulez vous ajouter ?");
   int nbCar = scan.nextInt();
   int[] nbrV = new int[nbCar];
   String[] car = new String[nbCar];
   for (int i=0; i<nbCar ; i++) {
   Scanner scan2 = new Scanner(System.in);
   System.out.println("entrez un vehicule");
   String addCar = scan2.nextLine();
   car[i] = addCar ;
   System.out.println(car[i]);
   }
  System.out.println(Arrays.toString(car));
  Scanner scan3 = new Scanner(System.in);
  System.out.println("quelle vehicules voulez vous supprimer ?");
  String delete = scan.nextLine();
  
	}

}

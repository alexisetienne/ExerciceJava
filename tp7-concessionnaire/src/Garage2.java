import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Garage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    System.out.println("combien de voiture voulez vous ajouter ?");
    int nbCar = scan.nextInt();
    int[] nbrV = new int[nbCar];
    ArrayList car = new ArrayList();
    
    for (int i = 0 ; i < nbrV.length ; i++) {
    	
       Scanner scan2 = new Scanner(System.in);
       System.out.println("entrez la voiture ");
       String nameCar = scan2.nextLine(); 
       car.add(nameCar);
    }
    Scanner scan3 = new Scanner(System.in);
    System.out.println("how much car do you want delete ?");
    int delete = scan3.nextInt();
    
    for ( int x = 0 ; x < delete ; x ++) {
    	Scanner scan4 = new Scanner(System.in);
    	System.out.println("enter car name to delete ");
    	String carDelete = scan4.nextLine();
    	
    	for ( int y = 0 ; y < car.size() ; y++) {
    	if (carDelete == car.get(y) ); {
    		car.remove(y);
         }
       }
    System.out.println(car);
	}
	}



}
	

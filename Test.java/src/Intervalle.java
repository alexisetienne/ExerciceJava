import java.util.Scanner;

public class Intervalle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner scan = new Scanner(System.in);

		    System.out.println("entrer le debut de l'intervalle : ");
		    int deb = scan.nextInt();
		    //System.out.println(deb));

		    //Scanner scan2 = new Scanner(System.in);
		    
            System.out.println("entrer la fin de l'intervalle : ");
		    int fin = scan.nextInt();
		    //System.out.println(numero2);
		
		    int moitie = (deb+fin)/2; 

		    for (int i = deb; i<= fin; i++) {
                     if (i == moitie) {
                    	 System.out.println("moitie");
                     }
                     else {
                         System.out.println(i);
                     }
            }
	}
}

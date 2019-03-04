import java.util.Scanner;
public class Tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);

		    System.out.println("combien de notes a cette éléves ? ");
		    int deb = scan.nextInt();
		    System.out.println(deb);
		    for (int i= 1; i< deb;i++) {
		    	
		    }
		    
		  
		    
		int notes[] = {5,10,15,2,20,1};
		int max = notes[0];
		int min = notes[0];
		
		for (int i=1; i<notes.length ; i++){
			if(notes[i]< min)	min = notes[i];		
			if(notes[i]>max)  max = notes[i];
			
	        
		}		
		System.out.println("note la plus petite est "+min);
		System.out.println("note la plus haute est "+max);
		
		int resultat = 0;
		for (int i = 0; i<notes.length; i++) {
			
		resultat = resultat + notes[i];
		}
		System.out.println(resultat/notes.length);
	}
	

}

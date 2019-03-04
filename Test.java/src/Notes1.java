import java.util.Scanner;
import java.util.Arrays;

public class Notes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String student[] = {"raymond","patrick","maurice"};
		int moyenne = 0;
		String name = "rien";
		for (int i=0;i<student.length;i++) {
			
			Scanner scan = new Scanner(System.in);

		    System.out.println("combien de notes a "+ student[i]);
		    int numberNote = scan.nextInt();
		    int note[]= new int [numberNote];
		    
			for(int x=0; x<numberNote;x++) {   
				
				Scanner scan1 = new Scanner(System.in);
			    System.out.println("entre la note "+ (x+1));
			    note[x] = scan.nextInt(); 
			    moyenne =moyenne + note[x];
			  
			
			 }
			
			    System.out.println("moyenne = " + moyenne/note.length);
			    moyenne = 0;
			
		
		}
		Scanner scan2 =new Scanner(System.in);
        System.out.println("quelles éléves voulez vous chercher ?");
         String wantedElements = scan2.nextLine();
		      
         boolean found = Arrays.stream(student).anyMatch(t -> t.equals(wantedElements));

         if(found) {
            System.out.println(wantedElements + " fait bien partie de mes éléves");
         }
         else
            System.out.println(wantedElements+ " 2"
            		+ "ne fait pas partie de mes eléves");
		    	
	}
}

		


import java.util.Scanner;
public class operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operateurs[] = {'+','-','/','%','*'};
		char calcul = '+';
      Scanner scan = new Scanner(System.in);
      
        System.out.println("entre un numero");
		    int numberNote = scan.nextInt();
		System.out.println("entre un numero");
		    int numberNote2 = scan.nextInt();
		   
		/*System.out.println("quel operateur voulez vous utiliser");
		char operateursS = scan.next().charAt(0);
		    for (int i =0;i<operateurs.length;i++) {
		    	 
		      if (operateurs[i] == operateursS) {
		    	  //System.out.println(operateurs[i] + operateurs[i]);
		    	  
		    	  switch()
		    	  int resultat = numberNote 
		    	  System.out.println(numberNote+operateurs[i]+numberNote2);
		      }
		    }*/
	        System.out.println("quel operateur voulez vous utiliser");
		    char operateursS = scan.next().charAt(0);
		    
		    if (operateursS == operateurs[0]) {
		     System.out.println(numberNote+numberNote2);
		    }
		    else if (operateursS == operateurs[1]) {
			     System.out.println(numberNote-numberNote2);
			    }
		    else if (operateursS == operateurs[2]) {
			     System.out.println(numberNote/numberNote2);
			    }
		    else if (operateursS == operateurs[3]) {
			     System.out.println(numberNote%numberNote2);
			    }
		    else if (operateursS == operateurs[4]) {
			     System.out.println(numberNote*numberNote2);
			    }

	   
	} 
}
	



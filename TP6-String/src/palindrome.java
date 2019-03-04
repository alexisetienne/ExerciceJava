
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String mot1 = "akka";
  String mot2 = "otto";
  
  int left = 0;
  int rigth = mot1.length() -1;
  boolean palindrome = true ; 
  while ((left<rigth)&& palindrome) {
	  if (mot1.charAt(left) != mot1.charAt(rigth)) {
		  palindrome = false; 
	  }
	  left++;
	  rigth--;
  }
  if (palindrome) {
	  System.out.println("c'est un palindrome");
  }
  else {
	  System.out.println("ce n'est pas un palindrome");
  }
  
  String phrase = "Elu par cette crapule";
  String palin = phrase.toLowerCase();
  String alpha = "abcdefghijklmnopqrstuvwxyz";
  String space = "";
  for (int i = 0; i<palin.length();i++) {
	  char x = palin.charAt(i);
	  if (alpha.indexOf(x) != -1) {
		  space += x; 
	  }
  }
  palin = space; 
  int left2 = 1;
  int rigth2 = palin.length() -1;
  boolean vrai = true ; 
  while ((left2<rigth2)&& vrai) {
	  if (palin.charAt(left2)!= palin.charAt(rigth2)) {
		  vrai = false;
	  }
	  if (vrai) {
		  System.out.println("c'est un palindrome");
	  }
	  else {
		  System.out.println("ce n'est pas un palindrome");
	  }
  }
  
  
  
  
	}

}

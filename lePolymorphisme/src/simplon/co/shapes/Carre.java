package simplon.co.shapes;

public class Carre {
 private double longueur;
 
 public Carre(double longueur) {
	 this.longueur = longueur ; 
 }
 public Carre() {
	 this.longueur = 5; 
 }
 public double getLongueur(){
	 return longueur; 
 }
 
 public void setLongueur(double longueur) {
	 this.longueur = longueur; 
}
 public void display() {
	 System.out.println("l'air de mon carré est :"+(longueur*longueur));
 }
}
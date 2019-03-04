package simplon.co.shapes;

public class Cercle {
 private double rayon ;
 
 public Cercle(double rayon ) {
	 this.rayon = rayon ; 
	 }
 public Cercle() {
	 this.rayon = 0; 
 }
 public double getRayon() {
	 return rayon;
 }
 public void setRayon(double rayon ) {
	 this.rayon = rayon ;
 }
 public void display() {
	 System.out.println("l'air de mon cercle : "+Math.PI*rayon * rayon);
	 
 }
}

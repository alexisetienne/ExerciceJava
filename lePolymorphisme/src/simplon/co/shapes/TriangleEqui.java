package simplon.co.shapes;

public class TriangleEqui {
	private double equi ; 
	
public TriangleEqui(double equi ) {
	this.equi = equi ; 
}
public TriangleEqui() {
	this.equi =  0 ; 
}
public double getEqui() {
	return equi ; 
}
public void setEqui(double equi ) {
	this.equi = equi ;
}
public void display() {
	System.out.println("aire de mon triangle : "+Math.sqrt(3)*(equi*equi)/4);
}

}

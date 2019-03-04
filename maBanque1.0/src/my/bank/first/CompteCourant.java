package my.bank.first;

public class CompteCourant extends Comptes {

	private double decouvert ; 
	
public CompteCourant(int date , double solde , int code,double decouvert) {
	super(date, solde, code);
	this.decouvert = decouvert; 
}

public double getDecouvert() {
	return decouvert;
}

public void setDecouvert(double decouvert) {
	this.decouvert = decouvert;
}
}

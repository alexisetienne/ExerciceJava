package my.bank.first;

public class CompteEpargne extends Comptes{
	
	private double interest ; 
	
public CompteEpargne(int date , double solde , int code, double interest) {
	super(date,solde,code);
	this.interest =interest; 
}

public double getInterest() {
	return interest;
}

public void setInterest(double interest) {
	this.interest = interest;
}
}

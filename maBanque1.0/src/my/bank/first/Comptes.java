package my.bank.first;


public abstract class Comptes {
	
	private int date ;
	private double solde ; 
	private int code ;
	
public Comptes() {
	
}

public Comptes(int date , double solde , int code) {
	
	this.date = date ; 
	this.solde = solde ; 
	this.code = code ; 
}

public int getDate() {
	return date;
}

public void setDate(int date) {
	this.date = date;
}

public double getSolde() {
	return solde;
}

public void setSolde(double solde) {
	this.solde = solde;
}

public int getCode() {
	return code;
}

public void setCode(int code) {
	this.code = code;
}

}

package myPackage;

public class Compte
{
	private double solde;
	
	public Compte() //constructeur du compte bancaire
	{
		solde = 0;
	}
	
	public double getSolde() //renvoie le solde du compte
	{
		return solde;
	}
	
	public void deposer(double somme) //déposer de l'argent sur le compte
	{
		solde += somme;
	}
}
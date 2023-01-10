package myPackage;

public class Compte
{
	private double solde;
	
	public Compte()
	{
		solde = 0;
	}
	
	public double getSolde()
	{
		return solde;
	}
	
	public void deposer(double somme)
	{
		solde += somme;
	}
}
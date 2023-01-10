package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.DossierBancaire;

public class TestsSuite
{
	@Test  
	public void test1() 
	{
		DossierBancaire dossier = new DossierBancaire();
		dossier.deposer(100);
		assertEquals(100, dossier.get_solde(), 0);
	}
	
	@Test  
	public void test2() 
	{
		DossierBancaire dossier = new DossierBancaire();
		dossier.deposer(42);
		assertEquals(42, dossier.getCompteCourant().getSolde(), 0);		
	}
}
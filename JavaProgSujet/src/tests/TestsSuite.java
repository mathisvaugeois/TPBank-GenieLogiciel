package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.DossierBancaire;

public class TestsSuite
{
	@Test  
	public void test1() //test initial
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
		assertEquals(16.8, dossier.getCompteCourant().getSolde(), 0);		
	}
	
	@Test  
	public void test3() 
	{
		DossierBancaire dossier = new DossierBancaire();
		dossier.deposer(100);
		assertEquals(60, dossier.getCompteEpargne().getSolde(), 0);	
		dossier.remunerer();
		assertEquals(61.92, dossier.getCompteEpargne().getSolde(), 0);	
	}
	
	@Test  
	public void test4()
	{
		DossierBancaire dossier = new DossierBancaire();
		dossier.deposer(100);
		dossier.retrait(30);
		assertEquals(10, dossier.getCompteCourant().getSolde(), 0);
	}
}
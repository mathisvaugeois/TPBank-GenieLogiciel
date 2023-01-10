package myPackage;

public class DossierBancaire
{	
	private double m_solde;
	private Compte _compteCourant;
	private Compte _compteEpargne;
	
    public DossierBancaire()
    {
    	m_solde=0;
    	_compteCourant = new Compte();
    	_compteEpargne = new Compte();
    }

    public void deposer(double somme)
    {
    	m_solde += somme;
    	_compteCourant.deposer(0.4 * somme);
    	_compteEpargne.deposer(0.6 * somme);
    }
    
    public double get_solde()
    {
    	return m_solde = _compteCourant.getSolde() + _compteEpargne.getSolde();
    }
    
    public Compte getCompteCourant()
    {
    	return _compteCourant;
    }
    
    public Compte getCompteEpargne()
    {
    	return _compteEpargne;
    }
    
    public void remunerer()
    {
    	double somme = _compteEpargne.getSolde();
    	somme = 0.032 * somme;
    	_compteEpargne.deposer(somme);
    }
}
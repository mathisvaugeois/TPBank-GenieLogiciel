package myPackage;

public class DossierBancaire
{	
	private double m_solde;
	private Compte _compteCourant;
	private Compte _compteEpargne;
	
    public DossierBancaire()
    {
    	m_solde=0;
    	Compte _compteCourant = new Compte();
    	Compte _compteEpargne = new Compte();
    }

    public void deposer(double argent)
    {
    	m_solde += argent;
    	_compteCourant.deposer(argent);
    }
    
    public double get_solde()
    {
    	return m_solde;
    }
    
    public Compte getCompteCourant()
    {
    	return _compteCourant;
    }
    
    public void remunerer()
    {
    	
    }
}
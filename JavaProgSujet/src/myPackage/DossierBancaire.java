package myPackage;

public class DossierBancaire
{	
	private double m_solde;
	private Compte _compteCourant;
	private Compte _compteEpargne;
	
    public DossierBancaire()
    {
    	m_solde=0;
    }

    public void deposer(double value)
    {
    	m_solde+=value;
    }
    
    public double get_solde()
    {
    	return m_solde;
    }
    
    public void remunerer()
    {
    	
    }
}
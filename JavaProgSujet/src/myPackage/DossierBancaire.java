package myPackage;

public class DossierBancaire
{	
	private double m_solde; //solde général des deux comptes bancaires
	private Compte _compteCourant; //Element de la classe Compte
	private Compte _compteEpargne; //Si on en veut plusieurs on peut facilement passé sa en liste et modifier les fonctions
	
    public DossierBancaire() //constructeur du dossier bancaire
    {
    	m_solde=0;
    	_compteCourant = new Compte(); //Creation d'un compte
    	_compteEpargne = new Compte();
    }

    public void deposer(double somme) //d�poser de l'argent sur les deux comptes courant et �pargne
    {
    	m_solde += somme;
    	_compteCourant.deposer(0.4 * somme);
    	_compteEpargne.deposer(0.6 * somme);
    }
    
    public double get_solde() //renvoie le solde du dossier
    {
    	return m_solde = _compteCourant.getSolde() + _compteEpargne.getSolde();
    }
    
    public Compte getCompteCourant() //renvoie le compte courant
    {
    	return _compteCourant;
    }
    
    public Compte getCompteEpargne() //renvoie le compte �pargne
    {
    	return _compteEpargne;
    }
    
    public void remunerer() //verser les int�r�ts sur le compte �pargne
    {
    	double somme = _compteEpargne.getSolde();
    	somme = 0.032 * somme;
    	_compteEpargne.deposer(somme);
    }
    
    public void retrait(double somme)
    {
    	double current_value = _compteCourant.getSolde();
    	if(somme <= current_value)
    	{
    		//OK POUR LE RETRAIT
    		_compteCourant.deposer(-somme);    		
    	}
    	else
    	{
    		//PAS OK POUR LE RETRAIT
    		//SEND ERREUR
    		System.out.println("Solde insuffisant");
    	}
    }
}
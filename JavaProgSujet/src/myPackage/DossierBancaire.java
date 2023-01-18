package myPackage;

public class DossierBancaire
{	
	private double m_solde; //solde général des deux comptes bancaires
	private Compte _compteCourant; //Element de la classe Compte
	private Compte _compteEpargne; //Si on en veut plusieurs on peut facilement passé sa en liste et modifier les fonctions
	
    public DossierBancaire() //constructeur du dossier bancaire
    {
    	m_solde = 0;
    	_compteCourant = new Compte(); //Creation d'un compte
    	_compteEpargne = new Compte();
    }

    public void deposer(double somme) //déposer de l'argent sur les deux comptes courant et épargne
    {
    	m_solde += somme;
    	_compteCourant.deposer(0.4 * somme); //Depose 40% de la somme
    	_compteEpargne.deposer(0.6 * somme); //Depose 60% de la somme
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
    
    public void remunerer() //verser les intérêts sur le compte épargne
    {
    	double somme = _compteEpargne.getSolde(); //Recupere le solde actuelle
    	somme = 0.032 * somme; //Fait le calcul
    	_compteEpargne.deposer(somme); //Mise a jour le solde
    }
    
    public void retrait(double somme)
    {
    	double current_value = _compteCourant.getSolde(); //Recupere le solde
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
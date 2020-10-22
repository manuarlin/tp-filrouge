package com.filrouge;

public class OperationVente implements Operation {
	
	private Produit codeProduit;
	private int montant;
	
	public Produit getCodeProduit() {
		return codeProduit;
	}

	public void setCodeProduit(Produit codeProduit) {
		this.codeProduit = codeProduit;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	//Constructeur qui prend deux params
	public OperationVente(Produit unCode,int unMontant) {
		this.codeProduit=unCode;
		this.montant=unMontant;
	}
	
	public OperationVente() {
		this.codeProduit=Produit.UNDEFINED;
		this.montant=0;
	}
	
	public void afficher() {
		System.out.println("Vente du produit "+codeProduit.toString()+" pour un montant de "+montant);
	}
	
	

}

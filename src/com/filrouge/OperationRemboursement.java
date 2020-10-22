package com.filrouge;

public class OperationRemboursement implements Operation{
	
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
	public OperationRemboursement(Produit unCode,int unMontant) {
		this.codeProduit=unCode;
		this.montant=unMontant;
	}

	@Override
	public void afficher() {
		System.out.println("Remboursement du produit "+codeProduit.toString()+" pour un montant de "+montant);
	}

}

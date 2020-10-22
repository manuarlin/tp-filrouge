package com.filrouge;

public class Lanceur {

	public static void main(String[] args) {
		
		
		System.out.println("Hello, bienvenue sur la caisse Robotonik 2.0");
		CaisseEnregistreuse caisse = new CaisseEnregistreuse();
		System.out.println("Le montant de la caisse est "+caisse.getMontantTotal());
		// on active notre caisse
		caisse.activation();
		//on créer une opération
		OperationVente operation = new OperationVente(Produit.MARS,100);
		caisse.encaisser(operation);	
		System.out.println("Le montant de la caisse est "+caisse.getMontantTotal());
		OperationRemboursement operation2 = new OperationRemboursement(Produit.MARS,-100);
		caisse.encaisser(operation2);
		


		System.out.println("Le montant de la caisse est "+caisse.getMontantTotal());
		
				
	
	}

}

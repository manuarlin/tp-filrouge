package com.filrouge.etape6;

public class OperationRemboursement extends Operation {

    public OperationRemboursement(Produit produit, int montant) {
        super(produit, -montant);
    }

    @Override
    public void afficher() {
        System.out.println("Remboursement du produit " + getProduit().toString() + " pour un montant de " + getMontant());
    }

}

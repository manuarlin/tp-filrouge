package com.filrouge.etape7;

public class OperationVente implements Operation {

    private final Produit produit;
    private final int montant;

    public Produit getProduit() {
        return produit;
    }

    @Override
    public int getMontant() {
        return montant;
    }

    public OperationVente(Produit produit, int montant) {
        this.produit = produit;
        this.montant = montant;
    }

    @Override
    public void afficher() {
        System.out.println("Vente du produit " + produit.toString() + " pour un montant de " + montant);
    }


}

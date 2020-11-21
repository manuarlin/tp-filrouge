package com.filrouge.etape5;

public class Operation {

    private final Produit produit;
    private final int montant;

    public Produit getProduit() {
        return produit;
    }

    public int getMontant() {
        return montant;
    }

    public Operation(Produit produit, int montant) {
        this.produit = produit;
        this.montant = montant;
    }

    public void afficher() {
        System.out.println("Vente du produit " + produit.toString() + " pour un montant de " + montant);
    }


}

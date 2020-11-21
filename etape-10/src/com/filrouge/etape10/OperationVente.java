package com.filrouge.etape10;

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
        if (!isMontantCorrect(montant)) {
            throw new OperationIllegaleException("Le montant pour une vente doit être positif");
        }
        this.montant = montant;
    }

    @Override
    public String afficher() {
        return "Vente du produit " + produit.toString() + " pour un montant de " + montant;
    }

    private boolean isMontantCorrect(int montant) {
        return montant > 0;
    }


}

package com.filrouge.etape9;

public class OperationRemboursement implements Operation {

    private final Produit produit;
    private final int montant;

    public Produit getProduit() {
        return produit;
    }

    @Override
    public int getMontant() {
        return montant;
    }

    public OperationRemboursement(Produit produit, int montant) {
        this.produit = produit;
        if (!isMontantCorrect(montant)) {
            throw new OperationIllegaleException("Le montant pour un remboursement doit être négatif");
        }
        this.montant = montant;
    }

    @Override
    public void afficher() {
        System.out.println("Remboursement du produit " + getProduit().toString() + " pour un montant de " + getMontant());
    }

    private boolean isMontantCorrect(int montant) {
        return montant < 0;
    }

}

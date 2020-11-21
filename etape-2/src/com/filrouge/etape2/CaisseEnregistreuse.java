package com.filrouge.etape2;

public class CaisseEnregistreuse {

    private int montantTotal;

    public int getMontant() {
        return this.montantTotal;
    }

    public void encaisser(int montant) {
        montantTotal += montant;
    }

}

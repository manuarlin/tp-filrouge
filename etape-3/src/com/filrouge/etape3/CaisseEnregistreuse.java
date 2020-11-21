package com.filrouge.etape3;

public class CaisseEnregistreuse {

    private int montantTotal;
    private boolean isActive;

    public void activation() {
        isActive = true;
    }


    public int getMontant() {
        return this.montantTotal;
    }

    public void encaisser(int montant) {
        if (isActive) {
            montantTotal += montant;
        }
    }

}

package com.filrouge.etape6;

public class CaisseEnregistreuse {

    private int montantTotal;
    private boolean isActive;

    public void activation() {
        isActive = true;
    }


    public int getMontant() {
        return this.montantTotal;
    }

    public void encaisser(Operation operation) {
        if (isActive) {
            operation.afficher();
            montantTotal += operation.getMontant();
        }
    }

}

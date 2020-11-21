package com.filrouge.etape5;

public class Lanceur {

    public static void main(String[] args) {
        System.out.println("Hello, bienvenue sur la caisse Robotonik 2.0");

        CaisseEnregistreuse maCaisse = new CaisseEnregistreuse();
        System.out.println(maCaisse.getMontant());
        maCaisse.activation();
        Operation operationMars = new Operation(Produit.MARS, 10);
        maCaisse.encaisser(operationMars);
        Operation operationTwix = new Operation(Produit.TWIX, 20);
        maCaisse.encaisser(operationTwix);
        System.out.println(maCaisse.getMontant());
    }

}

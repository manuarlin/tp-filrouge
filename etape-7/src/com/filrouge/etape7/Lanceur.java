package com.filrouge.etape7;

public class Lanceur {

    public static void main(String[] args) {
        System.out.println("Hello, bienvenue sur la caisse Robotonik 2.0");

        CaisseEnregistreuse maCaisse = new CaisseEnregistreuse();
        System.out.println(maCaisse.getMontant());
        maCaisse.activation();
        Operation operationVenteMars = new OperationVente(Produit.MARS, 10);
        maCaisse.encaisser(operationVenteMars);
        Operation operationVenteTwix = new OperationRemboursement(Produit.TWIX, 20);
        maCaisse.encaisser(operationVenteTwix);
        System.out.println(maCaisse.getMontant());
    }

}

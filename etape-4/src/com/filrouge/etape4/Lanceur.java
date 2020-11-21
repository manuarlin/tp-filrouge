package com.filrouge.etape4;

public class Lanceur {

    public static void main(String[] args) {
        System.out.println("Hello, bienvenue sur la caisse Robotonik 2.0");

        CaisseEnregistreuse maCaisse = new CaisseEnregistreuse();
        System.out.println(maCaisse.getMontant());
        maCaisse.activation();
        for (int i = 0; i < 100; i++) {
            maCaisse.encaisser(10);
        }
        System.out.println(maCaisse.getMontant());
    }

}

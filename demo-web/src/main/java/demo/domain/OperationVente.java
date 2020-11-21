package demo.domain;

import javax.persistence.Entity;

@Entity
public class OperationVente extends Operation {

    public OperationVente() {
    }

    public OperationVente(Produit produit, int montant) {
        setProduit(produit);
        setMontant(montant);
    }

    @Override
    public String afficher() {
        return "Vente du produit " + produit.toString() + " pour un montant de " + montant;
    }

    @Override
    public boolean isMontantCorrect(int montant) {
        return montant > 0;
    }
}

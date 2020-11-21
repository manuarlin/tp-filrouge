package demo.domain;

import javax.persistence.Entity;

@Entity
public class OperationRemboursement extends Operation {

    public OperationRemboursement() {
    }

    public OperationRemboursement(Produit produit, int montant) {
        setProduit(produit);
        setMontant(montant);
    }

    @Override
    public String afficher() {
        return "Remboursement du produit " + getProduit().toString() + " pour un montant de " + getMontant();
    }

    @Override
    public boolean isMontantCorrect(int montant) {
        return montant < 0;
    }

}

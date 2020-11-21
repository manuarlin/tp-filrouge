package demo.web;

import demo.domain.Produit;
import demo.domain.TypeOperation;

public class OperationDTO {

    private Produit produit;
    private int montant;
    private TypeOperation type;

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public TypeOperation getType() {
        return type;
    }

    public void setType(TypeOperation type) {
        this.type = type;
    }
}

package demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Operation {

    @Id
    @GeneratedValue
    private Long id;
    protected Produit produit;
    protected int montant;

    abstract String afficher();

    abstract boolean isMontantCorrect(int montant);

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
        if (!isMontantCorrect(montant)) {
            throw new OperationIllegaleException();
        }
        this.montant = montant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

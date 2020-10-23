package demo.domain;



public class OperationVente implements Operation{
	
	private int montant;
	private String productId;
	

	public OperationVente(int montant, String productId) {
		this.montant = montant;
		this.productId = productId;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public void setMontant(int montant) {
		this.montant = montant;
	}


	public int getMontant() {
		return montant;
	}

}

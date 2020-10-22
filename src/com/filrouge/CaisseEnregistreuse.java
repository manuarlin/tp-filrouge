package com.filrouge;

public class CaisseEnregistreuse {

	private int montantTotal;

	private boolean isActive;

	public int getMontantTotal() {
		return this.montantTotal;
	}
	
	public void activation() {
		isActive=true;
	}

	public void encaisser(Operation operation) {
		if (isActive) {
			montantTotal += operation.getMontant();
		}
		operation.afficher();
	}

	public void retirer(int i) {
		montantTotal-=i;
		
	}

}

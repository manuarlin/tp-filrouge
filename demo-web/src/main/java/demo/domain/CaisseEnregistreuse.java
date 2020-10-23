package demo.domain;

import java.util.ArrayList;
import java.util.List;

public class CaisseEnregistreuse {

	public List<Operation> operations = new ArrayList<>();

	private boolean isActive;

	public int getMontantTotal() {
		return operations.stream()
				.map(Operation::getMontant)
				.reduce(0,Integer::sum);
	}
	
	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void activation() {
		isActive=true;
	}

	public void encaisser(Operation operation) {
		if (isActive) {
			operations.add(operation);
		}
	
	}

}

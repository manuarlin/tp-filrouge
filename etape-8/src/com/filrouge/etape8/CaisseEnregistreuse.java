package com.filrouge.etape8;

import java.util.ArrayList;
import java.util.List;

public class CaisseEnregistreuse {

    private boolean isActive;
    private final List<Operation> operations = new ArrayList<>();

    public void activation() {
        isActive = true;
    }

    public int getMontant() {
        return operations.stream()
                .mapToInt(Operation::getMontant)
                .sum();
    }

    public void encaisser(Operation operation) {
        if (isActive) {
            operation.afficher();
            operations.add(operation);
        }
    }

    public void afficherOperations() {
        operations.forEach(Operation::afficher);
    }

}

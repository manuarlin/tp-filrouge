package com.filrouge.etape10;

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
            operations.add(operation);
        }
    }

    public List<Operation> getOperations() {
        return operations;
    }
}

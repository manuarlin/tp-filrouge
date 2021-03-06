package demo.domain;

import demo.repositories.OperationRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CaisseEnregistreuse {

    private boolean isActive;
    private final List<Operation> operations = new ArrayList<>();

    private final OperationRepository operationRepository;

    public CaisseEnregistreuse(OperationRepository operationRepository) {
        this.operationRepository = operationRepository;
    }

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
            operationRepository.save(operation);
        }
    }

    public List<Operation> getOperations() {
        return operations;
    }
}

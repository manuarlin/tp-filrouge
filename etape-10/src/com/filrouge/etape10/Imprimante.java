package com.filrouge.etape10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Imprimante {

    void imprimer(List<Operation> operations) {
        List<String> lignesAImprimer = operations.stream()
                .map(Operation::afficher)
                .collect(Collectors.toList());
        try {
            Files.write(Paths.get("operations.txt"), lignesAImprimer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

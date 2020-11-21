package demo.domain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Imprimante {

    void imprimer(List<Operation> operations) {
        String contenuAImprimer = operations.stream()
                .map(Operation::afficher)
                .collect(Collectors.joining("\n"));
        try {
            Files.writeString(Paths.get("operations.txt"), contenuAImprimer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

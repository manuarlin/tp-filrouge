package demo.web;

import demo.domain.CaisseEnregistreuse;
import demo.domain.Operation;
import demo.domain.OperationRemboursement;
import demo.domain.OperationVente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/caisse")
public class CaisseController {

    private static final Logger LOG = LoggerFactory.getLogger(CaisseController.class);

    private final CaisseEnregistreuse caisse;

    public CaisseController(CaisseEnregistreuse caisse) {
        this.caisse = caisse;
    }

    @PutMapping("/activer")
    public void activer() {
        caisse.activation();
    }


    @PostMapping("/encaisser")
    public void encaisser(@RequestBody OperationDTO operationDTO) {

        LOG.info("Encaissement d'une opération");

        Operation operation = switch (operationDTO.getType()) {
            case VENTE -> new OperationVente(operationDTO.getProduit(), operationDTO.getMontant());
            case REMBOURSEMENT -> new OperationRemboursement(operationDTO.getProduit(), operationDTO.getMontant());
        };

        caisse.encaisser(operation);
    }

    @GetMapping("/montant")
    public int getMontant() {
        return caisse.getMontant();
    }

}

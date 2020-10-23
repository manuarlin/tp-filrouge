package demo.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.domain.CaisseEnregistreuse;
import demo.domain.Operation;
import demo.domain.OperationVente;

@RestController
@RequestMapping("/caisse")
public class WebController {
	
	Logger log = LoggerFactory.getLogger(WebController.class);

	
	CaisseEnregistreuse caisse;
	
	public WebController() {
		this.caisse = new CaisseEnregistreuse();
	}
	
	@GetMapping
	public CaisseEnregistreuse getCaisse() {
		return caisse;
	}
	
	@PutMapping("/activation")
	public void activer() {
		caisse.activation();
	}
	
	@DeleteMapping
	public void suppressionLastOperation() {
		
	}
	
	
	@PostMapping("/encaisser")
	public void encaisser(@RequestParam("name") String product,
			@RequestParam("montant") int montant) {
		
		log.info("encaissement d'une opération");
		
		Operation operationVente = new OperationVente(montant, product);
		
		caisse.encaisser(operationVente);
	}
	
	
	
	@GetMapping("/montant")
	public int getMontant() {
		return caisse.getMontantTotal();
	}

}

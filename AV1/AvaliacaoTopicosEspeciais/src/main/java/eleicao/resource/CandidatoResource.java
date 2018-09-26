package eleicao.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eleicao.domain.Candidato;
import eleicao.services.CandidatoServices;

@RestController
@RequestMapping(value="/candidatos")
public class CandidatoResource {
	
	@Autowired
	private CandidatoServices services;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> listar (@PathVariable Integer id){
		
		Candidato buscarCandidato = services.buscar(id);
		
		return ResponseEntity.ok().body(buscarCandidato);
		
	}

}

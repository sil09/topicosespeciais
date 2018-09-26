package eleicao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eleicao.domain.Candidato;
import eleicao.repositories.CandidatoRepository;

@Service
public class CandidatoServices {
	
	@Autowired
	private CandidatoRepository repo;
	
	public Candidato buscar(Integer id) {
		Optional<Candidato> buscarCandidato = repo.findById(id);
		
		return buscarCandidato.orElse(null);
	}

}

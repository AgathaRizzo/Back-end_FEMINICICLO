package ifsp.edu.br.feminicicloapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ifsp.edu.br.feminicicloapi.model.Vitima;

public interface VitimaRepository extends CrudRepository<Vitima, Long>{
    List<Vitima> findByEmail(String email);
}

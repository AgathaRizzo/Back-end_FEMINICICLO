package ifsp.edu.br.feminicicloapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ifsp.edu.br.feminicicloapi.model.Profissional;
import ifsp.edu.br.feminicicloapi.repository.ProfissionalRepository;

@RestController
@CrossOrigin
public class ProfissionalController {

    @Autowired
    ProfissionalRepository repo;

    @PostMapping("/profissional")
    public void adicionaProfissional(
            @RequestBody Profissional profissional) {
        repo.save(profissional);
    }

    @GetMapping("/profissional")
    public List<Profissional> recuperaProfissional() {
        return (List<Profissional>) repo.findAll();
    }
}

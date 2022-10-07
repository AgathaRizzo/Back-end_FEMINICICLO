package ifsp.edu.br.feminicicloapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ifsp.edu.br.feminicicloapi.model.Instituicao;
import ifsp.edu.br.feminicicloapi.repository.InstituicaoRepository;

@RestController
@CrossOrigin
public class InstituicaoController {
    @Autowired
    InstituicaoRepository repo;

    @PostMapping("/instituicao")
    public void adicionaInstituicao(
            @RequestBody Instituicao instituicao) {
        repo.save(instituicao);
    }

    @GetMapping("/instituicao")
    public List<Instituicao> recuperaInstituicao() {
        return (List<Instituicao>) repo.findAll();
    }
}

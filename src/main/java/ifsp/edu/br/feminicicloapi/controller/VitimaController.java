package ifsp.edu.br.feminicicloapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ifsp.edu.br.feminicicloapi.model.Vitima;

@RestController
public class VitimaController {
    
    @Autowired
    VitimaRepository repo;

    @PostMapping("/vitima")
    public void adicionaVitima(
        @RequestBody Vitima vitima
    ){
        repo.save(vitima);
    }

    @GetMapping("/vitima")
    public List<Vitima> recuperaVitima(){
        return (List<Vitima>)repo.findAll();
    }
}


package ifsp.edu.br.feminicicloapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;

import ifsp.edu.br.feminicicloapi.model.Feedback;
import ifsp.edu.br.feminicicloapi.repository.FeedbackRepository;

@RestController
@CrossOrigin
public class FeedbackController {
    @Autowired
    FeedbackRepository repo;

    @PostMapping("/feedback")
    public void adicionaFeedbacks(
            @RequestBody Feedback feedback) {
        repo.save(feedback);
    }

    @GetMapping("/feedback")
    public List<Feedback> recuperaFeedbacks() {
        return (List<Feedback>) repo.findAll();
    }

    @DeleteMapping("/feedback/{id}")
    public void deletaFeedback(@PathVariable int id) {
        // Deletar o feedback com o id recebido
        repo.deleteById((long) id);
    }
}

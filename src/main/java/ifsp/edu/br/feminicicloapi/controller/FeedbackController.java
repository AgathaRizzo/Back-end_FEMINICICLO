package ifsp.edu.br.feminicicloapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ifsp.edu.br.feminicicloapi.model.Feedback;
import ifsp.edu.br.feminicicloapi.repository.FeedbackRepository;

@RestController
@CrossOrigin
public class FeedbackController {
    /*
     * @GetMapping("/feedback")
     * public List<Feedback> getAllFeedbacks(){
     * Feedback feedbacks[] = {
     * new Feedback("Me ajude!"),
     * new Feedback("Eu sofro!"),
     * };
     * 
     * return Arrays.stream(feedbacks).toList();
     * }
     */
    @GetMapping("/feedback")
    public List<Feedback> listaTodosFeedbacks() {
        return FeedbackRepository.all();
    }

    @GetMapping("/feedback/{id}")
    public Feedback recuperarFeedbackById(@PathVariable("id") int id) {
        return FeedbackRepository.getById(id);
    }

    @PostMapping("/feedback/criar_feedbacks")
    public void addFeedback(
            @RequestBody Feedback feedback)  {
        FeedbackRepository.add(feedback);
    }

    @DeleteMapping("/deletaFeedback/{id}")
    public boolean deletaFeedback(@PathVariable("id") int id) {
        boolean deletar = FeedbackRepository.deletaFeedbackbyId(id - 1);
        if (!deletar) {
            return false;
        }
        return true;
    }
}

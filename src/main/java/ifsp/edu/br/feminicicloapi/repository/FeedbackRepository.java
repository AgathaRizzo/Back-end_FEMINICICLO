package ifsp.edu.br.feminicicloapi.repository;

import java.util.ArrayList;

import ifsp.edu.br.feminicicloapi.model.Feedback;

public class FeedbackRepository {
    private static FeedbackRepository repo;

    private ArrayList<Feedback> feedbacks;
    
    private FeedbackRepository(){
        this.feedbacks = new ArrayList<>();
    }

    public static void init(){
        if (FeedbackRepository.repo == null){

            FeedbackRepository.repo = new FeedbackRepository();

            //Adcicionando Feedbacks
            FeedbackRepository.add(
                new Feedback(
                    "Olá, meu nome é fulana e eu sofri violência doméstica durante cinco anos até encontrar apoio neste app!"
                )
            );
                
        

         } else {
            System.out.println("O banco já foi inicializado!");
        }
    }
    public static void add(Feedback feedback){
        FeedbackRepository.repo.feedbacks.add(feedback);
    }
    public static ArrayList<Feedback> all() {
        return FeedbackRepository.repo.feedbacks;

    }

    public static Feedback getById(int id){
            return FeedbackRepository.repo.feedbacks.stream().filter((feedback)-> feedback.getId() == id).toList().get(0);
        }
    
    public static boolean deletaById(int id){
        FeedbackRepository.repo.feedbacks.remove(id);
        return true;
    }

    public static boolean deletaFeedbackbyId(int i) {
        return false;
    }
    }
    


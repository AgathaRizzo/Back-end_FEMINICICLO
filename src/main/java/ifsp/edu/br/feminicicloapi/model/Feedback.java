package ifsp.edu.br.feminicicloapi.model;

public class Feedback {
    private static int idCounter = 0;

    private int id;
    private String descricao;
    
    public Feedback() {
        this.id = Feedback.idCounter++;
    }

    public Feedback(String descricao) {
        this.id = Feedback.idCounter++;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}

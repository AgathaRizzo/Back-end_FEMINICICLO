package ifsp.edu.br.feminicicloapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private static int idCounter = 0;
    private int id;
    private String descricao;
    @JsonBackReference
    @OneToOne(mappedBy = "vitima")
    private Vitima vitima;

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

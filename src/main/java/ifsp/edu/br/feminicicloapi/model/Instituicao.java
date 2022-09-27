package ifsp.edu.br.feminicicloapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instituicao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String endereco;
    private Long cnpj;
    private String tipoApoio;
    
    public Instituicao(){
 
    }
    public Instituicao(String nome, String endereco, Long cnpj, String tipoApoio) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.tipoApoio = tipoApoio;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Long getCnpj() {
        return cnpj;
    }
    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }
    public String getTipoApoio() {
        return tipoApoio;
    }
    public void setTipoApoio(String tipoApoio) {
        this.tipoApoio = tipoApoio;
    }
    
}


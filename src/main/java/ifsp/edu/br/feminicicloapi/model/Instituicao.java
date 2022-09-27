package ifsp.edu.br.feminicicloapi.model;
 
public class Instituicao {
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


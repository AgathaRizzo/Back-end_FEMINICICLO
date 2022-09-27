package ifsp.edu.br.feminicicloapi.model;
 
public class Vitima {
    private String nome;
    private int idade;
    private String rg;
    private String endereco;
    private String boletim;
    private String corpoDelito;
 
    public Vitima() {
 
    }
 
    public Vitima(String nome, int idade, String rg, String endereco, String boletim, String corpoDelito) {
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
        this.endereco = endereco;
        this.boletim = boletim;
        this.corpoDelito = corpoDelito;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public int getIdade() {
        return idade;
    }
 
    public void setIdade(int idade) {
        this.idade = idade;
    }
 
    public String getRg() {
        return rg;
    }
 
    public void setRg(String rg) {
        this.rg = rg;
    }
 
    public String getEndereco() {
        return endereco;
    }
 
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
 
    public String getBoletim() {
        return boletim;
    }
 
    public void setBoletim(String boletim) {
        this.boletim = boletim;
    }
 
    public String getCorpoDelito() {
        return corpoDelito;
    }
 
    public void setCorpoDelito(String corpoDelito) {
        this.corpoDelito = corpoDelito;
    }
 
}


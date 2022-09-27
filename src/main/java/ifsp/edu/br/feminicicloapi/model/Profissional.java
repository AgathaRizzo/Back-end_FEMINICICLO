package ifsp.edu.br.feminicicloapi.model;
 
public class Profissional {
    private String nomeProfissional;
    private String cpf;
    private String areaFormacao;
    private String horarioAtendimento;
    private String formaAtendimento;
 
    public Profissional() {
 
    }
 
    public Profissional(String nomeProfissional, String cpf, String areaFormacao, String horarioAtendimento,
            String formaAtendimento) {
        this.nomeProfissional = nomeProfissional;
        this.cpf = cpf;
        this.areaFormacao = areaFormacao;
        this.horarioAtendimento = horarioAtendimento;
        this.formaAtendimento = formaAtendimento;
    }
 
    public String getNomeProfissional() {
        return nomeProfissional;
    }
 
    public void setNomeProfissional(String nomeProfissional) {
        this.nomeProfissional = nomeProfissional;
    }
 
    public String getCpf() {
        return cpf;
    }
 
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
 
    public String getAreaFormacao() {
        return areaFormacao;
    }
 
    public void setAreaFormacao(String areaFormacao) {
        this.areaFormacao = areaFormacao;
    }
 
    public String getHorarioAtendimento() {
        return horarioAtendimento;
    }
 
    public void setHorarioAtendimento(String horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }
 
    public String getFormaAtendimento() {
        return formaAtendimento;
    }
 
    public void setFormaAtendimento(String formaAtendimento) {
        this.formaAtendimento = formaAtendimento;
    }
 
}


package Q2_03_Professores;

public class Pessoa {

    private String nome;
    private String dataNascimento;
    private String areaAtuacao;
    private Universidade universidade;

    public Pessoa(String nome, String dataNascimento, String areaAtuacao, Universidade universidade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.areaAtuacao = areaAtuacao;
        this.universidade = universidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    @Override
    public String toString() {
        return nome + " nasceu em " + dataNascimento + " e trabalhou como professor de " + areaAtuacao + " em " + universidade.getNome() + " (" + universidade.getLocalizacao() + ").";
    }
}

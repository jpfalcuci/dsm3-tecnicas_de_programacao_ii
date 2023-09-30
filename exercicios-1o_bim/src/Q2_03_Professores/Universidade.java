package Q2_03_Professores;

public class Universidade {

    private String nome;
    private String localizacao;

    public Universidade(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "Universidade [nome=" + nome + ", localizacao=" + localizacao + "]";
    }
}

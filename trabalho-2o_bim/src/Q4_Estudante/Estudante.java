package Q4_Estudante;

public abstract class Estudante {

    private String instituicao;

    public Estudante(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getInstituicao() {
        return this.instituicao;
    }
}

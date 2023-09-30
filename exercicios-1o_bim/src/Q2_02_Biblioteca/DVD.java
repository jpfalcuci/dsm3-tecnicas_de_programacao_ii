package Q2_02_Biblioteca;

public class DVD extends Midia {

    public String diretor;

    public DVD(int codigo, String titulo, int anoLancamento, String diretor) {
        super(codigo, titulo, anoLancamento);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "DVD [código=" + codigo + ", título=" + titulo + ", anoLancamento=" + anoLancamento + ", diretor=" + diretor + "]";
    }
}

package Q2_02_Biblioteca;

public class Livro extends Midia {

    public String autor;

    public Livro(int codigo, String titulo, int anoLancamento, String autor) {
        super(codigo, titulo, anoLancamento);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro [código=" + codigo + ", título=" + titulo + ", ano de lançamento=" + anoLancamento + ", autor=" + autor + "]";
    }
}

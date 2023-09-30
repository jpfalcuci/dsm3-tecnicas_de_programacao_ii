package Q2_02_Biblioteca;

public class CD extends Midia {

    public String artista;

    public CD(int codigo, String titulo, int anoLancamento, String artista) {
        super(codigo, titulo, anoLancamento);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "CD [código=" + codigo + ", título=" + titulo + ", anoLancamento=" + anoLancamento + ", artista=" + artista + "]";
    }
}

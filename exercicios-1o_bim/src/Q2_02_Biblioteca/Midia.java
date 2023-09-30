package Q2_02_Biblioteca;

public abstract class Midia {
    
    public int codigo;

    public String titulo;
    
    public int anoLancamento;

    public Midia(int codigo, String titulo, int anoLancamento) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

}

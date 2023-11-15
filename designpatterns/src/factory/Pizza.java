package factory;

public abstract class Pizza {

    protected String nome;

    protected Double valor;

    protected Borda borda;

    public String getNome() {
        return this.nome;
    }

    public void setBorda(Borda borda) {
        this.borda = borda;
    }
}

package decorator;

public abstract class Bebida {

    protected String descricao = "Sem bebida";

    public String getDescricao() {
        return this.descricao;
    }

    public abstract Double getValor();
}

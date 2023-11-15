package decorator;

public class CaConLatte extends BlendDecorator {

    public Bebida bebida;

    public CaConLatte(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public Double getValor() {
        return 6.00 + this.bebida.getValor();
    }

    @Override
    public String getDescricao() {
        return this.bebida.getDescricao() + " + chocolate da vovó";
    }
}

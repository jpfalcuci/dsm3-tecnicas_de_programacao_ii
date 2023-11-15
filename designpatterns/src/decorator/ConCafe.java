package decorator;

public class ConCafe extends BlendDecorator {

    private Bebida bebida;

    public ConCafe(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public Double getValor() {
        return 8.99 + bebida.getValor();
    }

    @Override
    public String getDescricao() {
        return "ConCafe + " + bebida.getDescricao();
    }
}

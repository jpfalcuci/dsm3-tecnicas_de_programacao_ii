package cafeteria;

public class Expresso extends Bebida {
    public Expresso() {
        super.descricao = "Expresso Cremosinho";
    }

    @Override
    public Double getValor() {

        return 5.0;
    }
}

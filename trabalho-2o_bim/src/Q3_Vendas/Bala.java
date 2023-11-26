package Q3_Vendas;

public class Bala extends Produto {

    @Override
    public Double calcularPrecoVenda(Double precoCusto) {
        return (precoCusto * 1.35) + 0.01;
    }
}

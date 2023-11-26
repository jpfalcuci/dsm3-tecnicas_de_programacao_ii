package Q3_Vendas;

public class Bolacha extends Produto {

    @Override
    public Double calcularPrecoVenda(Double precoCusto) {
        return precoCusto * 1.1;
    }
}

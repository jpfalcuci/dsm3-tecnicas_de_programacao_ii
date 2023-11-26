package Q3_Vendas;

public class Bombom extends Produto {

    @Override
    public Double calcularPrecoVenda(Double precoCusto) {
        return precoCusto * 1.334;
    }
}

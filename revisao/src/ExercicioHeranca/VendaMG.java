package ExercicioHeranca;

public class VendaMG extends Venda {

    @Override
    public Produto vender(Produto produto) {
        super.vender(produto);
        produto.setPrecoDeVenda(produto.getPrecoDeVenda() * 1.085);

        return produto;
    }
}

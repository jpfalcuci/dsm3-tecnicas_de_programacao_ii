package ExercicioHeranca;

public class Venda {

    public Produto vender(Produto produto) {
        // TODO: validar o objeto antes

        if (produto.getQuantidade() <= 5) {
            produto.setPrecoDeVenda(produto.getPrecoDeCusto() * 1.35);
        } else {
            produto.setPrecoDeVenda(produto.getPrecoDeCusto() * 1.25);
        }

        return produto;
    }
}

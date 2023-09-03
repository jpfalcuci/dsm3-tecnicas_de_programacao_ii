package ExercicioHeranca;

public class VendaRS extends Venda {

        @Override
        public Produto vender(Produto produto) {

            if (produto.getPrecoDeCusto() <= 1000) {
                produto.setPrecoDeVenda(produto.getPrecoDeCusto() * 1.15);
            } else {
                produto.setPrecoDeVenda(produto.getPrecoDeCusto() * 1.1);
            }

            return produto;
        }
}

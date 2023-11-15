package observer;

public class FaturamentoObserver implements ProdutoObserver {

    @Override
    public void atualizarEstoque(Produto produto) {

        System.out.println("Faturamento: " + produto);

        // TODO: implementar lógica de faturamento
    }
}

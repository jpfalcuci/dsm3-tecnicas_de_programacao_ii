package observer;

public class Principal {

    public static void main(String[] args) {

        Subject estoqueSubject = new EstoqueSubject();

        ProdutoObserver auditoria = new AuditoriaEstoqueObserver();

        ProdutoObserver faturamento = new FaturamentoObserver();

        estoqueSubject.registerObserver(auditoria);
        estoqueSubject.registerObserver(faturamento);

        Produto p = new Produto();
        p.setId(44L);
        p.setPrecoCusto(1333.44);
        p.setPrecoVenda(1500D);
        p.setQuantidade(4L);

        estoqueSubject.setProduto(p);

        p.setQuantidade(10L);
        estoqueSubject.setProduto(p);
    }
}

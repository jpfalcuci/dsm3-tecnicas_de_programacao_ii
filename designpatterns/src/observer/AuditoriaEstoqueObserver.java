package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuditoriaEstoqueObserver implements ProdutoObserver {

    private Map<Long, List<Produto>> listaAuditoria = new HashMap();
    @Override
    public void atualizarEstoque(Produto produto) {

        System.out.println("Auditoria " + produto);

        List<Produto> auditoria = listaAuditoria.get(produto.getId());

        if (auditoria == null) {
            auditoria = new ArrayList();
        }

        auditoria.add(produto);
        this.listaAuditoria.put(produto.getId(), auditoria);
    }
}

package observer;

import java.util.ArrayList;
import java.util.List;

public class EstoqueSubject implements Subject {

    private List<ProdutoObserver> listaObservers = new ArrayList<>();

    private Produto produto;

    @Override
    public void registerObserver(ProdutoObserver observer) {
        this.listaObservers.add(observer);
    }

    @Override
    public void removeObserver(ProdutoObserver observer) {
        this.listaObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for (ProdutoObserver observer : this.listaObservers) {
            observer.atualizarEstoque(this.produto);
        }
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
        this.notifyObservers();
    }
}

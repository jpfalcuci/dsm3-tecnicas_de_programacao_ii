package observer;

public interface Subject {

    public void registerObserver(ProdutoObserver observer);

    public void removeObserver(ProdutoObserver observer);

    public void notifyObservers();

    public void setProduto(Produto produto);
}

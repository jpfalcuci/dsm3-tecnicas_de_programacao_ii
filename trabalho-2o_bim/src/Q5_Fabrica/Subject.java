package Q5_Fabrica;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();
    public Produto produto;

    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        System.out.println("\nNotificando todos os Observers:");
        for (Observer observer : this.observers) {
            observer.update(this.produto);
        }
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
        this.notifyObservers();
    }
}

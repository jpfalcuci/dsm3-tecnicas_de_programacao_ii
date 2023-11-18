package ex_fomemais;

import java.util.List;
import java.util.ArrayList;

public class PedidoSubject implements Subject {

    private List<Observer> listaObservers = new ArrayList();
    public Pedido pedido;

    @Override
    public void registrar(Observer observer) {
        this.listaObservers.add(observer);
    }

    @Override
    public void cancelarRegistro(Observer observer) {
        this.listaObservers.remove(observer);
    }

    @Override
    public void notificarObservers() {
        for(Observer o: this.listaObservers) {
            o.atualizarStatusPedido(this.pedido);
        }
    }

    @Override
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
        this.notificarObservers();
    }
}

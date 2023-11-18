package ex_fomemais;

public interface Subject {

    public void registrar(Observer observer);

    public void cancelarRegistro(Observer observer);

    public void notificarObservers();

    public void setPedido(Pedido pedido);
}

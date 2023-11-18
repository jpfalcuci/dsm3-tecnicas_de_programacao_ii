package ex_fomemais;

public class EmailObserver implements Observer {

    @Override
    public void atualizarStatusPedido(Pedido pedido) {
        this.enviarEmail(pedido);
    }

    public void enviarEmail(Pedido pedido) {
        System.out.println("Enviando email... moro@moro.com");
    }
}

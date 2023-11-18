package ex_fomemais;

public class WhatsappObserver implements Observer {
    @Override
    public void atualizarStatusPedido(Pedido pedido) {
        this.invocarApiWhats(pedido);
    }

    public void invocarApiWhats(Pedido pedido) {
        System.out.println("Api whats... " + pedido);
    }
}

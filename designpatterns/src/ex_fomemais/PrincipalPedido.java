package ex_fomemais;

public class PrincipalPedido {

    public static void main(String[] args) {

        Subject pedidoSubject = new PedidoSubject();

        Observer emailObserver = new EmailObserver();
        Observer whatsObserver = new WhatsappObserver();

        pedidoSubject.registrar(whatsObserver);
        pedidoSubject.registrar(emailObserver);

        Pedido pedidoSamuel = new Pedido();
        pedidoSamuel.setNomeCliente("Samuel");
        pedidoSamuel.setStatus(StatusEnum.CRIADO);

        Produto p1 = new Produto();
        p1.setQuantidade(2);
        p1.setValorUnitario(33.00);

        pedidoSamuel.adicionarProduto(p1);
        pedidoSubject.setPedido(pedidoSamuel);

        pedidoSamuel.setStatus(StatusEnum.EM_PREPARACAO);
        pedidoSubject.setPedido(pedidoSamuel);
    }
}

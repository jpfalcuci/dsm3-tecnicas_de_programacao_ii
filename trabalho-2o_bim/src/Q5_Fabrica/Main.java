package Q5_Fabrica;

public class Main {

    public static void main(String[] args) {

        Subject subject = new Subject();

        Observer controleProducao = new ControleProducao();
        Observer emailCliente = new EmailCliente();
        Observer sistemaFinanceiro = new SistemaFinanceiro();
        Observer sistemaLogistica = new SistemaLogistica();

        subject.registerObserver(controleProducao);
        subject.registerObserver(emailCliente);
        subject.registerObserver(sistemaFinanceiro);
        subject.registerObserver(sistemaLogistica);

        Produto produto = new Produto(1, "Produto do Fábio");

        produto.fabricarProduto("26/11/2023", 1, 100);
        subject.setProduto(produto);

        produto.fabricarProduto("27/11/2023", 2, 200);
        subject.setProduto(produto);
    }
}

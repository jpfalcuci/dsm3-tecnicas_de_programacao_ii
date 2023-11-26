package Q5_Fabrica;

public class ControleProducao implements Observer {

    @Override
    public void update(Produto produto) {
        System.out.println("Sistema de controle de produção notificado:\n - " + produto);
    }
}

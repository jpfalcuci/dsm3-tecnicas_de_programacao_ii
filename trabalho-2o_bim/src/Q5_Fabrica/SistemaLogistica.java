package Q5_Fabrica;

public class SistemaLogistica implements Observer {

    @Override
    public void update(Produto produto) {
        System.out.println("Expedição autorizada para o depto. de logística:\n - " + produto);
    }
}

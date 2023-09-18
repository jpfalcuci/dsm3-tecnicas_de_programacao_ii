package ExercicioBanco;

public class BancoApp {

    public static void main(String[] args) {

        // Teste do Banco Moro
        System.out.println("Movimentações Banco Moro");
        Conta samuel = new Conta(101022);
        MovimentacaoBusiness movimentacao = new MoroBankMovimentacao();
        System.out.println(samuel);

        movimentacao.depositar(samuel, 250D);
        System.out.println(samuel);

        movimentacao.sacar(samuel, 50D);
        System.out.println(samuel);

        movimentacao.sacar(samuel, 500D);
        System.out.println(samuel);

        // Teste do Banco Franca
        System.out.println("\nMovimentações Banco Franca");
        Conta fabio = new Conta(9999, 1000D);
        movimentacao = new FrancaBankMovimentacao();
        System.out.println(fabio);

        movimentacao.depositar(fabio, 1000D);
        System.out.println(fabio);

        movimentacao.sacar(fabio, 1500D);
        System.out.println(fabio);
    }
}

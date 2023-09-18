package ExercicioBanco;

public abstract class MovimentacaoPadrao implements MovimentacaoBusiness {

    @Override
    public void depositar(Conta conta, Double valor) {
        conta.atualizarSaldo(valor);
    }

    @Override
    public void sacar(Conta conta, Double valor) {

        if (conta.getSaldo() < valor) {
            System.out.println("Saldo insuficiente, pobre!");
            return;
        }

        conta.atualizarSaldo(-valor);
    }
}

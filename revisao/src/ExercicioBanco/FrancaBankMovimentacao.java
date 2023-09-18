package ExercicioBanco;

public class FrancaBankMovimentacao extends MovimentacaoPadrao {

    @Override
    public void depositar(Conta conta, Double valor) {
        conta.atualizarSaldo(valor);

        Double adicional = valor * 0.01;
        conta.atualizarSaldo(adicional);
    }

    @Override
    public void sacar(Conta conta, Double valor) {

        Double limiteTotal = conta.getLimite() + conta.getSaldo();

        if (limiteTotal < valor) {
            System.out.println("Sem limite para saque");
            return;
        }

        conta.atualizarSaldo(-valor);
    }
}

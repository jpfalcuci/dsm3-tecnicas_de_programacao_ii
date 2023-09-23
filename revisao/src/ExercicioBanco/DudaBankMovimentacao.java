package ExercicioBanco;

public class DudaBankMovimentacao
        extends MovimentacaoPadrao
        implements Emprestimo {

    public void emprestimo(Conta conta, Double valorEmprestimo) {

        Double limiteEmprestimo = 3 * conta.getSaldo();

        if (valorEmprestimo <= limiteEmprestimo) {
            System.out.println("Empréstimo realizado com sucesso!");
            conta.setEmprestimo(valorEmprestimo);
            System.out.println("Seu novo saldo é de: " + (conta.getSaldo() + conta.getEmprestimo()));
        } else {
            System.err.println("Empréstimo não realizado!");
            System.err.println("Seu saldo só permite empréstimos de até " + limiteEmprestimo);
        }
    }
}

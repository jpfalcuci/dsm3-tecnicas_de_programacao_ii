package ExercicioBanco;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta {

    private Integer numero;

    private Double saldo;

    private Double limite;

    private Double emprestimo;

    private List<String> extrato = new ArrayList<>();

    /**
     * Construtor da classe Conta
     * @param numero
     */
    public Conta(Integer numero) {
        this.numero = numero;
        this.saldo = 0D;
        this.limite = 0D;
    }

    /**
     * Construtor da classe Conta
     * @param numero
     * @param limite
     */
    public Conta(Integer numero, Double limite) {
        this.numero = numero;
        this.saldo = 0D;
        this.limite = limite;
    }

    public Integer getNumero() {
        return numero;
    }

    public void atualizarSaldo(Double valor) {
        this.saldo += valor;

        String  tipoMovimentacao = valor < 0 ? "Saque" : "Depósito";
        String registro = new Date() + " " + tipoMovimentacao + " " + valor;
        extrato.add(registro);
    }

    public void mostrarExtrato() {
        System.out.println("Extrato da conta " + numero);
        this.extrato.forEach(e -> {
            System.out.println(e);
        });
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Double emprestimo) {
        this.emprestimo = emprestimo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", limite=" + limite +
                ", emprestimo=" + emprestimo +
                '}';
    }
}

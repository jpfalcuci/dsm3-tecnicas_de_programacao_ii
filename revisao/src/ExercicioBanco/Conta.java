package ExercicioBanco;

public class Conta {

    private Integer numero;

    private Double saldo;

    private Double limite;

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

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}

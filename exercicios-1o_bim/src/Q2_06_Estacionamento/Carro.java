package Q2_06_Estacionamento;

public class Carro implements Veiculo {

    private String modelo;

    private int ano;

    private String placa;

    private double valorHora = 4D;

    private double tempoEstacionado;

    public Carro(String modelo, int ano, String placa, double tempoEstacionado) {
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.tempoEstacionado = tempoEstacionado;
    }

    public double calcularTaxa() {
        return this.valorHora * this.tempoEstacionado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getTempoEstacionado() {
        return tempoEstacionado;
    }

    public void setTempoEstacionado(double tempoEstacionado) {
        this.tempoEstacionado = tempoEstacionado;
    }

    @Override
    public String toString() {
        return "Carro [modelo: " + modelo + ", ano: " + ano + ", placa: " + placa + ", valorHora: " + valorHora
                + ", tempoEstacionado: " + tempoEstacionado + "]";
    }
}

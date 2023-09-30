package Q2_06_Estacionamento;

public class Bicicleta implements Veiculo {

    private String modelo;

    private int ano;

    private String tipo;

    public Bicicleta(String modelo, int ano, String tipo) {
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = tipo;
    }

    public double calcularTaxa() {
        return 0D;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bicicleta [modelo: " + modelo + ", ano: " + ano + ", tipo: " + tipo + "]";
    }
}

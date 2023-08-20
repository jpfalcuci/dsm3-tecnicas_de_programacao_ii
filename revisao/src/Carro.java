public class Carro {
    private String marca;
    private String modelo;
    private String cor;

    public Carro(String marca, String modelo, String cor) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setCor(cor);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void showDetails() {
        System.out.println("Marca: " + this.getMarca() +
                ", Modelo: " + this.getModelo() +
                ", Cor: " + this.getCor());
        System.out.printf("Objeto: %s, HashCode: %s \n", this, this.hashCode());
    }
}

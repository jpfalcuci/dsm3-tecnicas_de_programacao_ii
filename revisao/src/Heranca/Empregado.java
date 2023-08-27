package Heranca;

public class Empregado extends Pessoa {
    public Empregado() {
        super(); // Ocorre automaticamente
        System.out.println("Construtor empregado");
    }

    private void funcao() {
        super.quemSouEu(); // Chama a função da classe pai
        this.quemSouEu(); // Chama a função da própria classe
    }

    @Override // Sobrescrita
    public void quemSouEu() {
        System.out.println("Sou um empregado");
    }

    // Sobrecarga, mesmo nome, mas parâmetros diferentes
    public void quemSouEu(String x) {
        System.out.println("Eu sou " + x);
    }
}

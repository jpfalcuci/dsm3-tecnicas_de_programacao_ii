package Heranca;

public class Gerente extends Empregado {

    @Override // Sobrescrita
    public void quemSouEu() {
        System.out.println("Sou um gerente");
    }
}

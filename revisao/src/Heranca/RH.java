package Heranca;

public class RH {

    public static void main(String[] args) {
        Gerente chefe = new Gerente();
        Empregado empregado = new Empregado();
        Pessoa p = new Pessoa();

        pagarSalario(chefe);
        pagarSalario(empregado);
        // pagarSalario(p); // Pessoa não é um empregado

        promoverEmpregado(chefe, empregado);

        p.quemSouEu();
        chefe.quemSouEu();
        empregado.quemSouEu();
        empregado.quemSouEu("o empregado Fulano");
    }

    public static void pagarSalario(Empregado empregado) {
        if (empregado instanceof Gerente) {
            System.out.println("Salário de gerente");
        } else {
            System.out.println("Salário de empregado");
        }
    }

    public static void promoverEmpregado(Gerente gerente, Empregado empregado) {
        System.out.println("Empregado promovido");
    }
}

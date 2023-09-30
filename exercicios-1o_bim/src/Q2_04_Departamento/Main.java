package Q2_04_Departamento;

/*
 * Fazer um programa para:
 * a. Criar uma classe Departamento que permita relacionar um objeto (Departamento) à classe Universidade por composição (Universidade “contém” Departamento);
 * b. Departamento deverá conter: código, nome, área do conhecimento;
 * c. Adaptar a classe Pessoa para que ela possua uma referência ao departamento que trabalha, ou seja,
 * ela deve possuir uma associação com a classe Departamento, permitindo que cada objeto Pessoa tenha a referência de um objeto Departamento.
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("\n+--------------------------------+");
        System.out.println("|          Departamento          |");
        System.out.println("+--------------------------------+");

        Departamento departamentoInformatica = new Departamento(1, "Informática", "Ciência da Computação");
        Universidade universidade = new Universidade(departamentoInformatica);
        Pessoa pessoa = new Pessoa("João", departamentoInformatica);

        System.out.println("[Universidade] Departamento: " + universidade.getDepartamento().getNome());
        System.out.println("Pessoa: " + pessoa.getNome() + " trabalha no departamento de " + pessoa.getDepartamento().getNome());
        System.out.println("----------------------------------");
    }
}

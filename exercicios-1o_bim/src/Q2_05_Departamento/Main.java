package Q2_05_Departamento;

/*
 * Altere a relação de Universidade com Departamento para que permita a Universidade ter vários departamentos.
 * a. Em uma universidade, associe 10 departamentos;
 * b. Crie um método que exiba a relação de departamentos da universidade;
 * c. Crie uma função que procure por um departamento em uma universidade:
 *      i. crie uma função que receba um objeto de Departamento e o localiza na coleção;
 *      ii. faça uso do equals e hash code para localizar o departamento;
 *      iii. se o encontrar, exiba seus dados;
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\n+-------------------------------------------+");
        System.out.println("|          Departamentos (Funções)          |");
        System.out.println("+-------------------------------------------+");

        Universidade universidade = new Universidade();

        for (int i = 1; i <= 10; i++) {
            Departamento departamento = new Departamento(i, "Departamento " + i, "Área " + i);
            universidade.adicionarDepartamento(departamento);
        }

        universidade.exibirDepartamentos();
        universidade.encontrarDepartamento("DEPARTAMENTO 5");
    } 
}

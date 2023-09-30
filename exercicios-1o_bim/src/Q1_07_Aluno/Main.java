package Q1_07_Aluno;

/*
 * Crie uma classe que represente um aluno considerando os atributos: nome, p1, p2.
 * Em outra classe, no mesmo pacote crie uma classe principal (Main2.java) e:
 *
 * a. crie uma variável a1 do tipo aluno que receba a instância de Aluno;
 * b. atribua valores arbitrários;
 * c. mostre os valores;
 * d. crie uma variável a2 que receba a1;
 * e. altere os valores da p1 e p2 na variável a2 e mostre os valores dos atributos de a1 e a2;
 * f. os valores são diferentes? explique.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\n+-------------------------------------+");
        System.out.println("|          ALUNO (VARIÁVEIS)          |");
        System.out.println("+-------------------------------------+");

        Aluno a1 = new Aluno("João", 7.5, 8.0);
        System.out.println("a1: " + a1);

        Aluno a2 = a1;
        a2.setP1(9.0);
        a2.setP2(9.5);

        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);

        System.out.println("Os valores são iguais porque a2 passou a apontar para mesmo objeto que a1.");
        System.out.println("Ou seja, a2 não é uma cópia de a1, mas sim uma referência para o mesmo objeto.");
        System.out.println("---------------------------------------");
    }
}

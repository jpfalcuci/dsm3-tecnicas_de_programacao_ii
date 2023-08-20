public class Revisao02 {
    public static void main(String[] args) {

        // Diferença entre int e Integer
        int a = 10; // tipo primitivo
        Integer b = 20; // tipo classe

        // a não tem métodos
        // b possui métodos = b.método();

        // int é geralmente usado para operações matemáticas ou processos mais simples
        // Integer é usado para operações mais complexas, como ordenação de listas



        // Diferença entre == e equals

        // Usando objeto String
        String c = new String("TP2"); // Criando um objeto do tipo String
        String d = new String("TP2");

        System.out.println("Comparação de endereço de memória entre strings:");
        if (c == d) { // Compara o endereço de memória
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }

        System.out.println("\nComparação de conteúdo entre strings (equals):");
        if (c.equals(d)) { // Compara o conteúdo
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }

        System.out.println("\nComparação de conteúdo entre strings (equalsIgnoreCase):");
        // Forma de comparar o conteúdo ignorando maiúsculas e minúsculas
        System.out.println(c.equalsIgnoreCase(d));


        // Usando objeto Aluno
        Aluno aluno1 = new Aluno();
        aluno1.setNome("João");
        aluno1.setRa("1234ABC");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("João");
        aluno2.setRa("1234ABC");

        System.out.println("\nComparação de endereço de memória entre objetos:");
        if (aluno1 == aluno2) { // Compara o endereço de memória
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }

        aluno1.getRa().equals(aluno2.getRa()); // Forma de comparar o conteúdo do RA

        System.out.println("\nComparação de conteúdo entre objetos (equals sobrescrito):");
        if (aluno1.equals(aluno2)) { // Compara o conteúdo
            System.out.println("RA dos alunos são iguais");
        } else {
            // Se o método equals na classe Aluno não for implementado,
            // o método equals da classe Object é chamado e compara o endereço de memória
            System.out.println("RA dos alunos são diferentes");
        }

        System.out.println("\nMétodo hashCode() sobrescrito:");
        // Objetos com atributos de mesmo valor possuem o mesmo hashCode
        // Objetos com atributos de valor diferente possuem hashCode diferente
        System.out.println(aluno1.hashCode());
        System.out.println(aluno2.hashCode());
    }
}

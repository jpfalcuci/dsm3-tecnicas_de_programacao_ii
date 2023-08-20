public class Revisao03 {

    private static Integer a; // O uso de static permite acessar de qualquer lugar
    private Integer b; // Sem usar static, só é possível acessar dentro da instância

    public static Double PI1 = 3.1415; // é possível alterar
    public static final Double PI2 = 3.1415; // não é possível alterar

    public static void main(String[] args) {

        a = 10; // É possível atribuir um valor a variável a
        // b = 20; // Não é possível atribuir um valor a variável b sem instânciar

        Revisao03 revisao03 = new Revisao03();
        revisao03.b = 20; // Agora é possível atribuir um valor a variável b
        revisao03.a = 33;
        // Alterando o valor de 'a' a partir da instância revisao03 também altera o valor de a para todos os objetos
        System.out.println(a); // 33, pois foi sobrescrito, sem respeitar o encapsulamento

        PI1 = 10.0; // É possível alterar
        // PI2 = 10.0; // Não é possível alterar
        System.out.println(PI2); // 3,1415, pois não é possível alterar


        metodoEstatico(); // Método estático pode ser chamado sem instância
        revisao03.metodoNaoEstatico(); // Método não estático só pode ser chamado a partir de uma instância
    }

    private static void metodoEstatico() { } // Acessível de qualquer lugar por ser static (sem instância)

    private void metodoNaoEstatico() { // Acessível apenas a partir de uma instância
        metodoEstatico(); // Pode chamar um método estático
    }


    // Varargs
    private int somarVetor1(Integer[] vetor) { // Recebe um vetor como parâmetro
        // TODO: Implementar a soma
        return 0;
    }

    private int somarVetor2(Integer... vetor) { // Recebe um vetor ou uma lista de parâmetros
        // TODO: Implementar a soma
        return 0;
    }
}

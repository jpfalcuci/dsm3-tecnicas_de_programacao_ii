package Q2_03_Professores;

/*
 * Fazer um programa com as seguintes características:
 * a. Uma classe chamada Universidade que terá como atributo um nome e terá um método para informar o seu nome.
 * b. Relacionar a classe Pessoa para com a classe Universidade. Cada pessoa poderá ser associada a uma Universidade.
 * c. A classe Pessoa, por sua vez, terá um método que dirá seu nome e em que universidade trabalha.
 * d. Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido em 14/3/1879)
 * e o outro representando Isaac Newton (nascido em 4/1/1643)
 * e. Criar dois objetos de Universidade, associando um para Einstein e outro para Newton.
 *      i. Einstein trabalhou como professor de física em Princeton (Nova Jersey - Estados Unidos da América).
 *      ii. Newton trabalhou como professor de matemática em Cambridge (Inglaterra).
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\n+-------------------------------+");
        System.out.println("|          Professores          |");
        System.out.println("+-------------------------------+");
    
        Universidade princeton = new Universidade("Princeton", "Nova Jersey - Estados Unidos da América");
        Universidade cambridge = new Universidade("Cambridge", "Inglaterra");
        
        Pessoa albertEinstein = new Pessoa("Albert Einstein", "14/3/1879", "física", princeton);
        Pessoa isaacNewton = new Pessoa("Isaac Newton", "4/1/1643", "matemática", cambridge);

        System.out.println(albertEinstein);
        System.out.println(isaacNewton);
        System.out.println("---------------------------------");
    }
}

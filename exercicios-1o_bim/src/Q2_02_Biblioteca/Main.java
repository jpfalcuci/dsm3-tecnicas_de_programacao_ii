package Q2_02_Biblioteca;

/*
 * Suponha que você está desenvolvendo um sistema para uma biblioteca. Você precisa criar uma hierarquia 
 * de classes que representam diferentes tipos de mídia, como livros, DVDs e CDs. Cada tipo de mídia possui
 * um título, um ano de lançamento e um código único.
 * 
 * a. Crie uma classe abstrata chamada Midia que possui os atributos titulo, anoLancamento e codigo.
 * b. Crie as classes Livro, DVD e CD que herdam de Midia e possuem atributos específicos para cada tipo de mídia.
 * Por exemplo, um Livro tem o atributo autor, um DVD tem o atributo diretor, e um CD tem o atributo artista.
 * c. Implemente um método nas classes filhas para imprimir as informações da mídia (título, ano de lançamento, 
 * código e os atributos específicos do tipo de mídia).
 * d. Crie um programa principal que demonstre a criação de objetos de cada tipo de mídia e chame o método para 
 * imprimir suas informações.
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("\n+------------------------------+");
        System.out.println("|          Biblioteca          |");
        System.out.println("+------------------------------+");

        Livro livro = new Livro(1, "Sapiens: Uma Breve História da Humanidade", 2011, "Yuval Noah Harari");
        DVD dvd = new DVD(2, "O Senhor dos Anéis: A Sociedade do Anel", 2001, "Peter Jackson");
        CD cd = new CD(3, "The Dark Side of the Moon", 1973, "Pink Floyd");
        
        System.out.println(livro);
        System.out.println(dvd);
        System.out.println(cd);
        System.out.println("--------------------------------");
    }
}

public class Revisao01 {

    public static void main(String[] args) {

        Carro c; // declara uma variável do tipo Car, com valor null
        c = new Carro("Fiat", "Uno", "Vermelho");
        // c agora aponta para um objeto do tipo Car
        System.out.println("c:");
        c.showDetails(); // método só é acessível por ter sido declarado como public
        // Marca: Fiat, Modelo: Uno, Cor: Vermelho
        // Objeto: Car@3941a79c, HashCode: 960604060

        Carro c2 = new Carro("Volks", "Gol", "Azul");
        // c2 agora aponta para um segundo objeto do tipo Car
        System.out.println("\nc2:");
        c2.showDetails();
        // Marca: Volks, Modelo: Gol, Cor: Azul
        // Objeto: Car@1b2c6ec2, HashCode: 455896770

        c2 = c;
        // c2 agora aponta para o mesmo objeto que c
        // o objeto que c2 apontava é perdido e coletado pelo garbage collector
        System.out.println("\nc2:");
        c2.showDetails();
        // Marca: Fiat, Modelo: Uno, Cor: Vermelho
        // Objeto: Car@3941a79c, HashCode: 960604060

        System.gc(); // chama o garbage collector
    }
}

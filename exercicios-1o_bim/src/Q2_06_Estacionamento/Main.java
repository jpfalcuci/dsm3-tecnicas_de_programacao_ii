package Q2_06_Estacionamento;

/*
 * Você está desenvolvendo um sistema para gerenciar diferentes tipos de veículos em um estacionamento. 
 * Cada veículo pode ser um carro ou uma bicicleta. Para isso, você decide criar uma interface chamada Veiculo que contém um método calcularTaxa().
 * a. Crie uma interface chamada Veiculo com um método chamado calcularTaxa().
 * b. Implemente duas classes, Carro e Bicicleta, que implementam a interface Veiculo.
 * c. A classe Carro deve ter atributos como modelo, ano, placa e valorHora.
 *      O método calcularTaxa() para um carro deve calcular a taxa de estacionamento com base no valor da hora e no tempo de estacionamento.
 * d. A classe Bicicleta deve ter atributos como modelo, ano e tipo (urbana, montanha, etc.).
 *      O método calcularTaxa() para uma bicicleta deve ser fixo, pois bicicletas não pagam taxa.
 * e. Crie uma classe Estacionamento que tem uma lista de veículos estacionados.
 *      Essa classe deve ter um método calcularTotal() que calcula a receita total do estacionamento somando as taxas de todos os veículos estacionados.
 */
public class Main {

    public static void main(String[] args) {     
        System.out.println("\n+----------------------------------+");
        System.out.println("|          Estacionamento          |");
        System.out.println("+----------------------------------+");

        Estacionamento estacionamento = new Estacionamento();
        Carro carroFiat = new Carro("Fiat", 2010, "ABC-1234", 2.0);
        Carro carroFord = new Carro("Ford", 2015, "DEF-5678", 2.5);
        Bicicleta bicicletaUrbana = new Bicicleta("Caloi", 2018, "Urbana");
        Bicicleta bicicletaMontanha = new Bicicleta("Caloi", 2019, "Montanha");

        estacionamento.adicionarVeiculo(carroFiat);
        estacionamento.adicionarVeiculo(carroFord);
        estacionamento.adicionarVeiculo(bicicletaUrbana);
        estacionamento.adicionarVeiculo(bicicletaMontanha);

        estacionamento.calcularTotal();
        System.out.println("------------------------------------");
    }
}

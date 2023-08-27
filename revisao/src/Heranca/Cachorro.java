package Heranca;

public class Cachorro extends Animal {

    private String raca;

    public Cachorro(String nome, String raca) {
        super.nome = nome;
        // super é usado para acessar métodos e atributos da classe pai
        this.raca = raca;
    }

    public void latir() {
        System.out.println("Au au");
    }
}

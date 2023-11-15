package factory;

public class Pizzaria {

    public static void main(String[] args) {

        Pizza p1 = PizzaFactory.createPizza(PizzaEnum.CALABRESA);

        System.out.println(p1.getNome());
    }
}

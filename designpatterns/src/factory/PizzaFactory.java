package factory;

public class PizzaFactory {

    public static Pizza createPizza(PizzaEnum pizzaEnum) {

        Pizza p = null;

        if (PizzaEnum.CALABRESA.equals(pizzaEnum)) {
            p = new PizzaCalabresa();

            Borda b = new Borda();
            b.setTipoBorda("Cheddar");
            b.setValor(5.0);

            p.setBorda(b);
        } else if (PizzaEnum.RUCULA.equals(pizzaEnum)) {
            p = new PizzaRucula();
        } else if (PizzaEnum.QUATRO_QUEIJOS.equals(pizzaEnum)) {
            p = new PizzaQuatroQueijos();
        } else if (PizzaEnum.PORTUGUESA.equals(pizzaEnum)) {
            p = new PizzaPortuguesa();
        } else if (PizzaEnum.FRANGO_CATUPIRY.equals(pizzaEnum)) {
            p = new PizzaFrangoCatupiry();
        }

        return p;
    }
}

package Heranca;

public class Main {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.setNome("Totó");
        System.out.println(a.getNome());

        Cachorro c = new Cachorro("Lyly", "Vira-lata");
        c.setNome("Jax");
        System.out.println(c.getNome());
        c.latir();

        // Polimorfismo
        Animal a2 = new Cachorro("Toto", "Vira-lata");
        if (a2 instanceof Cachorro) {
            Cachorro c2 = (Cachorro) a2;
            c2.latir();
        }

        cadastrar(a2);
        cadastrar(c);

        Galinha g = new Galinha("Filó");
        System.out.println(g.getNome());
        g.botarOvo();
        cadastrar(g);
    }

    // Função cadastrar aceita qualquer objeto do tipo Animal e objetos que herdam de Animal (Generalista)
    public static void cadastrar(Animal a) {
        System.out.println("Cadastrar " + a.getNome());
    }

    // Função cadastrarCachorro aceita apenas objetos do tipo Cachorro (Específica)
    public static void cadastrarCachorro(Cachorro a) {
        System.out.println("Cadastrar " + a.getNome());
    }
}

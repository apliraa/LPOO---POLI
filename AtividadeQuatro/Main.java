package AtividadeQuatro;

public class Main{

    public static void main(String[] args) {

        Animal a1 = new Animal("Cacau", 1.9);
        Animal a2 = new Animal("Tobi", 5.5);

        a1.setPeso(3.5);
        a2.setPeso(4.3);

        a1.print();
        a2.print();
    }

}
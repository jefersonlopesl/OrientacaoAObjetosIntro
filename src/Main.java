public class Main {
    public static void main(String[] args) {
        Guitar fender = new Guitar();
        fender.chords = 6;
        fender.name = "Fender";


        Guitar ibanez = new Guitar();
        ibanez.chords = 6;
        ibanez.name = "Ibanez";

        System.out.println("Marca: "+fender.name);
        System.out.println("Quantidades de cordas: "+fender.chords);

    }
}
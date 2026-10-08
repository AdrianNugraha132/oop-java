public class Anjing extends Mamalia {
    public Anjing() {
        super("Anjing", "Karnivora", true);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Guk Guk!");
    }
}
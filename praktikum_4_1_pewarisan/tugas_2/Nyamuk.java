public class Nyamuk extends Serangga {
    public Nyamuk() {
        super("Nyamuk", "Darah", 6);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Ngingggg...");
    }
}
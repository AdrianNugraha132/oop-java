public class Monyet extends Mamalia {
    public Monyet() {
        super("Monyet", "Omnivora (Buah & Serangga)", true);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Uu Uu Aa Aa!");
    }
}
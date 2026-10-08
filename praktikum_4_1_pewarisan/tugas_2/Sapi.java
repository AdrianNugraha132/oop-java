public class Sapi extends Mamalia {
    public Sapi() {
        super("Sapi", "Herbivora (Rumput)", true);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Mooo!");
    }
}
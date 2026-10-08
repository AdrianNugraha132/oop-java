public class Lebah extends Serangga {
    public Lebah() {
        super("Lebah", "Nektar Bunga", 6);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Zzzzzzz...");
    }
}
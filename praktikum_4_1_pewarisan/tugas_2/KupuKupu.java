public class KupuKupu extends Serangga {
    public KupuKupu() {
        super("Kupu-kupu", "Nektar Bunga", 6);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " tidak bersuara, hanya mengepakkan sayap.");
    }
}
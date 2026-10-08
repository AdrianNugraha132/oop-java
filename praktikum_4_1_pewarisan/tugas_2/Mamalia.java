public class Mamalia extends Binatang {
    public boolean berbulu;

    public Mamalia(String nama, String jenisMakanan, boolean berbulu) {
        super(nama, jenisMakanan);
        this.berbulu = berbulu;
    }

    public void menyusui() {
        System.out.println(nama + " berkembang biak dengan cara melahirkan dan menyusui.");
    }
}
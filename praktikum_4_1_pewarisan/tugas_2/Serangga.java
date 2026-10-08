public class Serangga extends Binatang {
    public int jumlahKaki;

    public Serangga(String nama, String jenisMakanan, int jumlahKaki) {
        super(nama, jenisMakanan);
        this.jumlahKaki = jumlahKaki;
    }

    public void bertelur() {
        System.out.println(nama + " berkembang biak dengan cara bertelur.");
    }
}
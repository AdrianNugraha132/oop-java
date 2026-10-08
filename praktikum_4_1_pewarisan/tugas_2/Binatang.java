public class Binatang {
    public String nama;
    public String jenisMakanan;

    public Binatang(String nama, String jenisMakanan) {
        this.nama = nama;
        this.jenisMakanan = jenisMakanan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Binatang : " + nama);
        System.out.println("Jenis Makanan : " + jenisMakanan);
    }

    public void bersuara() {
        System.out.println(nama + " mengeluarkan suara...");
    }
}
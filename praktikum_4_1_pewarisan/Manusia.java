public class Manusia {

    public String nama;
    public String alamat;

    public Manusia() {
        this.nama = "Yani";
        this.alamat = "Indramayu";
    }

    public static void main(String[] args) {
        Manusia m = new Manusia();
        System.out.println("Nama: " + m.nama);
        System.out.println("Alamat: " + m.alamat);
    }
}

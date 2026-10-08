public class Undergraduate extends Student {
    public int year;
    public String minor;

    public Undergraduate(String name, String id, String major, int year, String minor) {
        super(name, id, major); // Memanggil constructor induk (Student)
        this.year = year;
        this.minor = minor;
    }

    public void tampilkanInfoUndergraduate() {
        System.out.println("--- Data Mahasiswa S1 (Undergraduate) ---");
        tampilkanInfoDasar(); // Memanggil method dari induk
        System.out.println("Tahun : " + year);
        System.out.println("Minor : " + minor);
    }
}
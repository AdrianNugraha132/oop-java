public class Graduate extends Student {
    public String advisor;
    public String thesis;

    public Graduate(String name, String id, String major, String advisor, String thesis) {
        super(name, id, major); // Memanggil constructor induk (Student)
        this.advisor = advisor;
        this.thesis = thesis;
    }

    public void tampilkanInfoGraduate() {
        System.out.println("--- Data Mahasiswa Pascasarjana (Graduate) ---");
        tampilkanInfoDasar(); // Memanggil method dari induk
        System.out.println("Advisor: " + advisor);
        System.out.println("Thesis : " + thesis);
    }
}

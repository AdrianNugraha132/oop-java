public class Pegawai extends Manusia {

    public String nip;
    public String institusi;

    public Pegawai() {
        this.nip = "001002";
        this.institusi = "Polindra";
    }

    public static void main(String[] args) {
        Pegawai p = new Pegawai();
        System.out.println("NIP: " + p.nip);
        System.out.println("Nama: " + p.nama);
        System.out.println("Institusi: " + p.institusi);
        System.out.println("Alamat: " + p.alamat);
    }
}

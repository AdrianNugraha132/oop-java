public class TestMobil {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobilKu = new Mobil();

        // Mengisi properti
        mobilKu.warna = "Merah";
        mobilKu.merk  = "Toyota";

        // Menampilkan data mobil
        System.out.println("Warna mobil : " + mobilKu.warna);
        System.out.println("Merk mobil  : " + mobilKu.merk);

        // Latihan 1: memanggil method maju() dan mundur()
        mobilKu.maju();
        mobilKu.mundur();

        // Latihan 2: menggunakan setter & getter nomorPolisi
        mobilKu.setNomorPolisi("B 1234 XYZ");
        System.out.println("Nomor Polisi: " + mobilKu.getNomorPolisi());
    }
}
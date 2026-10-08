public class MainBangunDatar {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        Persegi p = new Persegi(4);
        Segitiga s = new Segitiga(6, 3);
        Lingkaran l = new Lingkaran(50);

        // memanggil luas dan keliling
        bd.luas();
        bd.keliling();
        System.out.println("Luas Persegi: " + p.luas());
        System.out.println("Keliling Persegi: " + p.keliling());
        System.out.println("Luas Segitiga: " + s.luas());
        System.out.println("Keliling Segitiga: " + s.keliling());
        System.out.println("Luas Lingkaran: " + l.luas());
        System.out.println("Keliling Lingkaran: " + l.keliling());
    }
}
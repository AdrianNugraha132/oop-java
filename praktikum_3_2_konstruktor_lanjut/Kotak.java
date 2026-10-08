class Kotak {
    double panjang;
    double lebar;
    double tinggi;

    Kotak(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    double hitungVolume() {
        return (panjang * lebar * tinggi);
    }

    // Method main dipindahkan ke dalam class Kotak
    public static void main(String[] args) {
        Kotak k1, k2;
        k1 = new Kotak(4, 3, 2);
        k2 = new Kotak(6, 5, 4);

        System.out.println("Volume kotak 1 = " + k1.hitungVolume() + " cm");
        System.out.println("Volume kotak 2 = " + k2.hitungVolume() + " cm");
    }
}
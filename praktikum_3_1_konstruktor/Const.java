//Contoh Konstruktor Tanpa Argumen:
// public class Const {
//     static final double pi = 3.14;
//     double radius;
//     String warna;

//     //constructor tanpa argumenn

//     public Const() {}

//     //metode untuk menghitung luas lingkaran
//     double luasLingkaran() {
//         return pi*radius*radius;
//     }
//     public static void main(String[] args) {
//         Const lingk = new Const();
//         System.out.println("Luas lingkaran = "+lingk.luasLingkaran());
//         System.out.println("Warna lingkaran = "+lingk.warna);
//     }
// }

//Contoh Konstruktor Dengan Argumen:
public class Const {
    static final double pi = 3.14;
    double radius;
    String warna;

    //constructor tanpa argumenn

    public Const(double r, String w) {
        this.radius = 2;
        this.warna = w;
    }

    //metode untuk menghitung luas lingkaran
    double luasLingkaran() {
        return pi*radius*radius;
    }
    public static void main(String[] args) {
        Const lingk = new Const(10, "merah");
        System.out.println("Luas lingkaran = "+lingk.luasLingkaran());
        System.out.println("Warna lingkaran = "+lingk.warna);
    }
}
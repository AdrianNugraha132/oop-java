//Contoh Overloading Constructor
public class Sepatu {
    public String warna;
    public int nomorSepatu;

    //konstrtuktor pertama
    public Sepatu(String warna, int nomorSepatu) {
        this.warna = warna;
        this.nomorSepatu = nomorSepatu;
        System.out.println(this.warna);
        System.out.println(nomorSepatu);
    }

    //konstruktor  kedua
    public Sepatu() {
        System.out.println(warna);
        System.out.println(nomorSepatu);
    }

    public static  void  main(String[] args) {
        Sepatu sepatu1 = new Sepatu("merah", 43);
        Sepatu sepatut2 = new Sepatu();
    }
}

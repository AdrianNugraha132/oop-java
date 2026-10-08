public class NilaiTerbesar {
    public static void main(String[] args) {
        int angka1 = 10;
        int angka2 = 23;
        int angka3 = 5;
        
        // Mencari nilai terbesar menggunakan operator kondisi (ternary)
        int terbesar = (angka1 > angka2) 
                        ? ((angka1 > angka3) ? angka1 : angka3)
                        : ((angka2 > angka3) ? angka2 : angka3);
        
        // Menampilkan output
        System.out.println("Angka 1 = " + angka1);
        System.out.println("Angka 2 = " + angka2);
        System.out.println("Angka 3 = " + angka3);
        System.out.println();
        System.out.println("Nilai terbesar adalah angka = " + terbesar);
    }
}
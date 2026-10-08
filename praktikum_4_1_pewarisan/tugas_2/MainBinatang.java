public class MainBinatang {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM INHERITANCE BINATANG ===\n");

        // --- Menguji Cabang Mamalia ---
        System.out.println("--- Kategori Mamalia ---");
        Monyet monyet = new Monyet();
        monyet.tampilkanInfo();
        monyet.bersuara();
        monyet.menyusui(); 
        System.out.println();

        Anjing anjing = new Anjing();
        anjing.tampilkanInfo();
        anjing.bersuara();
        anjing.menyusui();
        System.out.println();

        Sapi sapi = new Sapi();
        sapi.tampilkanInfo();
        sapi.bersuara();
        sapi.menyusui();
        System.out.println();

        // --- Menguji Cabang Serangga ---
        System.out.println("--- Kategori Serangga ---");
        Lebah lebah = new Lebah();
        lebah.tampilkanInfo();
        lebah.bersuara();
        lebah.bertelur(); 
        System.out.println();

        KupuKupu kupu = new KupuKupu();
        kupu.tampilkanInfo();
        kupu.bersuara();
        kupu.bertelur();
        System.out.println();

        Nyamuk nyamuk = new Nyamuk();
        nyamuk.tampilkanInfo();
        nyamuk.bersuara();
        nyamuk.bertelur();
    }
}
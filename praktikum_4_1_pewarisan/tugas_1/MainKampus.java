public class MainKampus {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM INHERITANCE MAHASISWA ===\n");

        // Membuat objek Mahasiswa S1 (Undergraduate)
        Undergraduate mhsS1 = new Undergraduate(
            "Budi Santoso", 
            "10121001", 
            "Teknik Informatika", 
            3, 
            "Sistem Cerdas"
        );

        // Membuat objek Mahasiswa S2 (Graduate)
        Graduate mhsS2 = new Graduate(
            "Siti Aminah", 
            "20122005", 
            "Ilmu Komputer", 
            "Dr. Ir. Budi, M.T.", 
            "Analisis Algoritma Machine Learning"
        );

        // Menampilkan data
        mhsS1.tampilkanInfoUndergraduate();
        System.out.println(); // Baris kosong pemisah
        mhsS2.tampilkanInfoGraduate();
    }
}
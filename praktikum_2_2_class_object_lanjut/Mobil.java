public class Mobil {
    // Properti
    String warna;
    String merk;      
    String nomorPolisi; 

    // Method maju()
    public void maju() {
        System.out.println("Maju");
    }

    // Method mundur()
    public void mundur() {
        System.out.println("Mundur");
    }

    // ===== Setter & Getter untuk nomorPolisi =====
    public void setNomorPolisi(String nomorPolisi) {
        this.nomorPolisi = nomorPolisi;
    }

    public String getNomorPolisi() {
        return nomorPolisi;
    }
}
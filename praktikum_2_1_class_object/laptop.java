//1. Contoh penulisan class di Java

// public class laptop {
//     // isi dari class laptop
// }

//2. Contoh penulisan class dengan penambahan property

// public class laptop {
//     // isi dari class laptop
//     String pemilik;
//     String merk;
//     String ukuranLayar;
// }

//6. Contoh menambahkan method pada class laptop

// public class laptop {
//     // isi dari class laptop
//     String pemilik;
//     String merk;
//     String ukuranLayar;

//     // method menyala
//     public void menyala() {
//         System.out.println("Menyala");
//     }
// }

//8. Contoh menambahkan method Setter dan Getter

public class laptop {
    // isi dari class laptop
    String pemilik;
    String merk;
    String ukuranLayar;

    // method menyala
    public void menyala() {
        System.out.println("Menyala");
    }

    // setter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // getter
    public String getMerk() {
        return merk;
    }
}   
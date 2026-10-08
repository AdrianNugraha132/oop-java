//7. Contoh memanggil method menyala() dari class laptop

// public class TestLaptop {
//     public static void main(String[] args) {
//         laptop l = new laptop();
//         l.menyala();
//     }
// }

//9. Contoh memanggil method setter dan getter

public class TestLaptop {
    public static void main(String[] args) {
        laptop l = new laptop();
        l.menyala();
        l.setMerk("Lenovo");
        System.out.println(l.getMerk());
    }
}
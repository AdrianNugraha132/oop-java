// public class CreatePencil {
//     public static void main(String[] args) {
//         pencil pl = new pencil(); // membuat objek
//         System.out.println("Color: " + pl.color);
//     }
// }

//5. Contoh implementasi modifier static

public class CreatePencil {
    public static void main(String[] args) {
        pencil p1 = new pencil(); // membuat objek
        System.out.println("Color: " + p1.color);

        pencil.nextID++;
        System.out.println(p1.nextID); // Result? 1

        pencil p2 = new pencil();
        pencil.nextID++;
        System.out.println(p2.nextID); // Result? 2
        System.out.println(p1.nextID); // Result? masih 2
    }
}
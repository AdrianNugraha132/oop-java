public class Student {

    public String name;
    public String id;
    public String major;

    public Student(String name, String id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
    }

    public void tampilkanInfoDasar() {
        System.out.println("Nama  : " + name);
        System.out.println("ID    : " + id);
        System.out.println("Jurusan: " + major);
    }
}

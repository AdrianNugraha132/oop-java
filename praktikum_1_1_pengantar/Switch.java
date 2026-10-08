//switch
public class Switch {

    public static void main(String[] args) {
        int x = 1;
        switch (x) {
            case 1:
                System.out.println("senin");
                break;
            case 2:
                System.out.println("selasa");
                break;
            case 3:
                System.out.println("rabu");
                break;
            case 4:
                System.out.println("kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("sabtu");
                break;
            case 7:
                System.out.println("minggu");
            default:
                System.out.println("salah input hari");
                break;
        }
    }
}

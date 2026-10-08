public class MainKonversiSuhu {
    public static void main(String[] args) {
        double celsius = 100;

        Fahrenheit cf = new Fahrenheit(celsius);
        Kelvin ck = new Kelvin(celsius);
        Reamur cr = new Reamur(celsius);

        System.out.println("Suhu Celcius: " + celsius + " C");
        System.out.println("Konversi ke Fahrenheit: " + cf.hitungSuhu() + " F");
        System.out.println("Konversi ke Kelvin: " + ck.hitungSuhu() + " K");
        System.out.println("Konversi ke Reamur: " + cr.hitungSuhu() + " R");
    }
}
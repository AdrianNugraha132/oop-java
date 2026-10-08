public class Fahrenheit extends KonversiSuhu {

    public Fahrenheit(double suhu) {
        super(suhu);
    }

    @Override
    public double hitungSuhu() {
        return (9.0 / 5.0) * suhu + 32;
    }
}

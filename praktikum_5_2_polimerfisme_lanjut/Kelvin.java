
public class Kelvin extends KonversiSuhu {

    public Kelvin(double suhu) {
        super(suhu);
    }

    @Override
    public double hitungSuhu() {
        return suhu + 273;
    }
}

public class Reamur extends KonversiSuhu {

    public Reamur(double suhu) {
        super(suhu);
    }

    @Override
    public double hitungSuhu() {
        return (4.0 / 5.0) * suhu;
    }
}
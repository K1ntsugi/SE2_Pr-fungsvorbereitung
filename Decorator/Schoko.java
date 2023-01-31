public class Schoko extends Zutat {

    public Schoko(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public double getPreis() {
        return getraenk.getPreis() + 0.5;
    }

}

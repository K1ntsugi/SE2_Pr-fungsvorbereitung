public class Milchschaum extends Zutat {
    Milchschaum(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public double getPreis() {
        return getraenk.getPreis() + 0.75;
    }
}

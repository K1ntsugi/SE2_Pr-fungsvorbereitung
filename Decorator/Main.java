public class Main {

    public static void main(String[] args) {
        Standard caffee = new Standard();
        Schoko s = new Schoko(caffee);
        Milchschaum m = new Milchschaum(s);
        System.out.println(m.getPreis());
    }

}

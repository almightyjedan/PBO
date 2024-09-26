public class App {
    public static void main(String[] args) throws Exception {
        Binatang kambing = new Binatang("Kambing");
        Kucing mudreg = new Kucing("Mudreg");
        Cemeng mocha = new Cemeng("Mocha");

        kambing.bersuara();
        mudreg.bersuara();
        mocha.bersuara();
    }
}
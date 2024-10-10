public class Main {

    public static void main(String[] args) {
        Jagoan jakasembung = new Jagoan("Jaka Sembung");
        Jubah jubahPutih = new Jubah("Jubah Puting",7,50);
        Senjata golok = new Senjata("Golok", 25);
        jakasembung.setJubah(jubahPutih);
        jakasembung.setSenjata(golok);

        Jagoan pitung = new Jagoan("Si Pitung");
        Jubah jubahHitam = new Jubah("Jubah Hitam",8,52);
        Senjata toya = new Senjata("Toya", 24);
        pitung.setJubah(jubahHitam);
        pitung.setSenjata(toya);

        jakasembung.display();
        pitung.display();

        System.out.println("===Saling Serang dan Saling Beri===\n");

        jakasembung.attack(pitung);
        jakasembung.attack(pitung);
        pitung.attack(jakasembung);
        jakasembung.attack(pitung);
        pitung.attack(jakasembung);
    }
}
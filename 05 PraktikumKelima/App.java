public class App {
    public static void main(String[] args) throws Exception {
        Spider laba2sunda = new Spider();
        laba2sunda.eat();
        System.out.println();


        Dog Max = new Dog();
        Max.setName("Max");
        System.out.println("Nama anjing saya adalah " + Max.getName());
        Max.play();
        Max.eat();
        Max.walk();
        System.out.println();

        Cat Neko = new Cat("Neko");
        System.out.println("Nama kucing Saya adalah " + Neko.getName());
        Neko.play();
        Neko.eat();
        Neko.walk();
    }
}
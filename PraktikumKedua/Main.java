public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jedan",19,"Jakarta");
        person1.display();
   
        person1.setName("Ahbab");
        person1.setAge(20);
        person1.setAlamat("Ciracas");

        System.out.println("Updated");
        person1.display();
    }
}
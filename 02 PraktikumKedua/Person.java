public class Person {
    private String name;
    private int age;
    private String alamat;

    public Person(String name, int age, String alamat) {
        this.name = name;
        this.age = age;
        this.alamat = alamat;
    }

    public void display() {
        System.out.println("Nama   : " + this.name);
        System.out.println("Umur   : " + this.age);
        System.out.println("Alamat : " + this.alamat);
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge() {
        return this.age;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getAlamat() {
        return this.alamat;
    }
}
public class Senjata {
    
    private String name;
    private int attack;

    public Senjata(String name, int attack){
        this.name = name;
        this.attack = attack;
    }

    public int getAttack(){
        return this.attack;
    }

    void display() {
        System.out.println("Weapon : " + this.name + ", Damage : " + this.attack);
    }
}
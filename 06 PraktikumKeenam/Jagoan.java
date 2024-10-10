public class Jagoan {
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int incrementHealth;
    private int incrementAttack;
    private int level;
    private int totalDamage;
    private boolean isAlive;

    // Ini adalah object member
    private Jubah armor;
    private Senjata senjata;

    public Jagoan(String name){
        this.name = name;
        this.baseHealth = 300;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        this.isAlive = true;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.maxHealth() - this.totalDamage;
    }

    public void display(){
        System.out.println("Jagoan\t\t: " + this.name);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Darah\t\t: " + this.getHealth() +"/" + this.maxHealth());
        System.out.println("Damage\t\t: " + this.getAttackPower());
        System.out.println("Hidup\t\t: " + this.isAlive + "\n");
    }

    public void attack(Jagoan opponent){
        // hitung damage
        int damage = this.getAttackPower();
        // print event
        System.out.println(this.name + " Menyerang " + opponent.getName() + " Dengan Damage " + damage);
        // attack si opponent
        opponent.defence(damage);

        this.levelUp();
    }

    public void defence(int damage){

        // receive damage
        int defencePower = this.armor.getDefencePower();
        int deltaDamage;

        System.out.println("Jubah Defense " +this.name + " = " + defencePower);
        if(damage > defencePower){
            deltaDamage = damage - defencePower;
        } else {
            deltaDamage = 0;
        }
        
        System.out.println(this.name + " Menerima Damage = " + deltaDamage + "\n");
        
        // adding total damage
        this.totalDamage += deltaDamage;

        // check is alive
        if (this.getHealth() <= 0){
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
        }

        this.display();
    }
    
    private int getAttackPower(){
        return this.baseAttack + this.level*this.incrementAttack + this.senjata.getAttack();
    }

    private void levelUp(){
        this.level++;
    }

    public void setJubah(Jubah armor){
        this.armor = armor;
    }

    public void setSenjata(Senjata senjata){
        this.senjata = senjata;
    }

    public int maxHealth(){
        return this.baseHealth + this.level*this.incrementHealth + this.armor.getAddHealth();
    }


}
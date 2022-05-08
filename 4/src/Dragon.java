import java.util.ArrayList;

public class Dragon extends Unit{
    public int flyspeed;

    public Dragon(String name, int hp, int attack, int defence, int flyspeed, Weapon weapon, Armour armour, ArrayList<Item> inventory){
        super(name, hp, attack, defence, weapon, armour, inventory);
        this.flyspeed = flyspeed;
    }

    public void fly(){
        System.out.println("Дракон летит");
    }

    public void fireBreath(){
        System.out.println("Дышим огнем!");
    }
}


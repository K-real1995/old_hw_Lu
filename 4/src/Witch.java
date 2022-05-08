import java.util.ArrayList;

public class Witch extends Unit{
    public int flyspeed;

    public Witch(String name, int hp, int attack, int defence, int flyspeed, Weapon weapon, Armour armour, ArrayList<Item> inventory){
        super(name, hp, attack, defence, weapon, armour, inventory);
        this.flyspeed = flyspeed;
    }

    public void witchCraft(){
        System.out.println(name + " Колдует");
    }
}

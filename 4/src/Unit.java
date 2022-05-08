import java.util.ArrayList;

public class Unit {
    public ArrayList<Item> inventory;
    public String name;
    public int hp;
    public int attack;
    public int defence;
    public Weapon weapon;
    public Armour armour;

    public Unit(String name, int hp, int attack, int defence, Weapon weapon, Armour armour, ArrayList<Item> inventory){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.inventory = inventory;
        this.weapon = weapon;
        this.armour = armour;


    }


    //Для двух полей выше разработать механизм прочности, когда при битвах прочность оружия и брони уменьшается.
    //В случае, когда прочность достигнет 0 эффекты которые дают предметы должны перестать работать
    public void attack(Unit target){
        int totalAttack = weapon.weaponAttack + attack;
        int totalDefence = target.armour.itemStrength + target.defence;
        int damage;

        if (weapon.weaponAttack > target.armour.itemStrength) {
            System.out.println(target.armour.itemName + ": данный предмет разбит и больше вас не защищает!");
            target.armour.itemStrength = 0;
            damage = totalAttack - target.defence;
        }

        else if (weapon.itemStrength < target.armour.itemStrength) {
            System.out.println("Ваше оружие " + weapon.itemName + " :cломано, атака снижена!");
            weapon.weaponAttack = 0;
            damage = attack - totalDefence;
        }

        else {
            damage = totalAttack - totalDefence;
        }

        if (damage > 0) {
            target.hp -= damage;
            System.out.println(name + " наносит " + damage + " урона!");
            System.out.println("Здоровье " + target.name + ": " + target.hp);
        }
        else
            System.out.println("Броня не пробита!");

        // Метод отнимающий у побежденного противника оружие броню и содержимое инвентаря
        if(target.hp <= 0){
            target.inventory.addAll(inventory);
            inventory.add(target.weapon);
            inventory.add(target.armour);
            target.armour = null;
            target.weapon = null;
            target.inventory.clear();
        }

    }
}



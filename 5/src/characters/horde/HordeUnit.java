package characters.horde;

import characters.Unit;
import things.armour.Armour;
import things.Item;
import things.weapons.Weapon;

import java.util.ArrayList;

public abstract class HordeUnit extends Unit {

    public HordeUnit(String name, int hp, int attack, int defence, int moneyCount, Weapon weapon, Armour armour,
                     ArrayList<Item> inventory, int maxWeight){
        super(name, hp, attack, defence, moneyCount, weapon, armour, inventory, maxWeight);

    }

    @Override
    public void attack(Unit target){
        int damage;

        if (weapon.weaponAttack > target.armour.itemStrength) {
            System.out.println(target.armour.itemName + ": данный предмет разбит и больше вас не защищает!");
            target.defence -= target.armour.itemStrength;
            damage = attack - target.defence;
        }

        else if (weapon.itemStrength < target.armour.itemStrength) {
            System.out.println("Ваше оружие " + weapon.itemName + " :cломано, атака снижена!");
            attack -= weapon.weaponAttack;
            damage = attack - target.defence;
        }

        else {
            damage = attack - target.defence;
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
            drop(target);
        }
    }

    @Override
    public int getInventoryWeight(ArrayList<Item> target){
        int totalInventoryWeight = 0;
        for (Item item : target) {
            int weight = item.itemWeight;
            totalInventoryWeight += weight;
        }
        return totalInventoryWeight;
    }


}

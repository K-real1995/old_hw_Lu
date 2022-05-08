import characters.Unit;
import characters.aliance.NightElf;
import characters.horde.Orc;
import things.Item;
import things.armour.Armour;
import things.armour.BreastАrmour;
import things.armour.HeadArmour;
import things.weapons.MeeleWeapon;
import things.weapons.RangedWeapon;
import things.weapons.Weapon;

import java.io.*;
import java.util.ArrayList;
public class Game {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Создаем оружие для юнитов
        Weapon axe = new MeeleWeapon("Топор", 25, 22, 10, 50);
        Weapon bow = new RangedWeapon("Лук", 10, 15, 35, 95);


        //Создаем Броню для юнитов
        Armour helmet = new HeadArmour("Шлем", 30, 63);
        Armour hauberk = new BreastАrmour("Кольчуга", 50, 19, 84);


        //Создаем инвентарь для юнитов
        ArrayList<Item> inventoryForOrche = new ArrayList<Item>();
        inventoryForOrche.add(new BreastАrmour("Наплечники", 100, 24, 25));
        inventoryForOrche.add(new MeeleWeapon("Булава", 101, 21, 33, 45));
        ArrayList<Item> inventoryForElf = new ArrayList<Item>();
        inventoryForOrche.add(new BreastАrmour("Рубашка", 100, 11, 65));
        inventoryForOrche.add(new MeeleWeapon("Нож", 20, 15, 95, 98));


        //Создаем юнитов и экипируем им оружие и броню
        Unit orche = new Orc("Орче", 100, 150, 25, 100, axe, helmet,
                inventoryForOrche, 1000);
        axe.equipWeapon(orche);
        helmet.equipArmour(orche);
        Unit elf = new NightElf("Эльф", 80, 30, 15, 100, bow, hauberk,
                inventoryForElf, 1000);
        bow.equipWeapon(elf);
        hauberk.equipArmour(elf);


        //Сохраняем юнита
        SaveUnit.saveUnit(orche);
        //Загружаем сохраненного юнита
        System.out.println(SaveUnit.loadUnits());

    }
}

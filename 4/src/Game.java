import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {
        //Создаем оружие для юнитов
        Weapon axe = new Weapon("Топор", 25, 22);
        Weapon bow = new Weapon("Лук", 10, 15);
        Weapon claw = new Weapon("Когти", 50, 100);
        Weapon broomstick = new Weapon("Метла", 30, 10);
        //Создаем Броню для юнитов
        Armour helmet = new Armour("Шлем", 30);
        Armour hauberk = new Armour("Кольчуга", 50);
        Armour dragonRing = new Armour("Кольцо дракона", 20);
        Armour cloak = new Armour("Плащ", 15);

        //Создаем инвентарь для юнитов
        ArrayList<Item> inventoryForOrche = new ArrayList<Item>();
        inventoryForOrche.add(new Armour("Наплечники", 100));
        inventoryForOrche.add(new Weapon("Булава", 101, 21));
        ArrayList<Item> inventoryForElf = new ArrayList<Item>();
        inventoryForOrche.add(new Armour("Рубашка", 100));
        inventoryForOrche.add(new Weapon("Нож", 20, 15));
        ArrayList<Item> inventoryForYaga = new ArrayList<Item>();
        ArrayList<Item> inventoryForGorynych = new ArrayList<Item>();

        //Создаем юнитов
        Unit orche = new Unit("Орче", 100, 50, 25, axe, helmet, inventoryForOrche);
        Unit elf = new Unit("Эльф", 80, 30, 15, bow, hauberk, inventoryForElf);
        Dragon gorynych = new Dragon("Горыныч", 1000, 40, 100, 33, claw, dragonRing, inventoryForGorynych);
        Witch yaga = new Witch("Яга",100, 50, 25, 15, broomstick, cloak, inventoryForYaga);





    }
}

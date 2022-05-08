//Создать отдельный класс под оружие, добавив ему набор параметров и передавать его его нашим юнитам
public class Weapon extends Item {
    public int weaponAttack;


    public Weapon(String itemName, int weaponAttack, int itemStrength){
        super(itemName,itemStrength);
        this.weaponAttack = weaponAttack;

    }
}

package characters;
import things.Item;
import java.util.ArrayList;

interface UnitInterface {
    public int getInventoryWeight(ArrayList<Item> target);
    public void attack(Unit target);
    public void drop(Unit target);
}


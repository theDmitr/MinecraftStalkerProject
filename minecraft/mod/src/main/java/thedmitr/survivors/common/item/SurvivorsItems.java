package thedmitr.survivors.common.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class SurvivorsItems {

    private static final List<Item> items = new ArrayList<>();


    public static final FoodItem bread = addItem(
            new FoodItem("bread", "food/bread", 2, 5f));

    public static final AmmoItem ammo_9_mm = addItem(
            new AmmoItem("ammo_9_mm", "ammo/ammo_9_mm"));

    public static final AmmoItem ammo_7_62_mm = addItem(
            new AmmoItem("ammo_7_62_mm", "ammo/ammo_7_62_mm"));


    public static <T extends Item> T addItem(T item) {
        items.add(item);
        return item;
    }

    public static void register() {
        for(Item item : items)
            GameRegistry.registerItem(item, item.getUnlocalizedName());
    }

}

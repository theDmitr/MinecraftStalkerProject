package thedmitr.survivors.common.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import thedmitr.survivors.common.ItemTabs;

import java.util.ArrayList;
import java.util.List;

public class SurvivorsItems {

    private static final List<Item> items = new ArrayList<>();


    public static final FoodItem bread = addItem(
            new FoodItem("bread", "bread", 2, 5f));

    public static final GeneralItem ammo_9_mm = addItem(
            new GeneralItem("ammo_9_mm", "ammo_9_mm"));

    public static final GeneralItem ammo_7_62_mm = addItem(
            new GeneralItem("ammo_7_62_mm", "ammo_7_62_mm"));

    public static final GeneralItem chemical_protector = addItem(
            new GeneralItem("chemical_protector", "chemical_protector"));

    public static final GeneralItem bandage = addItem(
            new GeneralItem("bandage", "bandage"));

    public static final DrinkItem energy_drink = addItem(
            new DrinkItem("energy_drink", "energy_drink"));

    public static final GeneralItem empty_can_2 = addItem(
            new GeneralItem("empty_can_2", "empty_can_2"));

    public static final GeneralItem empty_can_1 = addItem(
            new GeneralItem("empty_can_1", "empty_can_1"));


    public static <T extends Item> T addItem(T item) {
        return addItem(item, ItemTabs.items_tab);
    }

    public static <T extends Item> T addItem(T item, ItemTabs tab) {
        item.setCreativeTab(tab);
        items.add(item);
        return item;
    }

    public static void register() {
        for(Item item : items)
            GameRegistry.registerItem(item, item.getUnlocalizedName());
    }

}

package thedmitr.survivors.common.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import thedmitr.survivors.common.ItemTabs;

import java.util.HashMap;
import java.util.Map;

public class SurvivorsItems {

    private static final Map<String, Item> items_map = new HashMap<>();

    public static Item get(String name) {
        name = "item." + name;
        if (!items_map.containsKey(name))
            return null;
        return items_map.get(name);
    }

    private static void register(Item item) {
        item.setCreativeTab(ItemTabs.items_tab);
        GameRegistry.registerItem(item, item.getUnlocalizedName());
        items_map.put(item.getUnlocalizedName(), item);
    }

    public static void register() {
        register(new GeneralItem("ammo_9_mm", "ammo_9_mm"));
        register(new GeneralItem("ammo_7_62_mm", "ammo_7_62_mm"));
        register(new GeneralItem("empty_can_1", "empty_can_1"));
        register(new GeneralItem("empty_can_2", "empty_can_2"));
        register(new GeneralItem("chemical_protector", "chemical_protector"));
        register(new GeneralItem("bandage", "bandage"));
        register(new DrinkItem("energy_drink", "energy_drink"));
        register(new FoodItem("bread", "bread", 2, 5f));
    }

}

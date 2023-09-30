package thedmitr.survivors.common.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class SurvivorsItems {

    private static final List<Item> items = new ArrayList<>();


    public static final Item bread = additem(new Food("bread", 2, 5f));


    public static Item additem(Item item) {
        items.add(item);
        return item;
    }

    public static void register() {
        for(Item item : items)
            GameRegistry.registerItem(item, item.getUnlocalizedName());
    }

}

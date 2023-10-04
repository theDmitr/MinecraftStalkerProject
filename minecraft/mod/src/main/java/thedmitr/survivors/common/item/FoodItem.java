package thedmitr.survivors.common.item;

import net.minecraft.item.ItemFood;
import thedmitr.survivors.Survivors;

public class FoodItem extends ItemFood {

    public FoodItem(String name, String texture, int healAmount, float saturationModifier) {
        super(healAmount, saturationModifier, false);
        setUnlocalizedName(name);
        setTextureName(Survivors.MODID + ":" + texture);
        setAlwaysEdible();
    }

}

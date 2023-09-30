package thedmitr.survivors.common.item;

import net.minecraft.item.ItemFood;
import thedmitr.survivors.Survivors;

public class Food extends ItemFood {

    public Food(String name, int healAmount, float saturationModifier) {
        super(healAmount, saturationModifier, false);
        setUnlocalizedName(name);
        setTextureName(Survivors.MODID + ":food/" + name);
        setAlwaysEdible();
    }

}

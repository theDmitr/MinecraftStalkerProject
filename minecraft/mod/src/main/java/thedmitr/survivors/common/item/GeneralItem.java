package thedmitr.survivors.common.item;

import net.minecraft.item.Item;
import thedmitr.survivors.Survivors;

public class GeneralItem extends Item {

    public GeneralItem(String name, String texture) {
        setUnlocalizedName(name);
        setTextureName(Survivors.MODID + ":" + texture);
    }

}

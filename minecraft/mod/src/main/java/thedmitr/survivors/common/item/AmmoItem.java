package thedmitr.survivors.common.item;

import net.minecraft.item.Item;
import thedmitr.survivors.Survivors;

public class AmmoItem extends Item {

    public AmmoItem(String name, String texture) {
        setUnlocalizedName(name);
        setTextureName(Survivors.MODID + ":" + texture);
    }

}

package thedmitr.survivors.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import thedmitr.survivors.Survivors;

public class GeneralBlock extends Block {

    protected GeneralBlock(String name, String texture, Material material) {
        super(material);
        setBlockName(name);
        setBlockTextureName(Survivors.MODID + ':' + texture);
    }

}

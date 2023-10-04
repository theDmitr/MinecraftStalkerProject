package thedmitr.survivors.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GeneralBlock extends Block {

    protected GeneralBlock(String name, String texture) {
        super(Material.rock);
        setBlockName(name);
        setBlockTextureName(texture);
    }

    public String getBlockTextureName() {
        return textureName;
    }

}

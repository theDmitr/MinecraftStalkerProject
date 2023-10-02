package thedmitr.survivors.common.blocks;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;

public class PaneBlock extends BlockPane {

    public PaneBlock(String name, String frontTexture, String topTexture) {
        super(frontTexture, topTexture,
                Material.rock, false);
        setBlockName(name);
    }

}

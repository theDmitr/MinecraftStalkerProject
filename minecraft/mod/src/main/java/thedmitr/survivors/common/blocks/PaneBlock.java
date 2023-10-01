package thedmitr.survivors.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import thedmitr.survivors.Survivors;

public class PaneBlock extends BlockPane {

    public PaneBlock(String name, String frontTexture, String topTexture, Material material,
                     boolean canDrop, float hardness, SoundType stepSound) {
        super(Survivors.MODID + ':' + frontTexture, Survivors.MODID + ':' + topTexture,
                material, canDrop);
        setBlockName(name);
        setHardness(hardness);
        setStepSound(stepSound);
    }

}

package thedmitr.survivors.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class StairsBlock extends BlockStairs {

    public StairsBlock(String name, Block block) {
        super(block, 0);
        setBlockName(name);
    }

}

package thedmitr.survivors.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import thedmitr.survivors.Survivors;
import thedmitr.survivors.common.ItemTabs;

import java.util.Random;

public class GlassBlock extends GeneralBlock {

    public GlassBlock(String name, String texture) {
        super(name, texture, Material.glass);
        setHardness(3.0f);
        setStepSound(Block.soundTypeGlass);
    }

    public int quantityDropped(Random p_149745_1_) {
        return 0;
    }

    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass() {
        return 0;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

}

package thedmitr.survivors.common.blocks.rail;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import thedmitr.survivors.Survivors;

public class RailAngleBlock extends RailBlock {

    @SideOnly(Side.CLIENT)
    private IIcon blockIconTop0;

    @SideOnly(Side.CLIENT)
    private IIcon blockIconTop1;

    @SideOnly(Side.CLIENT)
    private IIcon blockIconTop2;

    @SideOnly(Side.CLIENT)
    private IIcon blockIconTop3;

    public RailAngleBlock(String name) {
        super(name);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
        if (side == 1)
            switch (meta) {
                case 0: return blockIconTop0;
                case 1: return blockIconTop1;
                case 2: return blockIconTop2;
                case 3: return blockIconTop3;
            }
        return blockIcon;
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Survivors.MODID + ":gravel_block");
        this.blockIconTop0 = iconRegister.registerIcon(Survivors.MODID + ":rails/gravel_rail_block_3");
        this.blockIconTop1 = iconRegister.registerIcon(Survivors.MODID + ":rails/gravel_rail_block_4");
        this.blockIconTop2 = iconRegister.registerIcon(Survivors.MODID + ":rails/gravel_rail_block_5");
        this.blockIconTop3 = iconRegister.registerIcon(Survivors.MODID + ":rails/gravel_rail_block_6");
    }

}

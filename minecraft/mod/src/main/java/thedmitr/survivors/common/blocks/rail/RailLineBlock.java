package thedmitr.survivors.common.blocks.rail;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import thedmitr.survivors.Survivors;

public class RailLineBlock extends RailBlock {

    @SideOnly(Side.CLIENT)
    private IIcon blockIconTop0;

    @SideOnly(Side.CLIENT)
    private IIcon blockIconTop1;

    public RailLineBlock(String name) {
        super(name);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
        if (side == 1)
            return meta == 0 || meta == 2 ? blockIconTop0 : blockIconTop1;
        return blockIcon;
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Survivors.MODID + ":gravel_block");
        this.blockIconTop0 = iconRegister.registerIcon(Survivors.MODID + ":rails/gravel_rail_block_1");
        this.blockIconTop1 = iconRegister.registerIcon(Survivors.MODID + ":rails/gravel_rail_block_2");
    }

}

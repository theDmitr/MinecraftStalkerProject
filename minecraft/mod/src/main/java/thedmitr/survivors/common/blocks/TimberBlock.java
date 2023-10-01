package thedmitr.survivors.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import thedmitr.survivors.Survivors;

public class TimberBlock extends MetableBlock {

    @SideOnly(Side.CLIENT)
    private IIcon blockIconTopBottom;

    public TimberBlock(String name, String texture) {
        super(name, Material.wood);
        setBlockTextureName(texture);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
        return side == 0 || side == 1 ? blockIconTopBottom : blockIcon;
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Survivors.MODID + ":" + getTextureName());
        this.blockIconTopBottom = iconRegister.registerIcon(Survivors.MODID + ":" + getTextureName() + "_top");
    }

}

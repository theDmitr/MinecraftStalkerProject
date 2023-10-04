package thedmitr.survivors.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class CustomTopIconBlock extends GeneralBlock {

    @SideOnly(Side.CLIENT)
    protected IIcon blockTopIcon;

    private final String masterTexture;

    public CustomTopIconBlock(String name, String topTexture, String masterTexture) {
        super(name, topTexture);
        this.masterTexture = masterTexture;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
        return side == 1 ? blockTopIcon : blockIcon;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(masterTexture);
        blockTopIcon = iconRegister.registerIcon(getBlockTextureName());
    }

}

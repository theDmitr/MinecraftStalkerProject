package thedmitr.survivors.common.blocks.rail;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import thedmitr.survivors.Survivors;

public class RailAngleBlock extends RailBlock {

    public RailAngleBlock(String name, String topTexture, String masterTexture) {
        super(name, topTexture, masterTexture);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
        return side == 1 ? blockTopIcons[meta] : blockIcon;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(masterTexture);

        blockTopIcons = new IIcon[4];
        for (int i = 0; i < blockTopIcons.length; i++) {
            blockTopIcons[i] = iconRegister.registerIcon(getTextureName() + "_" + (i + 3));
        }
    }

}

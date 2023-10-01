package thedmitr.survivors.common.blocks.rail;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import thedmitr.survivors.Survivors;

public class RailLineBlock extends RailBlock {

    public RailLineBlock(String name, String topTexture, String masterTexture) {
        super(name, topTexture, masterTexture);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
        if (side == 1)
            return meta == 0 || meta == 2 ? blockTopIcons[0] : blockTopIcons[1];
        return blockIcon;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Survivors.MODID + ":" + masterTexture);

        blockTopIcons = new IIcon[2];
        for (int i = 0; i < blockTopIcons.length; i++) {
            blockTopIcons[i] = iconRegister.registerIcon(Survivors.MODID + ":" + getTextureName() + "_" + (i + 1));
        }
    }

}

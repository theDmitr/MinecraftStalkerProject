package thedmitr.survivors.common.blocks.rail;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import thedmitr.survivors.Survivors;
import thedmitr.survivors.common.blocks.MetableBlock;

public abstract class RailBlock extends MetableBlock {

    @SideOnly(Side.CLIENT)
    protected IIcon[] blockTopIcons;

    protected final String masterTexture;

    public RailBlock(String name, String topTexture, String masterTexture) {
        super(name, topTexture, Material.rock);
        this.masterTexture = masterTexture;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public abstract IIcon getIcon(int side, int meta);

    @SideOnly(Side.CLIENT)
    @Override
    public abstract void registerBlockIcons(IIconRegister iconRegister);

}

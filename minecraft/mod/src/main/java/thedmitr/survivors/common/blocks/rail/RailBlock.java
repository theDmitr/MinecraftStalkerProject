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

public class RailBlock extends MetableBlock {

    public RailBlock(String name) {
        super(Material.rock);
        setBlockName(name);
    }

}

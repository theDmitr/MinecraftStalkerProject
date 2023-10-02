package thedmitr.survivors.common.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import org.lwjgl.Sys;

public class DrinkItem extends GeneralItem {

    public DrinkItem(String name, String texture) {
        super(name, texture);
        setMaxDamage(0);
    }

    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.drink;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return 16;
    }

    @Override
    public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) {
        if (!player.capabilities.isCreativeMode) {
            --stack.stackSize;
        }

        if (!world.isRemote) {
            /* Effects here! See original ItemPotion! */
        }

        if (!player.capabilities.isCreativeMode) {
            player.inventory.addItemStackToInventory(new ItemStack(SurvivorsItems.empty_can_2));
        }

        return stack;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
        return stack;
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world,
                             int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_,
                             float p_77648_8_, float p_77648_9_, float p_77648_10_) {
        return false;
    }

}

package thedmitr.survivors.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import org.lwjgl.Sys;
import thedmitr.survivors.Survivors;
import thedmitr.survivors.common.blocks.SurvivorsBlocks;
import thedmitr.survivors.common.item.SurvivorsItems;

public class ItemTabs extends CreativeTabs {

    public static final ItemTabs blocks_tab = new ItemTabs("blocks") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Item.getItemFromBlock(SurvivorsBlocks.brick_1_block);
        }
    };

    public static final ItemTabs items_tab = new ItemTabs("items") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return SurvivorsItems.ammo_9_mm;
        }
    };

    private ItemTabs(String name) {
        super(name);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return null;
    }

}

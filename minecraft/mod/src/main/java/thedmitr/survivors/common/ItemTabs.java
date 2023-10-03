package thedmitr.survivors.common;

import com.google.common.collect.Lists;
import cpw.mods.fml.common.registry.FMLControlledNamespacedRegistry;
import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.lwjgl.Sys;
import thedmitr.survivors.common.blocks.SurvivorsBlocks;
import thedmitr.survivors.common.item.SurvivorsItems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItemTabs extends CreativeTabs {

    public static final ItemTabs blocks_tab = new ItemTabs("blocks") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Item.getItemFromBlock(SurvivorsBlocks.get("wood_planks_block_1"));
        }
    };

    public static final ItemTabs items_tab = new ItemTabs("items") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return SurvivorsItems.get("ammo_7_62_mm");
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

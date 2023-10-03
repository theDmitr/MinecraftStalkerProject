package thedmitr.survivors.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import thedmitr.survivors.common.blocks.SurvivorsBlocks;
import thedmitr.survivors.common.item.SurvivorsItems;

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

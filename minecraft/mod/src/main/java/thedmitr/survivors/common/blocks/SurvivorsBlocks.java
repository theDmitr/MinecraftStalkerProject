package thedmitr.survivors.common.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import thedmitr.survivors.Survivors;
import thedmitr.survivors.common.ItemTabs;
import thedmitr.survivors.common.blocks.rail.RailLineBlock;

import java.util.HashMap;
import java.util.Map;

public class SurvivorsBlocks {

    private static final Map<String, Block> blocks_map = new HashMap<>();

    public static Block get(String name) {
        name = "tile." + name;
        if (!blocks_map.containsKey(name))
            return null;
        return blocks_map.get(name);
    }

    private static void register(Block block) {
        block.setCreativeTab(ItemTabs.blocks_tab);
        GameRegistry.registerBlock(block, block.getUnlocalizedName());
        blocks_map.put(block.getUnlocalizedName(), block);
    }

    public static void register() {
        register(new GeneralBlock("wood_planks_block_1", Survivors.MODID + ":planks/" + "wood_planks_1"));
        register(new GeneralBlock("wood_planks_block_2", Survivors.MODID + ":planks/" + "wood_planks_2"));
        register(new GeneralBlock("wood_planks_block_3", Survivors.MODID + ":planks/" + "wood_planks_3"));
        register(new GeneralBlock("wood_planks_block_4", Survivors.MODID + ":planks/" + "wood_planks_4"));
        register(new GeneralBlock("wood_planks_block_5", Survivors.MODID + ":planks/" + "wood_planks_5"));
        register(new GeneralBlock("wood_planks_block_6", Survivors.MODID + ":planks/" + "wood_planks_6"));
        register(new GeneralBlock("metal_block_1", Survivors.MODID + ":metal/" + "metal_1"));
        register(new GeneralBlock("metal_block_2", Survivors.MODID + ":metal/" + "metal_2"));
        register(new GeneralBlock("metal_block_3", Survivors.MODID + ":metal/" + "metal_3"));
        register(new GeneralBlock("metal_block_4", Survivors.MODID + ":metal/" + "metal_4"));
        register(new GeneralBlock("metal_block_5", Survivors.MODID + ":metal/" + "metal_5"));
        register(new GeneralBlock("metal_block_6", Survivors.MODID + ":metal/" + "metal_6"));
        register(new GeneralBlock("metal_block_7", Survivors.MODID + ":metal/" + "metal_7"));
        register(new GeneralBlock("metal_block_8", Survivors.MODID + ":metal/" + "metal_8"));
        register(new GeneralBlock("gravel_block", Survivors.MODID + ':' + "gravel"));
        register(new GeneralBlock("brick_block_1", Survivors.MODID + ':' + "brick_1"));
        register(new GeneralBlock("stone_brick_block_1", Survivors.MODID + ':' + "stone_brick_1"));
        register(new GeneralBlock("brown_wool_block", Survivors.MODID + ':' + "brown_wool"));
        register(new GeneralBlock("khaki_1_block", Survivors.MODID + ':' + "khaki_1"));
        register(new GeneralBlock("box_1_block", Survivors.MODID + ':' + "box_1"));
        register(new GeneralTransparentBlock("metal_block_9", Survivors.MODID + ":metal/" + "metal_9"));
        register(new TimberBlock("tire_1_block", Survivors.MODID + ':' + "tire_1"));
        register(new TimberBlock("barrel_1_block", Survivors.MODID + ':' + "barrel_1"));
        register(new GlassBlock("glass_block_2", Survivors.MODID + ':' + "glass_2"));
        register(new BushBlock("bush_1_block", Survivors.MODID + ":bush/" + "bush_1"));
        register(new BushBlock("bush_2_block", Survivors.MODID + ":bush/" + "bush_2"));
        register(new BushBlock("bush_3_block", Survivors.MODID + ":bush/" + "bush_3"));
        register(new BushBlock("bush_4_block", Survivors.MODID + ":bush/" + "bush_4"));
        register(new BushBlock("bush_5_block", Survivors.MODID + ":bush/" + "bush_5"));
        register(new BushBlock("bush_6_block", Survivors.MODID + ":bush/" + "bush_6"));
        register(new BushBlock("bush_7_block", Survivors.MODID + ":bush/" + "bush_7"));
        register(new BushBlock("bush_8_block", Survivors.MODID + ":bush/" + "bush_8"));
        register(new BushBlock("bush_9_block", Survivors.MODID + ":bush/" + "bush_9"));
        register(new BushBlock("bush_10_block", Survivors.MODID + ":bush/" + "bush_10"));
        register(new BushBlock("bush_11_block", Survivors.MODID + ":bush/" + "bush_11"));
        register(new BushBlock("bush_12_block", Survivors.MODID + ":bush/" + "bush_12"));
        register(new BushBlock("bush_13_block", Survivors.MODID + ":bush/" + "bush_13"));
        register(new BushBlock("bush_14_block", Survivors.MODID + ":bush/" + "bush_14"));
        register(new BushBlock("bush_15_block", Survivors.MODID + ":bush/" + "bush_15"));
        register(new BushBlock("bush_16_block", Survivors.MODID + ":bush/" + "bush_16"));
        register(new BushBlock("bush_17_block", Survivors.MODID + ":bush/" + "bush_17"));
        register(new GlassBlock("glass_block_1", Survivors.MODID + ':' + "glass_1"));
        register(new PaneBlock("glass_pane_1", Survivors.MODID + ':' + "glass_1", Survivors.MODID + ':' + "glass_pane_1_top"));
        register(new PaneBlock("glass_pane_2", Survivors.MODID + ':' + "glass_2", Survivors.MODID + ':' + "glass_pane_2_top"));
        register(new RailLineBlock("gravel_rail_line_block", Survivors.MODID + ':' + "rail/gravel_rail", Survivors.MODID + ':' + "gravel"));
        register(new RailLineBlock("gravel_rail_angle_block", Survivors.MODID + ':' + "rail/gravel_rail", Survivors.MODID + ':' + "gravel"));
        register(new TimberBlock("timber_1_block", Survivors.MODID + ':' + "timber_1"));
        register(new BarbedWireBlock("barbed_wire_1_block", Survivors.MODID + ':' + "barbed_wire_1"));
        register(new BarbedWireBlock("barbed_wire_2_block", Survivors.MODID + ':' + "barbed_wire_2"));
    }

}

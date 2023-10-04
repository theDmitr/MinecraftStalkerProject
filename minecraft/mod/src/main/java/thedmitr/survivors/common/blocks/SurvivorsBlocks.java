package thedmitr.survivors.common.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import thedmitr.survivors.Survivors;
import thedmitr.survivors.common.ItemTabs;
import thedmitr.survivors.common.blocks.rail.RailAngleBlock;
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

    private static void register(GeneralBlock block, boolean hasStairs, boolean hasSlab) {
        register(block);
        if (hasStairs)
            register(new StairsBlock(block.getUnlocalizedName() + "_stairs", block));
        if (hasSlab)
            register(new SlabBlock(block.getUnlocalizedName() + "_slab", block.getBlockTextureName()));
    }

    public static void register() {
        register(new GeneralBlock("survivors_metal_block_1", Survivors.MODID + ":metal/" + "metal_1"));
        register(new GeneralBlock("survivors_metal_block_2", Survivors.MODID + ":metal/" + "metal_2"));
        register(new GeneralBlock("survivors_metal_block_3", Survivors.MODID + ":metal/" + "metal_3"));
        register(new GeneralBlock("survivors_metal_block_4", Survivors.MODID + ":metal/" + "metal_4"));
        register(new GeneralBlock("survivors_metal_block_5", Survivors.MODID + ":metal/" + "metal_5"));
        register(new GeneralBlock("survivors_metal_block_6", Survivors.MODID + ":metal/" + "metal_6"));
        register(new GeneralBlock("survivors_metal_block_7", Survivors.MODID + ":metal/" + "metal_7"));
        register(new GeneralBlock("survivors_metal_block_8", Survivors.MODID + ":metal/" + "metal_8"));
        register(new GeneralTransparentBlock("survivors_metal_block_9", Survivors.MODID + ":metal/" + "metal_9"));
        register(new GeneralBlock("survivors_metal_block_10", Survivors.MODID + ":metal/" + "metal_10"));
        register(new GeneralBlock("survivors_metal_block_11", Survivors.MODID + ":metal/" + "metal_11"));
        register(new GeneralBlock("survivors_metal_block_12", Survivors.MODID + ":metal/" + "metal_12"));
        register(new GeneralBlock("survivors_metal_block_13", Survivors.MODID + ":metal/" + "metal_13"));
        register(new GeneralBlock("survivors_metal_block_14", Survivors.MODID + ":metal/" + "metal_14"));
        register(new GeneralBlock("survivors_metal_block_15", Survivors.MODID + ":metal/" + "metal_15"));
        register(new GeneralBlock("survivors_metal_block_16", Survivors.MODID + ":metal/" + "metal_16"));
        register(new GeneralBlock("survivors_metal_block_17", Survivors.MODID + ":metal/" + "metal_17"));
        register(new GeneralBlock("survivors_metal_block_18", Survivors.MODID + ":metal/" + "metal_18"));
        register(new GeneralBlock("survivors_metal_block_19", Survivors.MODID + ":metal/" + "metal_19"));
        register(new GeneralBlock("survivors_metal_block_20", Survivors.MODID + ":metal/" + "metal_20"));
        register(new GeneralBlock("survivors_metal_block_21", Survivors.MODID + ":metal/" + "metal_21"));
        register(new GeneralBlock("survivors_metal_block_22", Survivors.MODID + ":metal/" + "metal_22"));
        register(new GeneralBlock("survivors_metal_block_23", Survivors.MODID + ":metal/" + "metal_23"));
        register(new GeneralBlock("survivors_metal_block_24", Survivors.MODID + ":metal/" + "metal_24"));
        register(new GeneralBlock("survivors_metal_block_25", Survivors.MODID + ":metal/" + "metal_25"));
        register(new GeneralBlock("survivors_metal_block_26", Survivors.MODID + ":metal/" + "metal_26"));
        register(new GeneralBlock("survivors_metal_block_27", Survivors.MODID + ":metal/" + "metal_27"));
        register(new GeneralBlock("survivors_metal_block_28", Survivors.MODID + ":metal/" + "metal_28"));
        register(new GeneralBlock("survivors_metal_block_29", Survivors.MODID + ":metal/" + "metal_29"));
        register(new GeneralBlock("survivors_metal_block_30", Survivors.MODID + ":metal/" + "metal_30"));
        register(new GeneralBlock("survivors_metal_block_31", Survivors.MODID + ":metal/" + "metal_31"));
        register(new GeneralBlock("survivors_metal_block_32", Survivors.MODID + ":metal/" + "metal_32"));
        register(new GeneralBlock("survivors_metal_block_33", Survivors.MODID + ":metal/" + "metal_33"));
        register(new GeneralBlock("survivors_metal_block_34", Survivors.MODID + ":metal/" + "metal_34"));
        register(new GeneralBlock("survivors_metal_block_35", Survivors.MODID + ":metal/" + "metal_35"));
        register(new GeneralBlock("survivors_metal_block_36", Survivors.MODID + ":metal/" + "metal_36"));
        register(new GeneralBlock("survivors_metal_block_37", Survivors.MODID + ":metal/" + "metal_37"));
        register(new GeneralBlock("survivors_metal_block_38", Survivors.MODID + ":metal/" + "metal_38"));
        register(new GeneralBlock("survivors_metal_block_39", Survivors.MODID + ":metal/" + "metal_39"));
        register(new GeneralBlock("survivors_metal_block_40", Survivors.MODID + ":metal/" + "metal_40"));
        register(new GeneralBlock("survivors_metal_block_41", Survivors.MODID + ":metal/" + "metal_41"));
        register(new GeneralBlock("survivors_metal_block_42", Survivors.MODID + ":metal/" + "metal_42"));
        register(new GeneralBlock("survivors_metal_block_43", Survivors.MODID + ":metal/" + "metal_43"));
        register(new GeneralBlock("survivors_metal_block_44", Survivors.MODID + ":metal/" + "metal_44"));
        register(new GeneralBlock("survivors_metal_block_45", Survivors.MODID + ":metal/" + "metal_45"));
        register(new GeneralBlock("survivors_metal_block_46", Survivors.MODID + ":metal/" + "metal_46"));
        register(new GeneralBlock("survivors_metal_block_47", Survivors.MODID + ":metal/" + "metal_47"));
        register(new GeneralBlock("survivors_metal_block_48", Survivors.MODID + ":metal/" + "metal_48"));
        register(new GeneralBlock("survivors_metal_block_49", Survivors.MODID + ":metal/" + "metal_49"));
        register(new GeneralBlock("survivors_metal_block_50", Survivors.MODID + ":metal/" + "metal_50"));
        register(new GeneralBlock("survivors_metal_block_51", Survivors.MODID + ":metal/" + "metal_51"));
        register(new GeneralBlock("survivors_metal_block_52", Survivors.MODID + ":metal/" + "metal_52"));
        register(new GeneralBlock("survivors_metal_block_53", Survivors.MODID + ":metal/" + "metal_53"));
        register(new GeneralBlock("survivors_metal_block_54", Survivors.MODID + ":metal/" + "metal_54"));
        register(new GeneralBlock("survivors_metal_block_55", Survivors.MODID + ":metal/" + "metal_55"));
        register(new GeneralBlock("survivors_metal_block_56", Survivors.MODID + ":metal/" + "metal_56"));
        register(new GeneralBlock("survivors_metal_block_57", Survivors.MODID + ":metal/" + "metal_57"));
        register(new GeneralBlock("survivors_metal_block_58", Survivors.MODID + ":metal/" + "metal_58"));
        register(new GeneralBlock("survivors_metal_block_59", Survivors.MODID + ":metal/" + "metal_59"));
        register(new GeneralTransparentBlock("survivors_metal_block_60", Survivors.MODID + ":metal/" + "metal_60"));
        register(new GeneralBlock("survivors_metal_block_61", Survivors.MODID + ":metal/" + "metal_61"));
        register(new GeneralBlock("survivors_metal_block_62", Survivors.MODID + ":metal/" + "metal_62"));

        register(new GeneralBlock("survivors_bricks_block_1", Survivors.MODID + ':' + "bricks/bricks_1"), true, true);
        register(new GeneralBlock("survivors_bricks_block_2", Survivors.MODID + ':' + "bricks/bricks_2"), true, true);
        register(new GeneralBlock("survivors_bricks_block_3", Survivors.MODID + ':' + "bricks/bricks_3"), true, true);
        register(new GeneralBlock("survivors_bricks_block_4", Survivors.MODID + ':' + "bricks/bricks_4"), true, true);
        register(new GeneralBlock("survivors_bricks_block_5", Survivors.MODID + ':' + "bricks/bricks_5"), true, true);
        register(new GeneralBlock("survivors_bricks_block_6", Survivors.MODID + ':' + "bricks/bricks_6"), true, true);
        register(new GeneralBlock("survivors_bricks_block_7", Survivors.MODID + ':' + "bricks/bricks_7"), true, true);
        register(new GeneralBlock("survivors_bricks_block_8", Survivors.MODID + ':' + "bricks/bricks_8"), true, true);
        register(new GeneralBlock("survivors_bricks_block_9", Survivors.MODID + ':' + "bricks/bricks_9"), true, true);
        register(new GeneralBlock("survivors_bricks_block_10", Survivors.MODID + ':' + "bricks/bricks_10"), true, true);
        register(new GeneralBlock("survivors_bricks_block_11", Survivors.MODID + ':' + "bricks/bricks_11"), true, true);
        register(new GeneralBlock("survivors_bricks_block_12", Survivors.MODID + ':' + "bricks/bricks_12"), true, true);
        register(new GeneralBlock("survivors_bricks_block_13", Survivors.MODID + ':' + "bricks/bricks_13"), true, true);
        register(new GeneralBlock("survivors_bricks_block_14", Survivors.MODID + ':' + "bricks/bricks_14"), true, true);
        register(new GeneralBlock("survivors_bricks_block_15", Survivors.MODID + ':' + "bricks/bricks_15"), true, true);
        register(new GeneralBlock("survivors_bricks_block_16", Survivors.MODID + ':' + "bricks/bricks_16"), true, true);
        register(new GeneralBlock("survivors_bricks_block_17", Survivors.MODID + ':' + "bricks/bricks_17"), true, true);
        register(new GeneralBlock("survivors_bricks_block_18", Survivors.MODID + ':' + "bricks/bricks_18"));
        register(new GeneralBlock("survivors_bricks_block_19", Survivors.MODID + ':' + "bricks/bricks_19"));
        register(new GeneralBlock("survivors_bricks_block_20", Survivors.MODID + ':' + "bricks/bricks_20"));
        register(new GeneralBlock("survivors_bricks_block_21", Survivors.MODID + ':' + "bricks/bricks_21"));
        register(new GeneralBlock("survivors_bricks_block_22", Survivors.MODID + ':' + "bricks/bricks_22"));
        register(new GeneralBlock("survivors_bricks_block_23", Survivors.MODID + ':' + "bricks/bricks_23"));
        register(new GeneralBlock("survivors_bricks_block_24", Survivors.MODID + ':' + "bricks/bricks_24"));
        register(new GeneralBlock("survivors_bricks_block_25", Survivors.MODID + ':' + "bricks/bricks_25"));
        register(new GeneralBlock("survivors_bricks_block_26", Survivors.MODID + ':' + "bricks/bricks_26"));
        register(new GeneralBlock("survivors_bricks_block_27", Survivors.MODID + ':' + "bricks/bricks_27"));
        register(new GeneralBlock("survivors_bricks_block_28", Survivors.MODID + ':' + "bricks/bricks_28"));
        register(new GeneralBlock("survivors_bricks_block_29", Survivors.MODID + ':' + "bricks/bricks_29"));
        register(new GeneralBlock("survivors_bricks_block_30", Survivors.MODID + ':' + "bricks/bricks_30"));
        register(new GeneralBlock("survivors_bricks_block_31", Survivors.MODID + ':' + "bricks/bricks_31"));
        register(new GeneralBlock("survivors_bricks_block_32", Survivors.MODID + ':' + "bricks/bricks_32"));
        register(new GeneralBlock("survivors_bricks_block_33", Survivors.MODID + ':' + "bricks/bricks_33"));
        register(new GeneralBlock("survivors_bricks_block_34", Survivors.MODID + ':' + "bricks/bricks_34"));
        register(new GeneralBlock("survivors_bricks_block_35", Survivors.MODID + ':' + "bricks/bricks_35"));
        register(new GeneralBlock("survivors_bricks_block_36", Survivors.MODID + ':' + "bricks/bricks_36"));
        register(new GeneralBlock("survivors_bricks_block_37", Survivors.MODID + ':' + "bricks/bricks_37"));

        register(new BushBlock("survivors_bush_block_1", Survivors.MODID + ":bush/" + "bush_1"));
        register(new BushBlock("survivors_bush_block_2", Survivors.MODID + ":bush/" + "bush_2"));
        register(new BushBlock("survivors_bush_block_3", Survivors.MODID + ":bush/" + "bush_3"));
        register(new BushBlock("survivors_bush_block_4", Survivors.MODID + ":bush/" + "bush_4"));
        register(new BushBlock("survivors_bush_block_5", Survivors.MODID + ":bush/" + "bush_5"));
        register(new BushBlock("survivors_bush_block_6", Survivors.MODID + ":bush/" + "bush_6"));
        register(new BushBlock("survivors_bush_block_7", Survivors.MODID + ":bush/" + "bush_7"));
        register(new BushBlock("survivors_bush_block_8", Survivors.MODID + ":bush/" + "bush_8"));
        register(new BushBlock("survivors_bush_block_9", Survivors.MODID + ":bush/" + "bush_9"));
        register(new BushBlock("survivors_bush_block_10", Survivors.MODID + ":bush/" + "bush_10"));
        register(new BushBlock("survivors_bush_block_11", Survivors.MODID + ":bush/" + "bush_11"));
        register(new BushBlock("survivors_bush_block_12", Survivors.MODID + ":bush/" + "bush_12"));
        register(new BushBlock("survivors_bush_block_13", Survivors.MODID + ":bush/" + "bush_13"));
        register(new BushBlock("survivors_bush_block_14", Survivors.MODID + ":bush/" + "bush_14"));
        register(new BushBlock("survivors_bush_block_15", Survivors.MODID + ":bush/" + "bush_15"));
        register(new BushBlock("survivors_bush_block_16", Survivors.MODID + ":bush/" + "bush_16"));
        register(new BushBlock("survivors_bush_block_17", Survivors.MODID + ":bush/" + "bush_17"));

        register(new GeneralBlock("survivors_planks_block_1", Survivors.MODID + ':' + "planks/planks_1"));
        register(new GeneralBlock("survivors_planks_block_2", Survivors.MODID + ':' + "planks/planks_2"));
        register(new GeneralBlock("survivors_planks_block_3", Survivors.MODID + ':' + "planks/planks_3"));
        register(new GeneralBlock("survivors_planks_block_4", Survivors.MODID + ':' + "planks/planks_4"));
        register(new GeneralBlock("survivors_planks_block_5", Survivors.MODID + ':' + "planks/planks_5"));
        register(new GeneralBlock("survivors_planks_block_6", Survivors.MODID + ':' + "planks/planks_6"));
        register(new GeneralBlock("survivors_planks_block_7", Survivors.MODID + ':' + "planks/planks_7"), true, true);
        register(new GeneralBlock("survivors_planks_block_8", Survivors.MODID + ':' + "planks/planks_8"), true, true);
        register(new GeneralBlock("survivors_planks_block_9", Survivors.MODID + ':' + "planks/planks_9"), true, true);
        register(new GeneralBlock("survivors_planks_block_10", Survivors.MODID + ':' + "planks/planks_10"), true, true);
        register(new GeneralBlock("survivors_planks_block_11", Survivors.MODID + ':' + "planks/planks_11"), true, true);
        register(new GeneralBlock("survivors_planks_block_12", Survivors.MODID + ':' + "planks/planks_12"), true, true);
        register(new GeneralBlock("survivors_planks_block_13", Survivors.MODID + ':' + "planks/planks_13"), true, true);
        register(new GeneralBlock("survivors_planks_block_14", Survivors.MODID + ':' + "planks/planks_14"), true, true);
        register(new GeneralBlock("survivors_planks_block_15", Survivors.MODID + ':' + "planks/planks_15"), true, true);
        register(new GeneralBlock("survivors_planks_block_16", Survivors.MODID + ':' + "planks/planks_16"), true, true);
        register(new GeneralBlock("survivors_planks_block_17", Survivors.MODID + ':' + "planks/planks_17"), true, true);
        register(new GeneralBlock("survivors_planks_block_18", Survivors.MODID + ':' + "planks/planks_18"), true, true);
        register(new GeneralBlock("survivors_planks_block_19", Survivors.MODID + ':' + "planks/planks_19"), true, true);
        register(new GeneralBlock("survivors_planks_block_20", Survivors.MODID + ':' + "planks/planks_20"), true, true);
        register(new GeneralBlock("survivors_planks_block_21", Survivors.MODID + ':' + "planks/planks_21"), true, true);
        register(new GeneralBlock("survivors_planks_block_22", Survivors.MODID + ':' + "planks/planks_22"), true, true);
        register(new GeneralBlock("survivors_planks_block_23", Survivors.MODID + ':' + "planks/planks_23"), true, true);
        register(new GeneralBlock("survivors_planks_block_24", Survivors.MODID + ':' + "planks/planks_24"), true, true);
        register(new GeneralBlock("survivors_planks_block_25", Survivors.MODID + ':' + "planks/planks_25"), true, true);
        register(new GeneralBlock("survivors_planks_block_26", Survivors.MODID + ':' + "planks/planks_26"), true, true);
        register(new GeneralBlock("survivors_planks_block_27", Survivors.MODID + ':' + "planks/planks_27"), true, true);
        register(new GeneralBlock("survivors_planks_block_28", Survivors.MODID + ':' + "planks/planks_28"), true, true);
        register(new GeneralBlock("survivors_planks_block_29", Survivors.MODID + ':' + "planks/planks_29"), true, true);
        register(new GeneralBlock("survivors_planks_block_30", Survivors.MODID + ':' + "planks/planks_30"), true, true);
        register(new GeneralBlock("survivors_planks_block_31", Survivors.MODID + ':' + "planks/planks_31"), true, true);
        register(new GeneralBlock("survivors_planks_block_32", Survivors.MODID + ':' + "planks/planks_32"), true, true);
        register(new GeneralBlock("survivors_planks_block_33", Survivors.MODID + ':' + "planks/planks_33"), true, true);
        register(new GeneralBlock("survivors_planks_block_34", Survivors.MODID + ':' + "planks/planks_34"), true, true);
        register(new GeneralBlock("survivors_planks_block_35", Survivors.MODID + ':' + "planks/planks_35"), true, true);
        register(new GeneralBlock("survivors_planks_block_36", Survivors.MODID + ':' + "planks/planks_36"), true, true);
        register(new GeneralBlock("survivors_planks_block_37", Survivors.MODID + ':' + "planks/planks_37"), true, true);
        register(new GeneralBlock("survivors_planks_block_38", Survivors.MODID + ':' + "planks/planks_38"));
        register(new GeneralBlock("survivors_planks_block_39", Survivors.MODID + ':' + "planks/planks_39"));
        register(new GeneralBlock("survivors_planks_block_40", Survivors.MODID + ':' + "planks/planks_40"));
        register(new GeneralBlock("survivors_planks_block_41", Survivors.MODID + ':' + "planks/planks_41"));
        register(new GeneralBlock("survivors_planks_block_42", Survivors.MODID + ':' + "planks/planks_42"));
        register(new GeneralBlock("survivors_planks_block_43", Survivors.MODID + ':' + "planks/planks_43"));

        register(new GeneralBlock("survivors_parget_block_1", Survivors.MODID + ':' + "parget/parget_1"));
        register(new GeneralBlock("survivors_parget_block_2", Survivors.MODID + ':' + "parget/parget_2"));
        register(new GeneralBlock("survivors_parget_block_3", Survivors.MODID + ':' + "parget/parget_3"));
        register(new GeneralBlock("survivors_parget_block_4", Survivors.MODID + ':' + "parget/parget_4"));
        register(new GeneralBlock("survivors_parget_block_5", Survivors.MODID + ':' + "parget/parget_5"));
        register(new GeneralBlock("survivors_parget_block_6", Survivors.MODID + ':' + "parget/parget_6"));
        register(new GeneralBlock("survivors_parget_block_7", Survivors.MODID + ':' + "parget/parget_7"));
        register(new GeneralBlock("survivors_parget_block_8", Survivors.MODID + ':' + "parget/parget_8"));
        register(new GeneralBlock("survivors_parget_block_9", Survivors.MODID + ':' + "parget/parget_9"));
        register(new GeneralBlock("survivors_parget_block_10", Survivors.MODID + ':' + "parget/parget_10"));
        register(new GeneralBlock("survivors_parget_block_11", Survivors.MODID + ':' + "parget/parget_11"));
        register(new GeneralBlock("survivors_parget_block_12", Survivors.MODID + ':' + "parget/parget_12"));

        register(new GeneralTransparentBlock("survivors_glass_block_1", Survivors.MODID + ":khaki/" + "khaki_4"));
        register(new GeneralTransparentBlock("survivors_glass_block_2", Survivors.MODID + ":khaki/" + "khaki_5"));
        register(new GeneralTransparentBlock("survivors_glass_block_3", Survivors.MODID + ":khaki/" + "khaki_6"));
        register(new GeneralTransparentBlock("survivors_glass_block_4", Survivors.MODID + ":glass/" + "glass_1"));
        register(new GeneralTransparentBlock("survivors_glass_block_5", Survivors.MODID + ":glass/" + "glass_2"));
        register(new GeneralTransparentBlock("survivors_glass_block_6", Survivors.MODID + ":glass/" + "glass_3"));
        register(new GeneralTransparentBlock("survivors_glass_block_7", Survivors.MODID + ":glass/" + "glass_4"));
        register(new GeneralTransparentBlock("survivors_glass_block_8", Survivors.MODID + ":glass/" + "glass_5"));
        register(new GeneralTransparentBlock("survivors_glass_block_9", Survivors.MODID + ":glass/" + "glass_6"));
        register(new GeneralTransparentBlock("survivors_glass_block_10", Survivors.MODID + ":glass/" + "glass_7"));

        register(new GeneralBlock("survivors_khaki_block_1", Survivors.MODID + ":khaki/" + "khaki_1"));
        register(new GeneralBlock("survivors_khaki_block_2", Survivors.MODID + ":khaki/" + "khaki_2"));
        register(new GeneralBlock("survivors_khaki_block_3", Survivors.MODID + ":khaki/" + "khaki_3"));
        register(new GeneralBlock("survivors_khaki_block_4", Survivors.MODID + ":khaki/" + "khaki_7"));
        register(new GeneralTransparentBlock("survivors_khaki_block_5", Survivors.MODID + ":khaki/" + "khaki_4"));
        register(new GeneralTransparentBlock("survivors_khaki_block_6", Survivors.MODID + ":khaki/" + "khaki_5"));
        register(new GeneralTransparentBlock("survivors_khaki_block_7", Survivors.MODID + ":khaki/" + "khaki_6"));

        register(new PaneBlock("survivors_glass_pane_block_1", Survivors.MODID + ':' + "glass/glass_1", Survivors.MODID + ':' + "glass/glass_pane_1_top"));
        register(new PaneBlock("survivors_glass_pane_block_2", Survivors.MODID + ':' + "glass/glass_2", Survivors.MODID + ':' + "glass/glass_pane_2_top"));
        register(new PaneBlock("survivors_glass_pane_block_3", Survivors.MODID + ':' + "glass/glass_3", Survivors.MODID + ':' + "glass/glass_pane_1_top"));
        register(new PaneBlock("survivors_glass_pane_block_4", Survivors.MODID + ':' + "glass/glass_4", Survivors.MODID + ':' + "glass/glass_pane_2_top"));
        register(new PaneBlock("survivors_glass_pane_block_5", Survivors.MODID + ':' + "glass/glass_5", Survivors.MODID + ':' + "glass/glass_pane_2_top"));
        register(new PaneBlock("survivors_glass_pane_block_6", Survivors.MODID + ':' + "glass/glass_6", Survivors.MODID + ':' + "glass/glass_pane_2_top"));
        register(new PaneBlock("survivors_glass_pane_block_7", Survivors.MODID + ':' + "glass/glass_7", Survivors.MODID + ':' + "glass/glass_pane_2_top"));

        register(new BarbedWireBlock("survivors_barbed_wire_block_1", Survivors.MODID + ':' + "barbed_wire_1"));
        register(new BarbedWireBlock("survivors_barbed_wire_block_2", Survivors.MODID + ':' + "barbed_wire_2"));

        register(new RailLineBlock("survivors_line_gravel_rail_block", Survivors.MODID + ':' + "rail/gravel_rail", Survivors.MODID + ':' + "gravel"));
        register(new RailAngleBlock("survivors_angle_gravel_rail_block", Survivors.MODID + ':' + "rail/gravel_rail", Survivors.MODID + ':' + "gravel"));

        register(new TimberBlock("survivors_timber_block_1", Survivors.MODID + ':' + "timber_1"));

        register(new GeneralBlock("survivors_gravel_block", Survivors.MODID + ':' + "gravel"));
        register(new GeneralBlock("survivors_wool_block_1", Survivors.MODID + ':' + "brown_wool"));
        register(new TimberBlock("survivors_tire_block_1", Survivors.MODID + ':' + "tire_1"));
        register(new TimberBlock("survivors_barrel_block_1", Survivors.MODID + ':' + "barrel_1"));

        register(new LadderBlock("survivors_ladder_block_1", Survivors.MODID + ":ladder_1"));

        register(new GeneralBlock("survivors_dirt_block", Survivors.MODID + ":dirt"));

        register(new CustomTopIconBlock("survivors_podzol_block", Survivors.MODID + ":podzol_top", Survivors.MODID + ":podzol"));
        register(new CustomTopIconBlock("survivors_grass_block", Survivors.MODID + ":grass_top", Survivors.MODID + ":grass"));
    }

}

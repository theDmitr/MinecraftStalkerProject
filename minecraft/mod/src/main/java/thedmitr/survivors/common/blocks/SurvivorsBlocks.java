package thedmitr.survivors.common.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import thedmitr.survivors.Survivors;
import thedmitr.survivors.common.ItemTabs;
import thedmitr.survivors.common.blocks.rail.RailAngleBlock;
import thedmitr.survivors.common.blocks.rail.RailLineBlock;

import java.util.ArrayList;
import java.util.List;

public class SurvivorsBlocks {

    private static final List<Block> blocks = new ArrayList<>();


    public static final GlassBlock glass_block_1 = addBlock(
            new GlassBlock(
                    "glass_block_1",
                    Survivors.MODID + ':' + "glass_1"
            )
    );

    public static final GlassBlock glass_block_2 = addBlock(
            new GlassBlock(
                    "glass_block_2",
                    Survivors.MODID + ':' + "glass_2"
            )
    );

    public static final PaneBlock glass_pane_block_1 = addBlock(
            new PaneBlock(
                    "glass_pane_1",
                    Survivors.MODID + ':' + "glass_1",
                    Survivors.MODID + ':' + "glass_pane_1_top"
            )
    );

    public static final PaneBlock glass_pane_block_2 = addBlock(
            new PaneBlock(
                    "glass_pane_2",
                    Survivors.MODID + ':' + "glass_2",
                    Survivors.MODID + ':' + "glass_pane_2_top"
            )
    );

    public static final GeneralBlock gravel_block = addBlock(
            new GeneralBlock(
                    "gravel_block",
                    Survivors.MODID + ':' + "gravel"
            )
    );

    public static final RailLineBlock gravel_rail_block_1 = addBlock(
            new RailLineBlock(
                    "gravel_rail_line_block",
                    Survivors.MODID + ':' + "rail/gravel_rail",
                    Survivors.MODID + ':' + "gravel"
            )
    );

    public static final RailAngleBlock gravel_rail_block_2 = addBlock(
            new RailAngleBlock(
                    "gravel_rail_angle_block",
                    Survivors.MODID + ':' + "rail/gravel_rail",
                    Survivors.MODID + ':' + "gravel"
            )
    );

    public static final TimberBlock timber_1_block = addBlock(
            new TimberBlock(
                    "timber_1_block",
                    Survivors.MODID + ':' + "timber_1"
            )
    );

    public static final GeneralBlock brick_1_block = addBlock(
            new GeneralBlock(
                    "brick_block_1",
                    Survivors.MODID + ':' + "brick_1"
            )
    );

    public static final GeneralBlock stone_brick_1_block = addBlock(
            new GeneralBlock(
                    "stone_brick_block_1",
                    Survivors.MODID + ':' + "stone_brick_1"
            )
    );

    public static final GeneralBlock wood_planks_1_block = addBlock(
            new GeneralBlock(
                    "wood_planks_block_1",
                    Survivors.MODID + ':' + "wood_planks_1"
            )
    );

    public static final GeneralBlock brown_wool_block = addBlock(
            new GeneralBlock(
                    "brown_wool_block",
                    Survivors.MODID + ':' + "brown_wool"
            )
    );

    public static final BarbedWireBlock barbed_wire_block_1 = addBlock(
            new BarbedWireBlock(
                    "barbed_wire_1_block",
                    Survivors.MODID + ':' + "barbed_wire_1"
            )
    );

    public static final BarbedWireBlock barbed_wire_block_2 = addBlock(
            new BarbedWireBlock(
                    "barbed_wire_2_block",
                    Survivors.MODID + ':' + "barbed_wire_2"
            )
    );


    // <editor-fold desc="bush">
    public static final BushBlock bush_1_block = addBlock(
            new BushBlock(
                    "bush_1_block",
                    Survivors.MODID + ":bush/" + "bush_1"
            )
    );

    public static final BushBlock bush_2_block = addBlock(
            new BushBlock(
                    "bush_2_block",
                    Survivors.MODID + ":bush/" + "bush_2"
            )
    );

    public static final BushBlock bush_3_block = addBlock(
            new BushBlock(
                    "bush_3_block",
                    Survivors.MODID + ":bush/" + "bush_3"
            )
    );

    public static final BushBlock bush_4_block = addBlock(
            new BushBlock(
                    "bush_4_block",
                    Survivors.MODID + ":bush/" + "bush_4"
            )
    );

    public static final BushBlock bush_5_block = addBlock(
            new BushBlock(
                    "bush_5_block",
                    Survivors.MODID + ":bush/" + "bush_5"
            )
    );

    public static final BushBlock bush_6_block = addBlock(
            new BushBlock(
                    "bush_6_block",
                    Survivors.MODID + ":bush/" + "bush_6"
            )
    );

    public static final BushBlock bush_7_block = addBlock(
            new BushBlock(
                    "bush_7_block",
                    Survivors.MODID + ":bush/" + "bush_7"
            )
    );

    public static final BushBlock bush_8_block = addBlock(
            new BushBlock(
                    "bush_8_block",
                    Survivors.MODID + ":bush/" + "bush_8"
            )
    );

    public static final BushBlock bush_9_block = addBlock(
            new BushBlock(
                    "bush_9_block",
                    Survivors.MODID + ":bush/" + "bush_9"
            )
    );

    public static final BushBlock bush_10_block = addBlock(
            new BushBlock(
                    "bush_10_block",
                    Survivors.MODID + ":bush/" + "bush_10"
            )
    );

    public static final BushBlock bush_11_block = addBlock(
            new BushBlock(
                    "bush_11_block",
                    Survivors.MODID + ":bush/" + "bush_11"
            )
    );

    public static final BushBlock bush_12_block = addBlock(
            new BushBlock(
                    "bush_12_block",
                    Survivors.MODID + ":bush/" + "bush_12"
            )
    );

    public static final BushBlock bush_13_block = addBlock(
            new BushBlock(
                    "bush_13_block",
                    Survivors.MODID + ":bush/" + "bush_13"
            )
    );

    public static final BushBlock bush_14_block = addBlock(
            new BushBlock(
                    "bush_14_block",
                    Survivors.MODID + ":bush/" + "bush_14"
            )
    );

    public static final BushBlock bush_15_block = addBlock(
            new BushBlock(
                    "bush_15_block",
                    Survivors.MODID + ":bush/" + "bush_15"
            )
    );

    public static final BushBlock bush_16_block = addBlock(
            new BushBlock(
                    "bush_16_block",
                    Survivors.MODID + ":bush/" + "bush_16"
            )
    );

    public static final BushBlock bush_17_block = addBlock(
            new BushBlock(
                    "bush_17_block",
                    Survivors.MODID + ":bush/" + "bush_17"
            )
    );
    //</editor-fold>

    // <editor-fold desc="metal">
    public static final GeneralBlock metal_1_block = addBlock(
            new GeneralBlock(
                    "metal_1_block",
                    Survivors.MODID + ":metal/" + "metal_1"
            )
    );

    public static final GeneralBlock metal_2_block = addBlock(
            new GeneralBlock(
                    "metal_2_block",
                    Survivors.MODID + ":metal/" + "metal_2"
            )
    );

    public static final GeneralBlock metal_3_block = addBlock(
            new GeneralBlock(
                    "metal_3_block",
                    Survivors.MODID + ":metal/" + "metal_3"
            )
    );

    public static final GeneralBlock metal_4_block = addBlock(
            new GeneralBlock(
                    "metal_4_block",
                    Survivors.MODID + ":metal/" + "metal_4"
            )
    );

    public static final GeneralBlock metal_5_block = addBlock(
            new GeneralBlock(
                    "metal_5_block",
                    Survivors.MODID + ":metal/" + "metal_5"
            )
    );

    public static final GeneralBlock metal_6_block = addBlock(
            new GeneralBlock(
                    "metal_6_block",
                    Survivors.MODID + ":metal/" + "metal_6"
            )
    );

    public static final GeneralBlock metal_7_block = addBlock(
            new GeneralBlock(
                    "metal_7_block",
                    Survivors.MODID + ":metal/" + "metal_7"
            )
    );

    public static final GeneralBlock metal_8_block = addBlock(
            new GeneralBlock(
                    "metal_8_block",
                    Survivors.MODID + ":metal/" + "metal_8"
            )
    );
    // </editor-fold>


    private static <T extends Block> T addBlock(T block) {
        return addBlock(block, ItemTabs.blocks_tab);
    }

    private static <T extends Block> T addBlock(T block, ItemTabs tab) {
        block.setCreativeTab(tab);
        blocks.add(block);
        return block;
    }

    public static void register() {
        for (Block block : blocks) {
            GameRegistry.registerBlock(block, block.getUnlocalizedName());
        }
    }

}

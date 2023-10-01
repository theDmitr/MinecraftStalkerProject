package thedmitr.survivors.common.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import thedmitr.survivors.common.blocks.rail.RailAngleBlock;
import thedmitr.survivors.common.blocks.rail.RailLineBlock;

import java.util.ArrayList;
import java.util.List;

public class SurvivorsBlocks {

    private static final List<Block> blocks = new ArrayList<>();


    public static final GlassBlock glass_block_1 = addBlock(
            new GlassBlock("glass_block_1", "glass/glass_block_1"));

    public static final GlassBlock glass_block_2 = addBlock(
            new GlassBlock("glass_block_2", "glass/glass_block_2"));

    public static final PaneBlock glass_pane_block_1 = addBlock(
            new PaneBlock("glass_pane_1", "glass/glass_block_1", "glass/glass_pane_1_top",
                    Material.glass, false, 0.3f, Block.soundTypeGlass));

    public static final PaneBlock glass_pane_block_2 = addBlock(
            new PaneBlock("glass_pane_2", "glass/glass_block_2", "glass/glass_pane_2_top",
                    Material.glass, false, 0.3f, Block.soundTypeGlass));

    public static final GeneralBlock gravel_block = addBlock(
            new GeneralBlock("gravel_block", "gravel_block", Material.rock));

    public static final RailLineBlock gravel_rail_block_1 = addBlock(
            new RailLineBlock("gravel_rail_line_block", "rails/gravel_rail_block",
                    "gravel_block"));

    public static final RailAngleBlock gravel_rail_block_2 = addBlock(
            new RailAngleBlock("gravel_rail_angle_block", "rails/gravel_rail_block",
                    "gravel_block"));

    public static final TimberBlock timber_block_1 = addBlock(
            new TimberBlock("timber_block_1", "timber/timber_block_1"));

    public static final GeneralBlock brick_1_block = addBlock(
            new GeneralBlock("brick_1_block", "brick_1_block", Material.rock));

    public static final GeneralBlock stone_brick_1_block = addBlock(
            new GeneralBlock("stone_brick_1_block", "stone_brick_1_block", Material.rock));

    public static final GeneralBlock wood_planks_1_block = addBlock(
            new GeneralBlock("wood_planks_1_block", "wood_planks_1_block", Material.wood));

    public static final GeneralBlock brown_wool_block = addBlock(
            new GeneralBlock("brown_wool_block", "brown_wool_block", Material.cloth));

    public static final BarbedWireBlock barbed_wire_block = addBlock(
            new BarbedWireBlock("barbed_wire_block_1", "barbed_wires/barbed_wire_block_1",
                    Material.iron));


    private static <T extends Block> T addBlock(T block) {
        blocks.add(block);
        return block;
    }

    public static void register() {
        for (Block block : blocks) {
            GameRegistry.registerBlock(block, block.getUnlocalizedName());
        }
    }

}

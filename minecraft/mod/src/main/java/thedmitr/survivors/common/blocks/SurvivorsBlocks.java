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
            new RailLineBlock("gravel_rail_line_block"));

    public static final RailAngleBlock gravel_rail_block_2 = addBlock(
            new RailAngleBlock("gravel_rail_angle_block"));


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

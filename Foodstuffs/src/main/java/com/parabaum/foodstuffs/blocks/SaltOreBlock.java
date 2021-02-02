package com.parabaum.foodstuffs.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SaltOreBlock extends Block {

    public SaltOreBlock() {
        super(AbstractBlock.Properties.create(Material.ROCK)
                .hardnessAndResistance(3.0f, 3.0f)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .setRequiresTool()
        );
    }
}

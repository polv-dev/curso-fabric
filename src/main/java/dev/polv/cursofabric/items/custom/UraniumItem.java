package dev.polv.cursofabric.items.custom;

import net.minecraft.client.item.TooltipType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

import java.util.List;

public class UraniumItem extends Item {

    public UraniumItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.literal("Este item es RADIOACTIVO").withColor(0xff0000));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        context.getPlayer().sendMessage(Text.of("Has clicado un bloque"));
        return ActionResult.PASS;
    }
}

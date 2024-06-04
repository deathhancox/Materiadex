package net.deathhancox.materiadex.items.custom.descriptable;

import java.util.List;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class DescriptableItem extends Item {
	
	private final String SHIFT_TRANSLATION_KEY;
	private final boolean REQUIRES_SHIFT;
	
	/**
	 * Allows you to describe items
	 * @param properties Item properties
	 * @param textKey The translation key for when the user holds shift
	 * @param requiresShift Determines if we need shift to show the content
	 */
	public DescriptableItem(Properties  properties, String textKey, boolean requiresShift) {
		super(properties);
		SHIFT_TRANSLATION_KEY = textKey;
		REQUIRES_SHIFT = requiresShift;
	}

	/**
	 * Press shift for more details
	 * @param properties Item properties
	 * @param textKey The translation key for when the user holds shift
	 */
	public DescriptableItem(Properties properties, String textKey) {
		super(properties);
		SHIFT_TRANSLATION_KEY = textKey;
		REQUIRES_SHIFT = true;
	}
	
	@Override
	public void appendHoverText(ItemStack item_stack, Level level, List<Component> tooltip_component, TooltipFlag isAdvanced) {
		if (!REQUIRES_SHIFT) { tooltip_component.add(Component.translatable(SHIFT_TRANSLATION_KEY)); return; }
		
		tooltip_component.add(Component.translatable(
			Screen.hasShiftDown() ? SHIFT_TRANSLATION_KEY : "tooltip.materiadex.press_shift"
		));
	}
}

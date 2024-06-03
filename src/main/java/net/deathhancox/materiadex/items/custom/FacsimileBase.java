package net.deathhancox.materiadex.items.custom;

import net.deathhancox.materiadex.items.custom.descriptable.DescriptableItem;

public class FacsimileBase extends DescriptableItem {
    public FacsimileBase(Properties properties) {
        super(
            properties.fireResistant(), 
            "tooltip.materiadex.more.facsimile", 
            true
        );
    }

    public FacsimileBase(Properties properties, String shiftTextKey) {
        super(properties, shiftTextKey, true);
    }

    public FacsimileBase(Properties properties, String shiftTextKey, boolean requiresShift) {
        super(properties, shiftTextKey, requiresShift);
    }
}

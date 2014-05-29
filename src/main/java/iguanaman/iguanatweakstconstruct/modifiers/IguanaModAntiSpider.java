package iguanaman.iguanatweakstconstruct.modifiers;

import java.util.Arrays;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import tconstruct.library.tools.ToolCore;
import tconstruct.library.tools.ToolMod;
import tconstruct.modifiers.tools.ModPiston;

public class IguanaModAntiSpider extends ToolMod {

    String tooltipName;
	int increase;
    int max;

	public IguanaModAntiSpider(ItemStack[] items, int effect, int inc) {
		super(items, effect, "ModAntiSpider");
        tooltipName = "\u00a72Bane of Arthropods";
		increase = inc;
		max = 4;
	}

	public boolean canModify (ItemStack tool, ItemStack[] input, boolean auto)
    {
        ToolCore toolItem = (ToolCore) tool.getItem();
        if (!validType(toolItem))
            return false;

		if (auto) return true;

		NBTTagCompound tags = tool.getTagCompound().getCompoundTag("InfiTool");
        if (!tags.hasKey(key))
            return tags.getInteger("Modifiers") > 0 && increase <= max;

        int keyPair[] = tags.getIntArray(key);
        if (keyPair[0] + increase <= keyPair[1])
            return true;

        else if (keyPair[0] == keyPair[1])
            return tags.getInteger("Modifiers") > 0;

        else
            return false;
    }

	@Override
	public boolean canModify (ItemStack tool, ItemStack[] input)
	{
		return canModify(tool, input, false);
	}

    @Override
    public void modify (ItemStack[] input, ItemStack tool)
    {
        NBTTagCompound tags = tool.getTagCompound().getCompoundTag("InfiTool");
        if (tags.hasKey(key))
        {
            int[] keyPair = tags.getIntArray(key);

            if (keyPair[0] % max == 0)
            {
                keyPair[0] += increase;
                keyPair[1] += max;
                tags.setIntArray(key, keyPair);

                int modifiers = tags.getInteger("Modifiers");
                modifiers -= 1;
                tags.setInteger("Modifiers", modifiers);
            }
            else
            {
                keyPair[0] += increase;
                tags.setIntArray(key, keyPair);
            }
            updateModTag(tool, keyPair);

        }
        else
        {
            int modifiers = tags.getInteger("Modifiers");
            modifiers -= 1;
            tags.setInteger("Modifiers", modifiers);
            String modName = "\u00a72" + "Anti-Spider" + " (" + increase + "/" + max + ")";
            int tooltipIndex = addToolTip(tool, tooltipName, modName);
            int[] keyPair = new int[] { increase, max, tooltipIndex };
            tags.setIntArray(key, keyPair);
        }
    }

    void updateModTag (ItemStack tool, int[] keys)
    {
    	NBTTagCompound tags = tool.getTagCompound().getCompoundTag("InfiTool");
    	String tip = "ModifierTip" + keys[2];
    	String modName = "\u00a72" + "Anti-Spider" + " (" + keys[0] + "/" + keys[1] + ")";
    	tags.setString(tip, modName);
    }
}

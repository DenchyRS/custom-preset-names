package com.ToACustomPresets;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("ToACustomPresets")
public interface ToACustomPresetsConfig extends Config
{
	@ConfigItem(
		position = 1,
		keyName = "preset1",
		name = "Preset 1",
		description = "Text that should be displayed in the preset slot"
	)
	default String preset1()
	{
		return "Preset 1";
	}

	@ConfigItem(
		position = 2,
		keyName = "preset2",
		name = "Preset 2",
		description = "Text that should be displayed in the preset slot"
	)
	default String preset2()
	{
		return "Preset 2";
	}

	@ConfigItem(
		position = 3,
		keyName = "preset3",
		name = "Preset 3",
		description = "Text that should be displayed in the preset slot"
	)
	default String preset3()
	{
		return "Preset 3";
	}

	@ConfigItem(
		position = 4,
		keyName = "preset4",
		name = "Preset 4",
		description = "Text that should be displayed in the preset slot"
	)
	default String preset4()
	{
		return "Preset 4";
	}

	@ConfigItem(
		position = 5,
		keyName = "preset5",
		name = "Preset 5",
		description = "Text that should be displayed in the preset slot"
	)
	default String preset5()
	{
		return "Preset 5";
	}
}

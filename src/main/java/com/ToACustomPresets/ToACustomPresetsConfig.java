package com.ToACustomPresets;

import java.awt.Color;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("ToACustomPresets")
public interface ToACustomPresetsConfig extends Config
{

	@ConfigSection(
		name = "Preset 1",
		description = "Settings for preset slot 1",
		position = 1
	)
	String PRESET_1 = "preset1";
	@ConfigSection(
		name = "Preset 2",
		description = "Settings for preset slot 1",
		position = 1
	)
	String PRESET_2 = "preset2";
	@ConfigSection(
		name = "Preset 3",
		description = "Settings for preset slot 1",
		position = 1
	)
	String PRESET_3 = "preset3";
	@ConfigSection(
		name = "Preset 4",
		description = "Settings for preset slot 1",
		position = 1
	)
	String PRESET_4 = "preset4";
	@ConfigSection(
		name = "Preset 5",
		description = "Settings for preset slot 1",
		position = 1
	)
	String PRESET_5 = "preset5";

	@ConfigItem(
		position = 1,
		keyName = "preset1",
		name = "Name",
		description = "Text that should be displayed in the preset slot",
		section = PRESET_1
	)
	default String preset1()
	{
		return "Preset 1";
	}

	@ConfigItem(
		position = 2,
		keyName = "preset2",
		name = "Name",
		description = "Text that should be displayed in the preset slot",
		section = PRESET_2
	)
	default String preset2()
	{
		return "Preset 2";
	}

	@ConfigItem(
		position = 3,
		keyName = "preset3",
		name = "Name",
		description = "Text that should be displayed in the preset slot",
		section = PRESET_3
	)
	default String preset3()
	{
		return "Preset 3";
	}

	@ConfigItem(
		position = 4,
		keyName = "preset4",
		name = "Name",
		description = "Text that should be displayed in the preset slot",
		section = PRESET_4
	)
	default String preset4()
	{
		return "Preset 4";
	}

	@ConfigItem(
		position = 5,
		keyName = "preset5",
		name = "Name",
		description = "Text that should be displayed in the preset slot",
		section = PRESET_5
	)
	default String preset5()
	{
		return "Preset 5";
	}

	@ConfigItem(
		position = 6,
		keyName = "color1",
		name = "Name Colour",
		description = "The text colour of the preset name",
		section = PRESET_1
	)
	default Color color1()
	{
		return Color.orange;
	}

	@ConfigItem(
		position = 7,
		keyName = "color2",
		name = "Name Colour",
		description = "The text colour of the preset name",
		section = PRESET_2
	)
	default Color color2()
	{
		return Color.orange;
	}

	@ConfigItem(
		position = 8,
		keyName = "color3",
		name = "Name Colour",
		description = "The text colour of the preset name",
		section = PRESET_3
	)
	default Color color3()
	{
		return Color.orange;
	}

	@ConfigItem(
		position = 9,
		keyName = "color4",
		name = "Name Colour",
		description = "The text colour of the preset name",
		section = PRESET_4
	)
	default Color color4()
	{
		return Color.orange;
	}

	@ConfigItem(
		position = 10,
		keyName = "color5",
		name = "Name Colour",
		description = "The text colour of the preset name",
		section = PRESET_5
	)
	default Color color5()
	{
		return Color.orange;
	}
}

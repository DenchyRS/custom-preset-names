package com.ToACustomPresets;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.events.*;
import net.runelite.api.widgets.*;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "ToA Custom Presets",
	description = "Allows you to customise the preset names in the ToA preset interface",
	tags = {"toa", "preset", "raids3", "pvm", "custom"}
)
public class ToACustomPresetsPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private ToACustomPresetsConfig config;

	@Provides
	ToACustomPresetsConfig provideConfig(ConfigManager configmanager)
	{
		return configmanager.getConfig(ToACustomPresetsConfig.class);
	}


	@Override
	public void startUp()
	{


	}

	@Subscribe
	public void onClientTick(ClientTick e) throws Exception
	{


		try
		{
			final Widget toaover = client.getWidget(774, 99);
			final Widget[] toapresets = toaover.getChildren();
			toapresets[0].setText(config.preset1());
			toapresets[1].setText(config.preset2());
			toapresets[2].setText(config.preset3());
			toapresets[3].setText(config.preset4());
			toapresets[4].setText(config.preset5());
		}
		catch (NullPointerException npe)
		{

		}


	}
}



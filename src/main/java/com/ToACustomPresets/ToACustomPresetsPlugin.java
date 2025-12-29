package com.ToACustomPresets;

import com.google.inject.Provides;
import java.awt.Color;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.events.*;
import net.runelite.api.gameval.InterfaceID;
import net.runelite.api.widgets.*;
import net.runelite.client.callback.ClientThread;
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
	private ClientThread clientThread;

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
	public void onGameTick(GameTick e)
	{
		Widget widget = client.getWidget(InterfaceID.ToaPartydetails.INVOCATIONS_TAB);
		if (widget != null)
		{
			clientThread.invokeLater(this::updateTOAPresets);
		}
	}

	private void updateTOAPresets()
	{
		final Widget toaover = client.getWidget(774, 99);
		final Widget toalistener = client.getWidget(774, 98);
		final Widget[] toapresets = toaover.getChildren();
		final Widget[] toalistenerAll = toalistener.getChildren();
		if (toapresets == null || toalistenerAll == null)
		{
			return;
		}

		String[] presetText = {
			config.preset1(),
			config.preset2(),
			config.preset3(),
			config.preset4(),
			config.preset5()
		};

		Color[] presetColor = {
			config.color1(),
			config.color2(),
			config.color3(),
			config.color4(),
			config.color5()
		};

		for (int i = 0; i < presetText.length; i++)
		{
			if (toapresets[i] != null && !presetText[i].isEmpty())
			{
				toapresets[i].setText(presetText[i]);
				toapresets[i].setTextColor(presetColor[i].getRGB());
			}
		}

		Object result = toalistenerAll[0].getOnOpListener();

	}

}


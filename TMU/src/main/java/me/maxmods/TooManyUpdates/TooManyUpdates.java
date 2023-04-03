package me.maxmods.TooManyUpdates;

import me.maxmods.TooManyUpdates.client.events.EventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = TooManyUpdates.MODID, version = TooManyUpdates.VERSION)
public class TooManyUpdates
{
    public static final String MODID = "toomanyupdates";
    public static final String VERSION = "0.1";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new EventHandler());

    }
}

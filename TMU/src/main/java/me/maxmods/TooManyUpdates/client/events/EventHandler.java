package me.maxmods.TooManyUpdates.client.events;

import me.maxmods.TooManyUpdates.client.module.ModuleManager;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {

    @SubscribeEvent
    public void rightClick(net.minecraftforge.event.entity.player.PlayerInteractEvent e){

    }

    @SubscribeEvent
    public void onTick(net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent e){
        ModuleManager.getInstance().getModules().forEach(module -> {
            if(module.isEnabled()){
                module.onTick();
            }
        });
    }

    @SubscribeEvent
    public void onRenderWorld(net.minecraftforge.client.event.RenderWorldLastEvent e){
        ModuleManager.getInstance().getModules().forEach(module -> {
            if(module.isEnabled()){
                module.onRenderWorld();
            }
        });
    }

    @SubscribeEvent
    public void onRenderGui(net.minecraftforge.client.event.RenderGameOverlayEvent e){
        ModuleManager.getInstance().getModules().forEach(module -> {
            if(module.isEnabled()){
                module.onRenderGui();
            }
        });
    }
}

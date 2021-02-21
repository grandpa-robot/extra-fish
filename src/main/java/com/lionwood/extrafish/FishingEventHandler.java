package com.lionwood.extrafish;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemFishedEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = ExtraFish.MODID, bus = Bus.FORGE, value = Dist.CLIENT)
public class FishingEventHandler {
    @SubscribeEvent
    public static void rodCast(final PlayerInteractEvent.RightClickItem event){
        System.out.println("Fishing Rod Cast");  
    }
    @SubscribeEvent
    public static void rodHooked(final ItemFishedEvent event){
        System.out.println("Fishing Rod Hooked");
        System.out.println(event.getDrops());
    }
}

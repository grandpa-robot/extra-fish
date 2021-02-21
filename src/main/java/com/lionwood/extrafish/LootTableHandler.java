package com.lionwood.extrafish;

import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class LootTableHandler {
    private static final DeferredRegister<GlobalLootModifierSerializer<?>> GLM = DeferredRegister.create(ForgeRegistries.LOOT_MODIFIER_SERIALIZERS, ExtraFish.MODID);
    // private static final RegistryObject<FishingLootModifier.Serializer> FISH = GLM.register("fish", FishingLootModifier.Serializer::new);
}


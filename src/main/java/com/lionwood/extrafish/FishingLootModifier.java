package com.lionwood.extrafish;

import java.util.List;

import javax.annotation.Nonnull;

import com.google.gson.JsonObject;

import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
// import net.minecraftforge.common.loot.LootModifier;

public class FishingLootModifier extends LootModifier {

    public FishingLootModifier(ILootCondition[] conditions) {
        super(conditions);
    }

    @Nonnull
    @Override
    public List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context){
        return generatedLoot;
    }

	public class Serializer extends GlobalLootModifierSerializer<FishingLootModifier> {
        @Override
        public FishingLootModifier read(ResourceLocation name, JsonObject object, ILootCondition[] lootConditions){
            return new FishingLootModifier(lootConditions);
        }
        @Override
        public JsonObject write(FishingLootModifier instance){
            JsonObject json = makeConditions(instance.conditions);
            return json;
        }
	}


}

package de.guntram.mcmod.randomblockplacement.mixins;


import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.entity.player.PlayerInventory;

@Mixin(PlayerInventory.class)
public interface PlayerInventoryAccessor {
    @Accessor("selectedSlot")
    int getSelectedSlot();

    @Accessor("selectedSlot")
    void setSelectedSlot(int slot);
}
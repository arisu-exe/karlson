package io.github.fallOut015.karlson.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class ShotgunItem extends Item {
    public ShotgunItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> use(World level, PlayerEntity player, Hand hand) {
        if(true) {
            if(level.isClientSide) {
                for(int i = 0; i < 8; ++ i) {
                    level.addParticle(ParticleTypes.CRIT, player.getX(), player.getY(), player.getZ(), player.getLookAngle().x(), player.getLookAngle().y(), player.getLookAngle().z());
                }
            } else {
                player.setDeltaMovement(player.getLookAngle().scale(-2d));
                player.hurtMarked = true;
            }
            return ActionResult.success(player.getItemInHand(hand));
        }
        return ActionResult.fail(player.getItemInHand(hand));
    }
}
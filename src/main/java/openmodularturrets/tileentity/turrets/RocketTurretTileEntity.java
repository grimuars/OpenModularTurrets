package openmodularturrets.tileentity.turrets;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import openmodularturrets.items.Items;
import openmodularturrets.handler.ConfigHandler;
import openmodularturrets.entity.projectiles.RocketProjectile;
import openmodularturrets.entity.projectiles.TurretProjectile;

public class RocketTurretTileEntity extends TurretHead {

    public RocketTurretTileEntity() {
        super();
        this.turretTier = 3;
    }

    @Override
    public int getTurretRange() {
        return ConfigHandler.getRocketTurretSettings().getRange();
    }

    @Override
    public int getTurretPowerUsage() {
        return ConfigHandler.getRocketTurretSettings().getPowerUsage();
    }

    @Override
    public int getTurretFireRate() {
        return ConfigHandler.getRocketTurretSettings().getFireRate();
    }

    @Override
    public double getTurretAccuracy() {
        return ConfigHandler.getRocketTurretSettings().getAccuracy();
    }

    @Override
    public boolean requiresAmmo() {
        return true;
    }

    @Override
    public boolean requiresSpecificAmmo() {
        return true;
    }

    @Override
    public Item getAmmo() {
        return Items.rocketCraftable;
    }

    @Override
    public TurretProjectile createProjectile(World world, Entity target, ItemStack ammo) {
        return new RocketProjectile(world, target, ammo);
    }

    @Override
    public String getLaunchSoundEffect() {
        return "rocket";
    }
}

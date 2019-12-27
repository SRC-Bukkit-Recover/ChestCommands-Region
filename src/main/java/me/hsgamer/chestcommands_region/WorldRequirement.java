package me.hsgamer.chestcommands_region;

import com.gmail.filoghost.chestcommands.api.IconRequirement;
import org.bukkit.entity.Player;

public class WorldRequirement extends IconRequirement {

  public WorldRequirement() {
    super(false, ValueType.STRING);
  }

  @Override
  public boolean check(Player player) {
    return getParsedValue(player).contains(player.getWorld().getName());
  }

  @Override
  public void take(Player player) {
    // IGNORED
  }
}

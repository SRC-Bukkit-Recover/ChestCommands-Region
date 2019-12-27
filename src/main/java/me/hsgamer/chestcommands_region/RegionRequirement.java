package me.hsgamer.chestcommands_region;

import com.gmail.filoghost.chestcommands.api.IconRequirement;
import java.util.List;
import java.util.Set;
import org.bukkit.entity.Player;
import org.codemc.worldguardwrapper.WorldGuardWrapper;
import org.codemc.worldguardwrapper.region.IWrappedRegion;

public class RegionRequirement extends IconRequirement {

  public RegionRequirement() {
    super(false, ValueType.STRING);
  }

  @Override
  public boolean check(Player player) {
    List<Object> values = getParsedValue(player);
    Set<IWrappedRegion> regions = WorldGuardWrapper.getInstance().getRegions(player.getLocation());
    for (IWrappedRegion region : regions) {
      if (values.contains(region.getId())) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void take(Player player) {
    // IGNORED
  }
}

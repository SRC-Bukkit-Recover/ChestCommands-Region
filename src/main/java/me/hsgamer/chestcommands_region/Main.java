package me.hsgamer.chestcommands_region;

import com.gmail.filoghost.chestcommands.api.Addon;
import com.gmail.filoghost.chestcommands.serializer.RequirementSerializer;

public class Main extends Addon {

  public Main() {
    super("ChestCommands-Region");
  }

  @Override
  public void onEnable() {
    RequirementSerializer.register("WORLD", WorldRequirement.class);
    if (getPlugin().getServer().getPluginManager().isPluginEnabled("WorldGuard")) {
      RequirementSerializer.register("REGION", RegionRequirement.class);
    }
  }

  @Override
  public void onDisable() {
    // Things when disabling addon
  }
}

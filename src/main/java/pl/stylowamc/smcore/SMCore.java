package pl.stylowamc.smcore;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import pl.stylowamc.smcore.gameplay.pickaxes.CraftingBlock;

public final class SMCore extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new CraftingBlock(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

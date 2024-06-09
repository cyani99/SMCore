package pl.stylowamc.smcore;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import pl.stylowamc.smcore.gameplay.tools.ToolsCraftingBlock;
import pl.stylowamc.smcore.gameplay.tools.commands.GetTools;

public final class SMCore extends JavaPlugin {
    private static SMCore plugin;

    @Override
    public void onEnable() {
        plugin = this;

        //EVENTS
        Bukkit.getPluginManager().registerEvents(new ToolsCraftingBlock(), this);


        //COMMANDS
        this.getCommand("gettools").setExecutor(new GetTools());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static SMCore getInstance() {
        return plugin;
    }
}

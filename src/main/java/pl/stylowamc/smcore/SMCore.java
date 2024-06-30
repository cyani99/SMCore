package pl.stylowamc.smcore;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import pl.stylowamc.smcore.listeners.DefaultToolsBlockListeners;
import pl.stylowamc.smcore.gameplay.tools.commands.GetToolsCommand;
import pl.stylowamc.smcore.gameplay.tools.commands.SmithItemCommand;
import pl.stylowamc.smcore.gameplay.tools.gui.SmithGUI;

public final class SMCore extends JavaPlugin {
    private static SMCore plugin;

    @Override
    public void onEnable() {
        plugin = this;
        saveDefaultConfig();
        //EVENTS
        Bukkit.getPluginManager().registerEvents(new DefaultToolsBlockListeners(), this);
        Bukkit.getPluginManager().registerEvents(new SmithGUI(), this);


        //COMMANDS
        this.getCommand("gettools").setExecutor(new GetToolsCommand());
        this.getCommand("ulepsz").setExecutor(new SmithItemCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static SMCore getInstance() {
        return plugin;
    }
}

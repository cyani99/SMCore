package pl.stylowamc.smcore;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import pl.stylowamc.smcore.gameplay.tools.ToolsCraftingBlock;
import pl.stylowamc.smcore.gameplay.tools.commands.GetTools;
import pl.stylowamc.smcore.gameplay.tools.commands.SmithItem;
import pl.stylowamc.smcore.gameplay.tools.gui.SmithGUI;

//https://www.youtube.com/watch?v=D67hjtrxI4E&t=135s to check

public final class SMCore extends JavaPlugin {
    private static SMCore plugin;

    @Override
    public void onEnable() {
        plugin = this;

        //EVENTS
        Bukkit.getPluginManager().registerEvents(new ToolsCraftingBlock(), this);
        Bukkit.getPluginManager().registerEvents(new SmithGUI(), this);


        //COMMANDS
        this.getCommand("gettools").setExecutor(new GetTools());
        this.getCommand("ulepsz").setExecutor(new SmithItem());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static SMCore getInstance() {
        return plugin;
    }
}

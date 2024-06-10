package pl.stylowamc.smcore.gameplay.tools.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.stylowamc.smcore.gameplay.tools.gui.SmithGUI;
import pl.stylowamc.smcore.gameplay.tools.utils.WoodenPickaxe;

public class SmithItem implements CommandExecutor {

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            SmithGUI gui = new SmithGUI();
            if (p.hasPermission("smcore.admin.smithitem")) {
                if (args.length == 0) {
                    gui.openInventory(p);
                } else{
                    p.sendMessage("Błąd");
                    return false;
                }
            }
        }
        return false;
    }
}

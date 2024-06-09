package pl.stylowamc.smcore.gameplay.tools.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.stylowamc.smcore.gameplay.tools.utils.WoodenPickaxe;

public class GetTools implements CommandExecutor {

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;

            if (p.hasPermission("smcore.admin.tools")) {
                if (args.length == 0) {
                    p.sendMessage("Dopisz przedmiot (MATERIAL_[ULEPSZENIE] np. wooden_pickaxe_3");
                    return false;
                } else if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("wooden_pickaxe_0")) {
                        p.getInventory().addItem(WoodenPickaxe.createWoodenPickaxe_0());
                        return true;
                    }
                }
            }
        }
        return false;
    }
}



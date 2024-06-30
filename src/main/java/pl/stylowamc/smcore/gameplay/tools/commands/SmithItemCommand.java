package pl.stylowamc.smcore.gameplay.tools.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import pl.stylowamc.smcore.SMCore;
import pl.stylowamc.smcore.gameplay.tools.gui.SmithGUI;

public class SmithItemCommand implements CommandExecutor {

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String itemName = SMCore.getInstance().getConfig().getString("items.woodenpickaxe_0.name");

        if (sender instanceof Player) {
            Player p = (Player) sender;
            SmithGUI gui = new SmithGUI();
            if (p.hasPermission("smcore.admin.smithitem")) {
                if (args.length == 0) {
                    ItemStack item = p.getItemInHand();
                    if (item.getItemMeta().getLore().isEmpty()) return false;
                    if (item.getItemMeta().getDisplayName().equals(itemName)){
                        //Ulepsz
                    }


                } else{
                    p.sendMessage("Błąd");
                    return false;
                }
            }
        }
        return false;
    }
}

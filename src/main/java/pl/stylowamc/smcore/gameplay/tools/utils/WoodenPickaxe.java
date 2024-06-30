package pl.stylowamc.smcore.gameplay.tools.utils;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import pl.stylowamc.smcore.SMCore;

import java.util.ArrayList;

//WOODEN_PICKAXE+0  - 40 Blocks/minute
//STONE_PICKAXE+0   - 70 Blocks/minute
//IRON_PICKAXE+0    - 90 Blocks/minute
//DIAMOND_PICKAXE+0 - 105 Blocks/minute
//GOLDEN_PICKAXE+0  - 120 Blocks/minute


public class WoodenPickaxe {

    static ArrayList<String> lore = new ArrayList<>();

    public static ItemStack createTool(String itemID) {

        String itemName = SMCore.getInstance().getConfig().getString("items."+itemID+".name");
        if (itemName!=null){
            int upgradeLevel = SMCore.getInstance().getConfig().getInt("items."+itemID+".upgradeLevel");
            String res1 = SMCore.getInstance().getConfig().getString("items."+itemID+".res1");
            int amount1 = SMCore.getInstance().getConfig().getInt("items."+itemID+".amount1");
            String res2 = SMCore.getInstance().getConfig().getString("items."+itemID+".res2");
            int amount2 = SMCore.getInstance().getConfig().getInt("items."+itemID+".amount2");
            String res3 = SMCore.getInstance().getConfig().getString("items."+itemID+".res3");
            int amount3 = SMCore.getInstance().getConfig().getInt("items."+itemID+".amount3");

            int chance = SMCore.getInstance().getConfig().getInt("items."+itemID+".chance");
            ItemStack tool = new ItemStack(Material.WOODEN_PICKAXE);

            ItemMeta meta = tool.getItemMeta();
            meta.setDisplayName(itemName);
            lore.add("Zasoby potrzebne do ulepszenia na +"+(upgradeLevel+1)+":");
            lore.add("- "+res1+" x "+amount1);
            lore.add("- "+res2+" x "+amount2);
            lore.add("- "+res3+" x "+amount3);
            lore.add("Szansa na ulepszenie: "+chance+"%");
            meta.setLore(lore);
            tool.setItemMeta(meta);
            lore.clear();
            return tool;
        }
        else{
            SMCore.getInstance().getServer().broadcastMessage("Taki przedmiot nie istnieje!");
            return null;
        }

    }


}

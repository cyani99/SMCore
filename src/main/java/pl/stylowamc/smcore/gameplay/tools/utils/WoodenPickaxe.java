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
    static String itemName = SMCore.getInstance().getConfig().getString("items.woodenpickaxe_0.name");
    static String res1 = SMCore.getInstance().getConfig().getString("items.woodenpickaxe_0.res1");
    static Integer amount1 = SMCore.getInstance().getConfig().getInt("items.woodenpickaxe_0.amount1");
    static String res2 = SMCore.getInstance().getConfig().getString("items.woodenpickaxe_0.res2");
    static Integer amount2 = SMCore.getInstance().getConfig().getInt("items.woodenpickaxe_0.amount2");

    static Integer chance = SMCore.getInstance().getConfig().getInt("items.woodenpickaxe_0.chance");

    public static final NamespacedKey WOODEN_PICKAXE_0 = new NamespacedKey(SMCore.getInstance(), "woodenpickaxe_0");
    static ArrayList<String> lore = new ArrayList<>();

    public static ItemStack createWoodenPickaxe_0() {
        ItemStack woodenPickaxe_0 = new ItemStack(Material.WOODEN_PICKAXE);

        ItemMeta meta = woodenPickaxe_0.getItemMeta();
        meta.setDisplayName(itemName);
        lore.add("Zasoby potrzebne do ulepszenia na +1:");
        lore.add("- "+res1+" x "+amount1);
        lore.add("- "+res2+" x "+amount2);
        lore.add("Szansa na ulepszenie: "+chance+"%");
        meta.setLore(lore);
        woodenPickaxe_0.setItemMeta(meta);

        return woodenPickaxe_0;
    }


}

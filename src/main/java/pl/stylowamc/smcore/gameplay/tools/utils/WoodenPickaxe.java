package pl.stylowamc.smcore.gameplay.tools.utils;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import pl.stylowamc.smcore.SMCore;

import java.util.ArrayList;

public class WoodenPickaxe {
    public static final NamespacedKey WOODEN_PICKAXE_0 = new NamespacedKey(SMCore.getInstance(), "woodenpickaxe_0");
    static ArrayList<String> lore = new ArrayList<>();

    public static ItemStack createWoodenPickaxe_0() {
        ItemStack woodenPickaxe_0 = new ItemStack(Material.WOODEN_PICKAXE);

        ItemMeta meta = woodenPickaxe_0.getItemMeta();
        meta.setDisplayName("Drewniany Kilof +0");
        lore.add("Zasoby potrzebne do ulepszenia na +1:");
        lore.add("- DESKI_BRZOZY x 16");
        lore.add("- DĘBOWY_PIEŃ x 64");
        lore.add("Szansa na ulepszenie: 95%");
        meta.setLore(lore);
        woodenPickaxe_0.setItemMeta(meta);

        return woodenPickaxe_0;
    }


}

package pl.stylowamc.smcore.gameplay.tools.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class SmithGUI implements Listener {
    private final Inventory inv;

    public SmithGUI() {
        // Create a new inventory, with no owner (as this isn't a real inventory), a size of nine, called example
        inv = Bukkit.createInventory(null, 9, "Example");

        // Put the items into the inventory
        initializeItems();
    }

    public void initializeItems() {
        inv.addItem(new ItemStack(Material.AIR,1));
        inv.addItem(new ItemStack(Material.AIR,1));
        inv.addItem(createGuiItem(Material.BLACK_STAINED_GLASS_PANE, "§bExample Helmet", "§aFirst line of the lore", "§bSecond line of the lore"));
        inv.addItem(new ItemStack(Material.AIR,1));
        inv.addItem(new ItemStack(Material.AIR,1));
        inv.addItem(new ItemStack(Material.AIR,1));
        inv.addItem(new ItemStack(Material.AIR,1));
        inv.addItem(createGuiItem(Material.BLACK_STAINED_GLASS_PANE, "§bExample Helmet", "§aFirst line of the lore", "§bSecond line of the lore"));
        inv.addItem(new ItemStack(Material.AIR,1));
         }

    protected ItemStack createGuiItem(final Material material, final String name, final String... lore) {
        final ItemStack item = new ItemStack(material, 1);
        final ItemMeta meta = item.getItemMeta();

        // Set the name of the item
        meta.setDisplayName(name);

        // Set the lore of the item
        meta.setLore(Arrays.asList(lore));

        item.setItemMeta(meta);

        return item;
    }

    // You can open the inventory with this
    public void openInventory(final HumanEntity ent) {
        ent.openInventory(inv);
    }

    // Check for clicks on items
    @EventHandler
    public void onInventoryClick(final InventoryClickEvent e) {
        if (!e.getInventory().equals(inv)) return;

        e.setCancelled(true);

        final ItemStack clickedItem = e.getCurrentItem();

        // verify current item is not null
        if (clickedItem == null || clickedItem.getType().isAir()) return;

        final Player p = (Player) e.getWhoClicked();

        // Using slots click is a best option for your inventory click's
        p.sendMessage("You clicked at slot " + e.getRawSlot());
    }

    // Cancel dragging in our inventory
    @EventHandler
    public void onInventoryClick(final InventoryDragEvent e) {
        if (e.getInventory().equals(inv)) {
            e.setCancelled(true);
        }
    }

}

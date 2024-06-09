package pl.stylowamc.smcore.gameplay.pickaxes;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class CraftingBlock implements Listener {
    @EventHandler
    public void craftItem(PrepareItemCraftEvent e){
        Material itemType;
        try{
            itemType = e.getRecipe().getResult().getType();
            Byte itemData = e.getRecipe().getResult().getData().getData();
            if(itemType== Material.WOODEN_HOE || itemType == Material.WOODEN_AXE || itemType == Material.WOODEN_PICKAXE || itemType == Material.WOODEN_SHOVEL || itemType == Material.WOODEN_SWORD ||
                    itemType== Material.STONE_HOE || itemType == Material.STONE_AXE || itemType == Material.STONE_PICKAXE || itemType == Material.STONE_SHOVEL || itemType == Material.STONE_SWORD ||
                    itemType== Material.IRON_HOE || itemType == Material.IRON_AXE || itemType == Material.IRON_PICKAXE || itemType == Material.IRON_SHOVEL || itemType == Material.IRON_SWORD ||
                    itemType== Material.GOLDEN_HOE || itemType == Material.GOLDEN_AXE || itemType == Material.GOLDEN_PICKAXE || itemType == Material.GOLDEN_SHOVEL || itemType == Material.GOLDEN_SWORD ||
                    itemType== Material.DIAMOND_HOE || itemType == Material.DIAMOND_AXE || itemType == Material.DIAMOND_PICKAXE || itemType == Material.DIAMOND_SHOVEL || itemType == Material.DIAMOND_SWORD
            ) {
                e.getInventory().setResult(new ItemStack(Material.AIR));
                for(HumanEntity he:e.getViewers()) {
                    if(he instanceof Player) {
                        ((Player)he).sendMessage(ChatColor.RED+"Żeby uzyskać darmowe narzędzia użyj komendy /kit start!");
                    }
                }
            }
        }
        catch(NullPointerException ex){
            return;
        }
    }

    @EventHandler
    public void RemoveItemsFromChests (InventoryOpenEvent e) {
        //
        try {
            //WOODEN TOOLS remove from chests
            if (!e.getInventory().all(Material.WOODEN_PICKAXE).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.WOODEN_PICKAXE);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.WOODEN_AXE).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.WOODEN_AXE);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.WOODEN_SHOVEL).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.WOODEN_SHOVEL);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.WOODEN_HOE).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.WOODEN_HOE);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.WOODEN_SWORD).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.WOODEN_SWORD);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            //STONE TOOLS remove from chests
            if (!e.getInventory().all(Material.STONE_PICKAXE).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.STONE_PICKAXE);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.STONE_AXE).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.STONE_AXE);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.STONE_SHOVEL).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.STONE_SHOVEL);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.STONE_HOE).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.STONE_HOE);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.STONE_SWORD).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.STONE_SWORD);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            //IRON TOOLS remove from chests
            if (!e.getInventory().all(Material.IRON_PICKAXE).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.IRON_PICKAXE);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.IRON_AXE).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.IRON_AXE);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.IRON_SHOVEL).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.IRON_SHOVEL);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.IRON_HOE).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.IRON_HOE);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.IRON_SWORD).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.IRON_SWORD);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            //GOLDEN TOOLS remove from chests
            if (!e.getInventory().all(Material.GOLDEN_PICKAXE).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.GOLDEN_PICKAXE);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.GOLDEN_AXE).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.GOLDEN_AXE);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.GOLDEN_SHOVEL).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.GOLDEN_SHOVEL);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.GOLDEN_HOE).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.GOLDEN_HOE);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.GOLDEN_SWORD).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.GOLDEN_SWORD);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            //DIAMOND TOOLS remove from chests
            if (!e.getInventory().all(Material.DIAMOND_PICKAXE).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.DIAMOND_PICKAXE);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.DIAMOND_AXE).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.DIAMOND_AXE);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.DIAMOND_SHOVEL).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.DIAMOND_SHOVEL);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.DIAMOND_HOE).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.DIAMOND_HOE);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
            if (!e.getInventory().all(Material.DIAMOND_SWORD).isEmpty()
            ){
                HashMap<Integer, ? extends ItemStack> g = e.getInventory().all(Material.DIAMOND_SWORD);
                g.forEach((k,v) -> {
                    if (!v.getItemMeta().hasLore()){
                        v.setAmount(0);
                    }
                });
            }
        }catch(NullPointerException ex) {return;}
    }
}

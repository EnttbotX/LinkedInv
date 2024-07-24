package x.Entt.LinkedInv.Events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import x.Entt.LinkedInv.LI;
import static x.Entt.LinkedInv.LI.inv;

public class Events implements Listener {
    private LI plugin;

    public Events(LI plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getInventory() == inv && event.getCurrentItem().getType() == Material.ANVIL) {
            event.setCancelled(true);
            event.getWhoClicked().getInventory().addItem(new ItemStack(Material.APPLE));
        }
    }
}

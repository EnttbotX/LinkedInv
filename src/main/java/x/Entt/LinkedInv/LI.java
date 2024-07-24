package x.Entt.LinkedInv;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

import x.Entt.LinkedInv.CMDs.CMD;
import x.Entt.LinkedInv.Events.Events;
import x.Entt.LinkedInv.Utils.MSG;

public class LI extends JavaPlugin implements Listener {
   public static Inventory inv;
   private final String version = getDescription().getVersion();
   public static String prefix = MSG.color("&c&lLinked&4&lInv");

   public void onEnable() {
      inv = Bukkit.createInventory(null, 27, "Server Sharing Inventory");

      registerEvents();
      registerCommands();

      Bukkit.getConsoleSender().sendMessage(MSG.color(
              prefix + "&av" + version + " &2Enabled!"
      ));
   }

   public void onDisable() {
      Bukkit.getConsoleSender().sendMessage(MSG.color(
              prefix + "&av" + version + " &cDisabled"
      ));

      saveConfig();
   }

   public void registerEvents() {
      this.getServer().getPluginManager().registerEvents(new Events(this), this);
   }

   public void registerCommands() {
      this.getCommand("linkedinv").setExecutor(new CMD(this));
   }
}
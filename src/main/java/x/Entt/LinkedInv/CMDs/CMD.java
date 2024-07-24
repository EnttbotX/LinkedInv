package x.Entt.LinkedInv.CMDs;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import x.Entt.LinkedInv.LI;
import static x.Entt.LinkedInv.LI.inv;

public class CMD implements CommandExecutor {
    private LI plugin;

    public CMD(LI plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (s.equalsIgnoreCase("LinkedInv") && sender instanceof Player) {
            ((Player)sender).openInventory(inv);
        }

        return false;
    }
}

package salary;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.Configuration;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    @Override

    public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {

        Configuration cfg = Fails.getPlugin().getConfig();
        double sum;
        Player p =(Player)sender;
        if(p.hasPermission(cfg.getString("Vip.Permission"))){
            p.sendMessage(cfg.getString("Messages.Salary").replace("&","§"));
        }
        return true;
    }
}
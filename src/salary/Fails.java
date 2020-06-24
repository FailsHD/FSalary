package salary;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Fails extends JavaPlugin {

    @Override
    public void onEnable(){
        getLogger().info("Enable");
        getCommand("salary").setExecutor(new Commands());
    }
    @Override
    public void onDisable(){
        getLogger().info("Disable");
    }
    public static Fails getPlugin() {
        return Fails.getPlugin(Fails.class);
    }
}
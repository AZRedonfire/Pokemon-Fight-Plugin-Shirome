package ch.azredonfire.pokemonfightplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable(){
        Bukkit.getConsoleSender().sendMessage(
                "Plugin crée par" + getDescription().getAuthors() + "\n" +
                "Version : " + getDescription().getVersion() + "\n" +
                getDescription().getDescription());
        getServer().getPluginManager().registerEvents(new PokemonFightListeners(), this);
        System.out.println("Plugin Pokemon Allumé");
        super.onEnable();
    }

    public void onDisable(){
        super.onDisable();
    }


}

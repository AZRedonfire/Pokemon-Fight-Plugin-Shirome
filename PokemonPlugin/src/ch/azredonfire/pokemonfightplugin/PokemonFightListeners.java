package ch.azredonfire.pokemonfightplugin;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class PokemonFightListeners implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        ItemStack RatataFuite = new ItemStack(Material.REDSTONE);

        player.getInventory().clear();
        player.getInventory().addItem(new ItemStack(Material.ARROW));
        player.getInventory().addItem(RatataFuite);

        player.updateInventory();

    }

}

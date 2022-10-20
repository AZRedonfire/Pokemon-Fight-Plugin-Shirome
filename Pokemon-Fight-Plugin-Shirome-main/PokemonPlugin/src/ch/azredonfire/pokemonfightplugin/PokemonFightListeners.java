package ch.azredonfire.pokemonfightplugin;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;


public class PokemonFightListeners implements Listener {

    int NbOfItemCustom = 1;

    ItemStack RatataFuite = new ItemStack(Material.COBBLESTONE, 1);
    ItemStack RatataCran = new ItemStack(Material.STONE, 1);



    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        player.getInventory().clear();
        player.getInventory().addItem(new ItemStack(Material.ARROW));
        player.getInventory().addItem(RatataFuite);




        for(int i=0; i<5; ++i){

            ItemStack CurrentItem = new ItemStack((Material.STONE));

            player.getInventory().addItem(CurrentItem);

        }
        player.updateInventory();
    }

}

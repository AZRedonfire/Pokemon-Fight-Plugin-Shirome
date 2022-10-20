package ch.azredonfire.pokemonfightplugin;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;


public class PokemonFightListeners implements Listener {

    int NbOfItemCustom = 1;

    ItemStack ratataFuite = new ItemStack(Material.COBBLESTONE, 1);
    ItemMeta ratataFuiteM = ratataFuite.getItemMeta() ;

    ItemStack ratataCran = new ItemStack(Material.STONE, 1);
    ItemMeta ratataCranM = ratataCran.getItemMeta() ;



    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        player.getInventory().clear();
        player.getInventory().setItem(5, new ItemStack(Material.COMPASS));
        for(int i = 0; i <= CustomItemsListFinal.size(); ++i){

        }
        player.getInventory().addItem(ratataFuite);
        player.getInventory().addItem(ratataCran);

        /*
        for(int i=0; i<5; ++i){

            ItemStack CurrentItem = new ItemStack((Material.STONE));

            player.getInventory().addItem(CurrentItem);

        }
        player.updateInventory();*/
    }

    @EventHandler
    public void OnInteract(PlayerInteractEvent event){

        Player player = event.getPlayer();
        Action action = event.getAction();
        ItemStack it = event.getItem();

        if (it != null && it.getType() == Material.COMPASS){
            if(action == Action.RIGHT_CLICK_AIR | action == Action.RIGHT_CLICK_BLOCK) {

                Inventory inv = Bukkit.createInventory(null, 54, "§7Pokemon Select");

                player.openInventory(inv);
            }
        }



    }

}

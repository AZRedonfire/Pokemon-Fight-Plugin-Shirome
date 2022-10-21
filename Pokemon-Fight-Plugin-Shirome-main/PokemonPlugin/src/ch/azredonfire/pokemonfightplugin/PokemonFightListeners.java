package ch.azredonfire.pokemonfightplugin;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;


public class PokemonFightListeners implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        player.getInventory().clear();
        player.getInventory().setItem(5, new ItemStack(Material.COMPASS));



        player.updateInventory();
    }

    @EventHandler
    public void OnInteract(PlayerInteractEvent event){

        Player player = event.getPlayer();
        Action action = event.getAction();
        ItemStack it = event.getItem();

        if (it != null && it.getType() == Material.COMPASS) {
            if (action == Action.RIGHT_CLICK_AIR | action == Action.RIGHT_CLICK_BLOCK) {
                Inventory inv = Bukkit.createInventory(null, 54, "§7Pokemon Select");

                RegisterCustomItems.RegisterCustomItems(Material.BONE, 1, "Ratata");
                inv.setItem(1, RegisterCustomItems.GetItemsOnList(RegisterCustomItems.lastItemID));

                RegisterCustomItems.RegisterCustomItems(Material.FIREBALL, 1, "Salamèche");
                inv.setItem(2, RegisterCustomItems.GetItemsOnList(RegisterCustomItems.lastItemID));

                RegisterCustomItems.RegisterCustomItems(Material.WATER_BUCKET, 1, "Carapuce");
                inv.setItem(3, RegisterCustomItems.GetItemsOnList(RegisterCustomItems.lastItemID));

                RegisterCustomItems.RegisterCustomItems(Material.LEAVES, 1, "Bulbizare");
                inv.setItem(4, RegisterCustomItems.GetItemsOnList(RegisterCustomItems.lastItemID));

                RegisterCustomItems.RegisterCustomItems(Material.BONE, 1, "Chenipan");
                inv.setItem(5, RegisterCustomItems.GetItemsOnList(RegisterCustomItems.lastItemID));

                RegisterCustomItems.RegisterCustomItems(Material.BONE, 1, "Pikachu");
                inv.setItem(6, RegisterCustomItems.GetItemsOnList(RegisterCustomItems.lastItemID));

                RegisterCustomItems.RegisterCustomItems(Material.STONE, 1, "Machoc");
                inv.setItem(7, RegisterCustomItems.GetItemsOnList(RegisterCustomItems.lastItemID));

                RegisterCustomItems.RegisterCustomItems(Material.BONE, 1, "Chetiflor");
                inv.setItem(8, RegisterCustomItems.GetItemsOnList(RegisterCustomItems.lastItemID));

                RegisterCustomItems.RegisterCustomItems(Material.BONE, 1, "Roucool");
                inv.setItem(9, RegisterCustomItems.GetItemsOnList(RegisterCustomItems.lastItemID));

                RegisterCustomItems.RegisterCustomItems(Material.BONE, 1, "Taupiqueur");
                inv.setItem(10, RegisterCustomItems.GetItemsOnList(RegisterCustomItems.lastItemID));

                RegisterCustomItems.RegisterCustomItems(Material.BONE, 1, "Abra");
                inv.setItem(11, RegisterCustomItems.GetItemsOnList(RegisterCustomItems.lastItemID));

                RegisterCustomItems.RegisterCustomItems(Material.BONE, 1, "Nodulithe");
                inv.setItem(12, RegisterCustomItems.GetItemsOnList(RegisterCustomItems.lastItemID));

                RegisterCustomItems.RegisterCustomItems(Material.BONE, 1, "Métamorphe");
                inv.setItem(13, RegisterCustomItems.GetItemsOnList(RegisterCustomItems.lastItemID));

                player.openInventory(inv);
            }
        }
    }

    @EventHandler
    public void onClick(InventoryClickEvent event){

        Inventory inv = event.getInventory();
        Player player = (Player) event.getWhoClicked();
        ItemStack current = event.getCurrentItem();

        if (current == null) return;


        if (inv.getName().equalsIgnoreCase("§7Pokemon Select")){

            event.setCancelled(true);

            if (current.getType() == Material.FIREBALL){
                player.closeInventory();
                player.getInventory().setItem(1, RegisterCustomItems.RegisterCustomItems(Material.COAL, 1, "Flammèche"));
                player.getInventory().setItem(2, RegisterCustomItems.RegisterCustomItems(Material.REDSTONE, 1, "Lance Flammes"));
            }

        }

    }

}

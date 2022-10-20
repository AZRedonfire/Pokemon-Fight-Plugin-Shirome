package ch.azredonfire.pokemonfightplugin;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemCustomList {

//A vérifier
    //liste des Items custom
    public static void list(String[] args) {

        ArrayList CustomItemsList = new ArrayList();
        ArrayList CustomItemsListFinal = new ArrayList();

        ItemStack ratataFuite = new ItemStack(Material.WOOD, 1);
        ItemMeta ratataFuiteM = ratataFuite.getItemMeta();
        ratataFuiteM.setDisplayName("Fuite");
        ratataFuite.setItemMeta(ratataFuiteM);
        CustomItemsList.add(ratataFuite);

        ItemStack ratataCran = new ItemStack(Material.STONE, 1);
        ItemMeta ratataCranM = ratataCran.getItemMeta();
        ratataCranM.setDisplayName("Cran");
        ratataCran.setItemMeta(ratataCranM);
        CustomItemsList.add(ratataCran);


//A vérifier
        //Boucle d'enregistrement des items dans la liste
        for(int i = 0; i <= CustomItemsList.size(); ++i){
            ItemStack currentItem = (ItemStack) CustomItemsList.get(i);
            ItemStack currentItemStack = new ItemStack(currentItem.getType(), 1);
            ItemMeta currentItemM = currentItem.getItemMeta();
            currentItemM.setDisplayName(currentItem.getItemMeta().getDisplayName());
            currentItem.setItemMeta(currentItemM);
            CustomItemsListFinal.add(currentItemStack);
            System.out.println(CustomItemsListFinal.get(i));
        }
    }
}

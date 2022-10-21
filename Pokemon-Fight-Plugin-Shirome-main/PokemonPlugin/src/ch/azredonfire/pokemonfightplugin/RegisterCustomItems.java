package ch.azredonfire.pokemonfightplugin;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public abstract class RegisterCustomItems {
    static ArrayList<ItemStack> CustomItems = new ArrayList<ItemStack>();
    static int lastItemID = CustomItems.size();
    //Methode contenant la liste des Items Customs
    public static void AddCustomItemsOnList(ItemStack currentItemStack){
        ArrayList<ItemStack> CustomItemsList = new ArrayList<ItemStack>();

        CustomItemsList.add(currentItemStack);

        CustomItems = CustomItemsList;
    }
    //Methode ajoutant les Items custom a la liste
    public static ItemStack RegisterCustomItems(Material material, int quantity, String name) {
        ItemStack currentItem = new ItemStack(material, quantity);
        ItemMeta currentItemM = currentItem.getItemMeta();
        currentItemM.setDisplayName(name);
        currentItem.setItemMeta(currentItemM);
        AddCustomItemsOnList(currentItem);
        return new ItemStack(currentItem);
    }
    //Méthode permettant de récuperer un ItemStack de la list
    public static ItemStack GetItemsOnList(int listID){
        return CustomItems.get(listID);
    }

}

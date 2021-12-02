package be.technifutur.menu;

import java.util.ArrayList;

public class MenuModel {

    //attributs
    private ArrayList<Item> itemList = new ArrayList<>(); //création d'un attribut privé ArrayList


    //3 méthodes publiques
    public void addItem (Item item) { //code qui ajoute le paramètre item à la fin de la liste itemList
        itemList.add(item);
    }

    public Item getItem(int pos) { //code qui retourne la référence de l'item en position pos dans itemList
        //si pos ne correspond à aucun élément de itemList, la méthode retourne null
        if (pos >= itemList.size() || pos < 0) {
            return null;
        } else {
            return itemList.get(pos);
        }
    }

    public int getSize(){ //retourne le nombre d'Items dans itemList
            return itemList.size();
    }

}


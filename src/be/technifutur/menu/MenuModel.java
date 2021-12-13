package be.technifutur.menu;

import java.util.ArrayList;

public class MenuModel {

    //attributs
    private ArrayList<MenuNode> menuNodeList = new ArrayList<>(); //création d'un attribut privé ArrayList


    //3 méthodes publiques
    public void addMenuNode (MenuNode MenuNode) { //code qui ajoute le paramètre item à la fin de la liste itemList
        menuNodeList.add(MenuNode);
    }

    public MenuNode getMenuNode(int pos) { //code qui retourne la référence de l'item en position pos dans itemList
        //si pos ne correspond à aucun élément de itemList, la méthode retourne null
        if (pos >= menuNodeList.size() || pos < 0) {
            return null;
        } else {
            return menuNodeList.get(pos);
        }
    }

    public int getSize(){ //retourne le nombre d'MenuNodes dans MenuNodeList
            return menuNodeList.size();
    }

}


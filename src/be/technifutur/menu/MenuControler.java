package be.technifutur.menu;

import java.awt.*;
import java.util.Scanner;

public class MenuControler implements MenuNode{

    //attributs privés
    private MenuModel model;
    private MenuVue vue;

    //2 accesseurs publics en écriture (setter), 1 par attributs
    public void setModel(MenuModel model) {
        this.model = model;
    }

    public void setVue(MenuVue vue) {
        this.vue = vue;
    }

    //méthode publique getAction Runnable
    @Override
    public Runnable getAction() {
        Runnable result = null;
        boolean saisieok = false;
        vue.setError(null);
        int choix=0;

        do {
            String input = vue.saisirMenu(model);
            try {
                choix = Integer.parseInt(input) - 1; //transformation du choix en position
                MenuNode nodeChoisi = model.getMenuNode(choix); //si position valide, récupération de l'item puis de l'action à partir du model

                if (choix >= 0 && choix < model.getSize()) {
                    saisieok = true;
                    MenuNode menuNode = model.getMenuNode(choix);
                    result = menuNode.getAction();
                } else{
                    vue.setError("Il n'existe pas d'option "+(choix+1));
                }
            } catch (NumberFormatException e) {
                vue.setError(input +" n'est pas un numérique");
            }

        } while (saisieok == false);
        vue.setError(null);
        return result;
    }

    @Override
    public String getName(){
        return model.getName();
    }


}

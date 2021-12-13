package be.technifutur.menu;

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
    public Runnable getAction(){

        String choixUtil=vue.saisirMenu(model); //récupération du choix de l'utilisateur grâce à la vue
        int choixUtilEnInt= Integer.parseInt(choixUtil)-1; //transformation du choix en position
        MenuNode nodeChoisi=model.getMenuNode(choixUtilEnInt); //si position valide, récupération de l'item puis de l'action à partir du model
        if (nodeChoisi == null){
            return null;
        } else {
            return nodeChoisi.getAction();
        }
    }

    @Override
    public String getName(){
        return model.getName();
    }


}

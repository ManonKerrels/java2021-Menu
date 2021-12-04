package be.technifutur.menu;

public class MenuControler {

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
    public Runnable getAction(){
        String choixUtil=vue.saisirMenu(model); //récupération du choix de l'utilisateur grâce à la vue
        int choixUtilEnInt= Integer.parseInt(choixUtil)-1; //transformation du choix en position
        Item itemChoisi=model.getItem(choixUtilEnInt); //si position valide, récupération de l'item puis de l'action à partir du model
        if (itemChoisi == null){
            return null;
            System.out.prinln("Cette action n'est pas possible. Veuillez choisir un nombre proposé précédemment"); //retourner action ou null
        } else {
            return itemChoisi.getAction();
        }
    }


}

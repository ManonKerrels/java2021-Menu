package be.technifutur.menu;

//importe documents externes
import be.technifutur.menu.actions.HelloWorld;
import be.technifutur.menu.actions.Comparaison;

// création d'une classe MenuFactory
public class MenuFactory {

    public MenuNode getItemHelloWorld() { //création MenuNode "getmenuNodeHelloWorld"
        return createItem("HelloWorld", new HelloWorld()); //renvoi du résultat après avoir assigné un String (name) et un Runnable (action)
    }

    public MenuNode getItemComparaison(){ //création MenuNode "getMenuNodeComparaison"
        return createItem("Comparaison", new Comparaison());
    } //idem

    private Item createItem(String name, Runnable action){ //fonction utilitaire qui regroupe ce qu'il y a de commun aux méthodes. On demande que lavariable soit initialisée en dehors de la parenthèse
        Item toto= new Item(); //création d'un nouvel MenuNode "toto"
        toto.setName(name); //assignation d'un String (name) pour "toto"
        toto.setAction(action); //assignation d'un Runnable (action) pour "toto"
        return toto; //renvoi du résultat au Main
    }

    //2 méthodes
    public MenuControler getMenu(){ //Méthode publique getMenu de type MenuControler
        MenuControler menuControler= new MenuControler(); //création d'un objet de type MenuControler
        MenuModel menuModel= new MenuModel(); //idem objet de type MenuModel
        MenuVue menuVue= new MenuVue(); //idem objet de type MenuVue
        initMenu(menuModel); //on ajoute les MenuNodes depuis la fonction initMenu

        //on passe le MenuModel et MenuVue en attributs du MenuController
        menuControler.setModel(menuModel);
        menuControler.setVue(menuVue);

        return menuControler; //on renvoie le controller tel quel
    }

    private void initMenu(MenuModel menuModel) {
        menuModel.addMenuNode(getItemComparaison());
        menuModel.addMenuNode(getItemHelloWorld());
    }

}

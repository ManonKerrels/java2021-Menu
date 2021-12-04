package be.technifutur.menu;

//importe documents externes
import be.technifutur.menu.actions.HelloWorld;
import be.technifutur.menu.actions.Comparaison;

// création d'une classe MenuFactory
public class MenuFactory {

    public Item getItemHelloWorld() { //création Item "getItemHelloWorld"
        return createItem("HelloWorld", new HelloWorld()); //renvoi du résultat après avoir assigné un String (name) et un Runnable (action)
    }

    public Item getItemComparaison(){ //création Item "getItemComparaison"
        return createItem("Comparaison", new Comparaison());
    } //idem

    private Item createItem(String name, Runnable action){ //fonction utilitaire qui regroupe ce qu'il y a de commun aux méthodes. On demande que lavariable soit initialisée en dehors de la parenthèse
        Item toto= new Item(); //création d'un nouvel Item "toto"
        toto.setName(name); //assignation d'un String (name) pour "toto"
        toto.setAction(action); //assignation d'un Runnable (action) pour "toto"
        return toto; //renvoi du résultat au Main
    }

    //2 méthodes
    public MenuControler getMenu(){ //Méthode publique getMenu de type MenuControler
        MenuControler menuControler= new MenuControler(); //création d'un objet de type MenuControler
        MenuModel menuModel= new MenuModel(); //idem objet de type MenuModel
        MenuVue menuVue= new MenuVue(); //idem objet de type MenuVue
    }

    private MenuModel menu(){ //Méthode privée menu de type MenuModel
        addItem(MenuFactory MenuFactory); //Le code ajoute dans le menu les items en appelant les autres méthodes de la factory (méthode addItem)
          //initialisation du controler grâce à ces 2 setters
        return controler();  //retourner le controler
    }

    private Item initMenu(MenuModel menuModel){  //initialisation du model grâce à la méthode initMenu
        return menuModel();
    }

}

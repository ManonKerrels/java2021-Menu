package be.technifutur.menu;

//importe documents externes
import be.technifutur.menu.actions.HelloWorld;
import be.technifutur.menu.actions.Comparaison;
import be.technifutur.menu.actions.Test;
import be.technifutur.menu.actions.Triparaison;

// création d'une classe MenuFactory
public class MenuFactory {

    public MenuNode getItemHelloWorld() { //création MenuNode "getmenuNodeHelloWorld"
        return createItem("HelloWorld", new HelloWorld()); //renvoi du résultat après avoir assigné un String (name) et un Runnable (action)
    }

    public MenuNode getItemComparaison(){ //création MenuNode "getMenuNodeComparaison"
        return createItem("Comparaison", new Comparaison());
    } //idem

    public MenuNode getItemTriparaison(){ //création MenuNode "getMenuNodeComparaison"
        return createItem("Triparaison", new Triparaison());
    }

    public MenuNode getItemTest(){ //création MenuNode "getMenuNodeComparaison"
        return createItem("Équation à une inconue", new Test());
    }

    private Item createItem(String name, Runnable action){ //fonction utilitaire qui regroupe ce qu'il y a de commun aux méthodes. On demande que lavariable soit initialisée en dehors de la parenthèse
        Item toto= new Item(); //création d'un nouvel MenuNode "toto"
        toto.setName(name); //assignation d'un String (name) pour "toto"
        toto.setAction(action); //assignation d'un Runnable (action) pour "toto"
        return toto; //renvoi du résultat au Main
    }

    //2 méthodes
    public MenuControler getMenu(){ //Méthode publique getMenu de type MenuControler
        return createMenu(getModelPrincipal()); //on renvoie le controler tel quel
    }

    private MenuControler createMenu(MenuModel menuModel){
        MenuControler menuControler= new MenuControler(); //création d'un objet de type MenuControler
        menuControler.setVue(new MenuVue());
        menuControler.setModel(menuModel);
        return menuControler;
    }

    public Item getItemQuitter() {
        return createItem("Quitter", null);
    }

    private MenuModel getModelPrincipal(){
        MenuModel menuModel= new MenuModel("Menu principal");
        menuModel.addMenuNode(getItemHelloWorld());
        menuModel.addMenuNode(createMenu(getModelExercices()));
        menuModel.addMenuNode(getItemQuitter());
        return menuModel;
    }

    private MenuModel getModelExercices(){
        MenuModel menuModel= new MenuModel("Exercices");
        menuModel.addMenuNode(getItemComparaison());
        menuModel.addMenuNode(getItemTriparaison());
        menuModel.addMenuNode(getItemTest());
        menuModel.addMenuNode(getItemQuitter());
        return menuModel;
    }

    private void initMenu(MenuModel menuModel) {
        menuModel.addMenuNode(getItemComparaison());
        menuModel.addMenuNode(getItemHelloWorld());
    }

}

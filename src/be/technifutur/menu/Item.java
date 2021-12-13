package be.technifutur.menu;

public class Item implements MenuNode{ //création de la classe appelée "Item"
    //attributs
    private String name; //création d'un objet de type String appelé "name"
    private Runnable action; //création d'un objet de type Runnable appelé "action"

    //méthodes
    public void setName(String name) { //méthode qui permet d'instancier l'objet de type String (name)
        this.name = name; //on reprécise sur quelle instance on veut affecter le String
    }

    public void setAction(Runnable action) { //méthode qui permet d'instancier l'objet de type Runnable (action)
        this.action = action; //on reprécise sur quelle instance onveut affecter le Runnable
    }

    public Runnable getAction() { //méthode qui permet de récupérer l'objet de type Runnable (action)
        return action; //on retourne au Main l'objet Runnable (action)
    }

    public String getName() { //méthode qui permet de récupérer l'objet de type String (name)
        return name; //on retourne au Main l'objet String (name)
    }
}

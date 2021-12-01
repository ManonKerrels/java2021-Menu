package be.technifutur.menu;

public class Item {
    private String name;
    private Runnable action;

    public void setName(String name) {
        this.name = name;
    }

    public void setAction(Runnable action) {
        this.action = action;
        //coucou
    }

    public Runnable getAction() {
        return action;
    }

    public String getName() {
        return name;
    }
}

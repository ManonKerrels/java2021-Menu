package be.technifutur.menu;

import be.technifutur.menu.actions.HelloWorld;
import be.technifutur.menu.actions.NombresPremiers;

public class Main {

    public static void main(String[] args) {
        Runnable action1 = new HelloWorld();
        Runnable action2 = new NombresPremiers();
        action1.run();
        action2.run();
    }
}

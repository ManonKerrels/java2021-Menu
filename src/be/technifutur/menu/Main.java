package be.technifutur.menu;

import be.technifutur.menu.actions.HelloWorld;

public class Main {

    public static void main(String[] args) {
        Runnable action = new HelloWorld();
        action.run();
    }
}

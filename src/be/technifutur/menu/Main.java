package be.technifutur.menu;

import java.util.Scanner;
import be.technifutur.menu.actions.HelloWorld;
import be.technifutur.menu.actions.Comparaison;
import be.technifutur.menu.actions.Triparaison;

public class Main{
    public static void main(String[]args){
        MenuFactory menuFactory = new MenuFactory();
        MenuControler menuControler = menuFactory.getMenu();

        Runnable action;
        action = menuControler.getAction();
        if(action != null){
            action.run();
        } else{
            System.out.println("À la revoyure !");
        }

    }
}
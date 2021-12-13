package be.technifutur.menu;

public interface MenuNode { //sous-menu affecté soit aux Items soit dans un Menu

    Runnable getAction();
    String getName();
}

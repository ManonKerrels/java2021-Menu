package be.technifutur.menu;

import java.util.Scanner;

public class MenuVue {

    //attribut privé input Scanner pointant sur System.in
    private Scanner input= new Scanner(System.in);


    public String saisirMenu(MenuModel menu){ //méthode publique String qui fait appel au MenuModel,
        for (int i=0; i<menu.getSize(); i++){
            System.out.println(menu.getItem(i)) ; //affiche les items du menu
        }
        System.out.println("Choix :"); // demande les choix d'utilisateur
        return input.nextLine(); //équivaut à choix=input.nextLine(); + return choix;
          //saisi le choix grâce à input
          // retourne ce choix
    }

}

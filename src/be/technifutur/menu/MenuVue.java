package be.technifutur.menu;

import java.util.Scanner;

public class MenuVue {

    //attribut privé input Scanner pointant sur System.in
    private Scanner input= new Scanner(System.in);
    private String error = null;

    public void setError(String message){
        this.error = message;
    }


    public String saisirMenu(MenuModel menu){ //méthode publique String qui fait appel au MenuModel

        String nameMenu = menu.getName();
        System.out.println(nameMenu);
        System.out.println("-".repeat(nameMenu.length()));

        for (int i=0; i<menu.getSize(); i++){
            System.out.println((i+1)+" "+ menu.getMenuNode(i).getName()) ; //affiche les items du menu
        }

        if(this.error != null){
            System.out.println("Erreur : "+error);
        }

        System.out.println("Choix :"); // demande les choix d'utilisateur
        return input.nextLine(); //équivaut à choix=input.nextLine(); + return choix;
          //saisi le choix grâce à input
          // retourne ce choix


    }

}

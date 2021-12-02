package be.technifutur.menu;

import java.util.Scanner;
import be.technifutur.menu.actions.HelloWorld;
import be.technifutur.menu.actions.Comparaison;

public class Main{
    public static void main(String[]args){
        int choix=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Coucou !");

        HelloWorld helloworld;
        Comparaison comparaison;
        helloworld = new HelloWorld();
        comparaison = new Comparaison();


        MenuFactory factory= new MenuFactory();
        Item[] tab= new Item[2];
        tab[0]= factory.getItemHelloWorld();
        tab[1]= factory.getItemComparaison();

        for (int i=0; i< tab.length; i++){
            System.out.printf("(%2d) %s%n", i+1 , tab[i].getName());
        }
        System.out.print("choix : ");
        String input = sc.nextLine();
        choix = Integer.parseInt(input)-1;

        if(choix>=0 && choix<tab.length){
            tab[choix].getAction().run();
        }else{
            System.out.println("choix incorrect");
            }
        }
}
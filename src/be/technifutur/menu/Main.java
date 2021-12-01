package be.technifutur.menu;

import java.util.Scanner;
import be.technifutur.menu.actions.Helloworld;
import be.technifutur.menu.actions.Test;
import be.technifutur.menu.actions.Comparaison;
import be.technifutur.menu.actions.Triparaison;

public class Main{
    public static void main(String[]args){
        int choix=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Coucou !");

        Helloworld helloworld;
        Test test;
        Comparaison comparaison;
        Triparaison triparaison;
        helloworld = new Helloworld();
        test = new Test();
        comparaison = new Comparaison();
        triparaison = new Triparaison();
        Runnable[] tab={comparaison, test, triparaison, helloworld};

        while (choix > 4 || choix < 1){
            System.out.println("Choisissez ce que vous désirez afficher: 1. La comparaison de trois nombres, 2. L'équation du premier degré, 3. La comparaison de deux nombres, 4. Un tout gentil Hello world !");
            choix=sc.nextInt();
        }
        tab[choix-1].run();
            
    }
}
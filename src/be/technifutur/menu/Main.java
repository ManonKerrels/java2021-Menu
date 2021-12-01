package be.technifutur.menu;

import java.util.Scanner;
import be.technifutur.menu.actions.HelloWorld;
import be.technifutur.menu.actions.Test;
import be.technifutur.menu.actions.Comparaison;
import be.technifutur.menu.actions.Triparaison;

public class Main{
    public static void main(String[]args){
        int choix=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Coucou !");

        HelloWorld helloworld;
        Test test;
        Comparaison comparaison;
        Triparaison triparaison;
        helloworld = new HelloWorld();
        test = new Test();
        comparaison = new Comparaison();
        triparaison = new Triparaison();
        Runnable[] tab={comparaison, test, triparaison, helloworld};

        System.out.println("Choisissez ce que vous désirez afficher: 1. La comparaison de trois nombres, 2. L'équation du premier degré, 3. La comparaison de deux nombres, 4. Un tout gentil Hello world !");
        choix=sc.nextInt();

        while (choix > 4 || choix < 1){
            System.out.println("Mauvais choix ! Prenez un chiffre entre 1 et 4.");
            choix=sc.nextInt();
        }

        tab[choix-1].run();
        System.out.println("Ceci est la fin de votre programme. À la revoyure !");
            
    }
}
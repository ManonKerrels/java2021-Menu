package be.technifutur.menu.actions;

import java.util.Scanner;

public class NombresPremiers implements Runnable {
    @Override
    public void run() {

        System.out.println("Nombres premiers");
        System.out.println("----------------");
        System.out.print("combien en voulez-vous? : ");
        String input = new Scanner(System.in).nextLine();
        int premierSize = Integer.parseInt(input);

        int[] premiersTab = new int[premierSize];

        premiersTab[0] = 2;
        int premiersCount = 1;
        int nbTest = 3;

        while (premiersCount < premierSize) {
            boolean premier = true;
            int pos = 1;
            double racine = Math.sqrt(nbTest);
            while ( premier&& pos < premiersCount&& premiersTab[pos]<=racine){
                premier = nbTest % premiersTab[pos] != 0;
                pos++;
            }

            if (premier) {
                premiersTab[premiersCount] = nbTest;
                premiersCount++;
            }
            nbTest += 2;
        }

        for(int p = 0; p < premiersCount;p++){
            if(p % 10 == 0){
                System.out.printf("%n %3d", premiersTab[p]);
            }else{
                System.out.printf(", %3d", premiersTab[p]);
            }
        }

    }
}

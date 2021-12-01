package be.technifutur.menu.actions;

import java.util.Scanner;

public class Test implements Runnable{

	public void run() {
		System.out.println("Ce programme permet de résoudre une équation du premier degré (type ax + b)");
		float valA=0, valB=0;
		System.out.println("Choisissez la valeur de A = ");
		Scanner sc = new Scanner(System.in);
		valA=sc.nextFloat();
		System.out.println("Choisissez maintenant la valeur de B = ");
		valB=sc.nextFloat();
		
		if (valA==0 && valB==0) {
			System.out.println("Cette équation est indéterminée !");
		}
		else if (valA==0) {
			System.out.println("Cette équation est impossible !");
		}
		else {
			System.out.println("L'inconnue x équivaut à "+(-valB/valA));
		}
	}

}
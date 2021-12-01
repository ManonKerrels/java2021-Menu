package be.technifutur.menu.actions;

import java.util.Scanner;

public class Comparaison implements Runnable{
	@Override

	public void run(){
		System.out.println("Ce programme permet de comparer deux nombres encodés par l'utilisateur.");
		System.out.println("Commencez par encoder votre premier nombre :");
		int valA=0, valB=0;
		Scanner sc = new Scanner(System.in);
		valA=sc.nextInt();
		System.out.println("Et maintenant, veuillez encoder votre deuxième nombre :");
		valB=sc.nextInt();
		
		if (valA > valB) {
			System.out.println(valA+" est supérieur à "+valB);
		} 
		else if (valA == valB) {
			System.out.println(valA+" et "+valB+" sont équivalents");
		} 
		else {
			System.out.println(valB+" est supérieur à "+valA);
		}
	}

}
package be.technifutur.menu.actions;

import java.util.Scanner;

public class Triparaison implements Runnable{

	public void run() {
		System.out.println("Ce programme permet de comparer trois nombres entre eux, en voyant notamment lequel est supérieur et lequel est inférieur.");
		System.out.println("Commencez par encoder votre premier nombre :");
		int valA=0, valB=0, valC=0;
		Scanner sc = new Scanner(System.in);
		valA=sc.nextInt();
		System.out.println("Encodez maintenant votre deuxième nombre :");
		valB=sc.nextInt();
		System.out.println("Et terminez par votre troisième nombre :");
		valC=sc.nextInt();
		
		if (valA == valB) {
			if (valC < valA) {
				System.out.println(valC+" est inférieur à A et B, qui sont équivalents.");
			}
			else if (valC > valA) {
				System.out.println(valC+" est supérieur à A et B, qui sont équivalents.");
			}
			else {
				System.out.println("Les trois valeurs sont équivalentes.");
			}
		}
		else if (valA > valB) {
			if (valC > valA) {
				System.out.println(valC+" est supérieur à "+valA+" qui est lui-même supérieur à "+valB);
			}
			else if (valC == valA) {
				System.out.println("A et C sont équivalent et sont supérieurs à "+valB);
			}
			else if (valC > valB) {
				System.out.println(valB+" est inférieur à "+valC+" qui est lui-même inférieur à "+valA);
			}
			else if (valC == valB) {
				System.out.println("B et C sont équivalents et sont inférieurs à "+valA);
			}
			else {
				System.out.println(valC+" est inférieur à "+valB+" qui est lui-même inférieur à "+valA);
			}
		}
		else {
			if (valC > valB) {
				System.out.println(valC+" est supérieur à "+valB+" qui est lui-même supérieur à "+valA);
			}
			else if (valC == valB) {
				System.out.println("B et C sont équivalents et sont eux-mêmes supérieurs à "+valA);
			}
			else if (valC > valA) {
				System.out.println(valA+" est inférieur à "+valC+" qui est lui-même inférieur à "+valB);
			}
			else if (valC == valA) {
				System.out.println("A et C sont équivalents et sont inférieurs à "+valB);
			}
			else {
				System.out.println(valC+" est inférieur à "+valA+" qui est lui-même inférieur à "+valB);
			}
		}
	}

}
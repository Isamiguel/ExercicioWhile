package ExercicioFor1;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		int numero1, numero2, contador;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o numero: ");
		numero1 = leia.nextInt();
		System.out.println("Digite um  numero maior que o primeiro");
		numero2 = leia.nextInt();
		
		if(numero1 > numero2) {
		System.out.println("Intervalo invalido: ");
		
		} else {
			System.out.println("No intervaldo adicione" + numero1 + "e" + numero2);
			
			for(contador = numero1; contador <  numero2; contador++) {
			if(contador % 3 == 0 && contador % 5 == 0) {
				System.out.println(contador + "é multiplo de 3 e 5 ");
			}
		}
			
		}
		
	}

}
package exercicioslacoscondicionais;

import java.util.Scanner;

public class RepeticaoFor {

	public static void main(String[] args) {
		int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        int numerosPar = 0;
        int numerosImpar = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                numerosPar++;
            } else {
                numerosImpar++;
            }
        }
        
        scanner.close();

        System.out.println("Total de números pares: " + numerosPar);
        System.out.println("Total de números ímpares: " + numerosImpar);

	}

}

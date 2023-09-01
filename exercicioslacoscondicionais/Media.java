package exercicioslacoscondicionais;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int numero;
	        int soma = 0;
	        int contador = 0;

	        do {
	            System.out.print("Digite um número inteiro (0 para sair): ");
	            numero = scanner.nextInt();

	            if (numero > 0) {
	                soma += numero;
	                contador++;
	            }
	        } while (numero != 0);

	        if (contador > 0) {
	            System.out.println("A soma dos números positivos é: " + soma);
	        } else {
	            System.out.println("Nenhum número positivo foi digitado.");
	        }

	        scanner.close();
	}

}

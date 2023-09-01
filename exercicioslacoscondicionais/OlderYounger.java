package exercicioslacoscondicionais;

import java.util.Scanner;

public class OlderYounger {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int menorQue21 = 0;
		        int maiorQue50 = 0;
		        int contador = 0;
		        int age;

		        while (contador < 10) {
		            
		            System.out.print("Digite uma idade: ");
		            age = scanner.nextInt();

		            if (age < 21) {
		                menorQue21++;
		            }

		            if (age > 50) {
		                maiorQue50++;
		            }
		            contador++;
		        }
               scanner.close();
		        System.out.println("Total de pessoas menores de 21 anos: " + menorQue21);
		        System.out.println("Total de pessoas maiores de 50 anos: " + maiorQue50);

	}

}

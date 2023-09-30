package Q1_05_NumerosPrimos;

import java.util.Scanner;

/*
 * Crie um programa que receba um valor inteiro informado pelo usuário e determine se esse
 * valor é um número primo. Observe que os números primos são aqueles que são divisíveis
 * apenas por eles próprios e por 1.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\n+--------------------------+");
        System.out.println("|       NÚMERO PRIMO       |");
        System.out.println("+--------------------------+");

        Scanner input = new Scanner(System.in);
        int numero;
        boolean primo = true;

        do {
            System.out.print("Digite um número (> 1): ");
            numero = input.nextInt();
        } while (numero <= 1);

        input.close();

        // Entra no bloco if se o número não for 2 ou 3
        if (numero > 3) {
            // Verificação para números pares e múltiplos de 3
            if (numero % 2 == 0 || numero % 3 == 0) {
                primo = false;
            } else {
                // Verificação para números ímpares e não múltiplos de 3
                // (5, 7, 11, 13, 17, 19, 23, 29, 31, 37...)
                for (int i = 3; i < numero; i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }
        }

        if (primo) {
            System.out.println("É um número primo");
        } else {
            System.out.println("Não é um número primo");
        }

        System.out.println("----------------------------");
    }
}

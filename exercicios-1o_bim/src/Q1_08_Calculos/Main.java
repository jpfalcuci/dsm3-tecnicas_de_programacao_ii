package Q1_08_Calculos;

import java.util.ArrayList;
import java.util.List;

/* Sejam as amostras de tamanho n=5, X={2,7,4,3,2} e Y={1,2,3,6,5}
 * realize os seguintes cálculos, conforme:
 *
 * a. Soma de Xj tal que j=1 até 5
 * b. Soma de Xj * Yj tal que j=1 até 5
 * c. Soma de Xj * Yj^2 tal que j=2 até 4, + 3
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\n+----------------------------+");
        System.out.println("|          CÁLCULOS          |");
        System.out.println("+----------------------------+");

        List<Integer> x = new ArrayList<>(List.of(2, 7, 4, 3, 2));
        List<Integer> y = new ArrayList<>(List.of(1, 2, 3, 6, 5));

        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        // a. Soma de Xj tal que j=1 até 5
        int somaX = 0;
        for (int i = 0; i < x.size(); i++) {
            somaX += x.get(i);
        }
        System.out.println("Soma de Xj tal que j=1 até 5: " + somaX);

        // b. Soma de Xj * Yj tal que j=1 até 5
        int somaXY = 0;
        for (int i = 0; i < x.size(); i++) {
            somaXY += x.get(i) * y.get(i);
        }
        System.out.println("Soma de Xj * Yj tal que j=1 até 5: " + somaXY);

        // c. Soma de Xj * Yj^2 tal que j=2 até 4, + 3
        int somaXY2 = 0;
        for (int i = 1; i < x.size() - 1; i++) {
            somaXY2 += x.get(i) * Math.pow(y.get(i), 2);
        }
        somaXY2 += 3;
        System.out.println("Soma de Xj * Yj^2 tal que j=2 até 4, + 3: " + somaXY2);
        System.out.println("------------------------------");
    }
}

package primosapp;

import java.util.Scanner;
import org.me.numprimos.Primos;

public class PrimosApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        Primos primos_count = new Primos();
        int num_primos = primos_count.contaPrimos(n1, n2);
        System.out.println("Há " + num_primos + " números primos entre " + n1 + " e " + n2 + " .");
    }  
}

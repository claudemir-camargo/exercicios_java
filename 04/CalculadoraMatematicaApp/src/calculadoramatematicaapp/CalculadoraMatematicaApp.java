package calculadoramatematicaapp;

import java.util.Scanner;
import org.me.calculadoramatematica.CalculadoraMatematica;

public class CalculadoraMatematicaApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraMatematica calculadora = new CalculadoraMatematica();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Soma: " + calculadora.soma(num1, num2));
        System.out.println("Subtração: " + calculadora.subtracao(num1, num2));
        System.out.println("Multiplicação: " + calculadora.multiplicacao(num1, num2));
        System.out.printf("Radiciação (raiz quadrada) de " + num1 + ": %.2f%n", calculadora.radiciacao(num1));
        System.out.println("Fatorial de " + (int) num1 + ": " + calculadora.fatorial((int) num1));
    } 
}

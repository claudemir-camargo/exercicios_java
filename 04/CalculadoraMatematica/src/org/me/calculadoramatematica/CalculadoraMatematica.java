/*
4 – Criar um programa que exiba o resultado das operações soma, subtração, multiplicação,
radiciação e fatorial com o uso de objetos e métodos. Para o cálculo do fatorial, procure usar
métodos recursivos.

*/
package org.me.calculadoramatematica;

public class CalculadoraMatematica {
    public double soma(double a, double b) {
        return a + b;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double radiciacao(double a) {
        return Math.sqrt(a);
    }

    public int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}

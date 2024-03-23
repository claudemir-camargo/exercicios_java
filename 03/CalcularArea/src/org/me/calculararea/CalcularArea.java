/*
3 – Utilizando o recurso de sobrecarga de métodos, crie um programa com uma Classe que
contenha um método chamado “calcular( )”. O comportamento deste método muda de acordo
com o parâmetro informado:
- Retorna a área do círculo caso receba um valor do tipo double;
- Retorna a área do quadrado caso receba dois valores do tipo double;
- Retorna o perímetro de um triângulo caso receba três valores do tipo int;
- Retorna a área de um triângulo caso receba um valor do tipo int e outro valor do tipo double;
- Retorna a área de um triângulo caso receba 3 vetores com pares ordenados (coordenadas
cartesianas x e y)
- Retorna o texto “Uso incorreto” caso receba uma cadeia de caracteres (string).
 */
package org.me.calculararea;

public class CalcularArea {
    public double calcular(double raio) {
        return Math.PI * raio * raio;
    }

    public double calcular(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public int calcular(int lado1, int lado2, int lado3) {
        return lado1 + lado2 + lado3;
    }

    public double calcular(int base, double altura) {
        return 0.5 * base * altura;
    }

    public double calcular(int[] x, int[] y) {
        return Math.abs((x[0] * (y[1] - y[2]) + x[1] * (y[2] - y[0]) + x[2] * (y[0] - y[1])) / 2.0);
    }

    public String calcular(String texto) {
        return "Uso incorreto";
    }
}

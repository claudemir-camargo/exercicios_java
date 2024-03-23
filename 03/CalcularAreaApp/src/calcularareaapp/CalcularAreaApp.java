/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularareaapp;

import org.me.calculararea.CalcularArea;

public class CalcularAreaApp {

    public static void main(String[] args) {
        CalcularArea calculadora = new CalcularArea();
        
        double areaCirculo = calculadora.calcular(5.0);
        System.out.printf("Área do círculo: %.2f%n", areaCirculo);

        double areaQuadrado = calculadora.calcular(4.0, 4.0);
        System.out.println("Área do quadrado: " + areaQuadrado);

        int perimetroTriangulo = calculadora.calcular(3, 4, 5);
        System.out.println("Perímetro do triângulo: " + perimetroTriangulo);

        double areaTriangulo = calculadora.calcular(6, 3.0);
        System.out.println("Área do triângulo: " + areaTriangulo);

        int[] x = {1, 3, 5};
        int[] y = {2, 4, 6};
        double areaTrianguloCoordenadas = calculadora.calcular(x, y);
        System.out.println("Área do triângulo com coordenadas cartesianas: " + areaTrianguloCoordenadas);

        String usoIncorreto = calculadora.calcular("Olá, Mundo!");
        System.out.println(usoIncorreto);
        }
    }

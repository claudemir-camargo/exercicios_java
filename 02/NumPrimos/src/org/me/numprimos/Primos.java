/*
2 – Criar um programa com Classes e Objetos que tenha um método chamado “contaPrimos( )”.
Este método recebe como parâmetro dois números inteiros positivos, sendo o primeiro menor do
que o segundo. O retorno do método será a quantidade de números primos encontrados do
primeiro ao segundo valor informado.
Ex: (‘obj’ é um objeto qualquer a escolha do aluno)
x = obj.contaPrimos(5, 20) → x terá o valor 6, já que de 5 até 20 existem seis números primos
 */
package org.me.numprimos;

public class Primos {
    public boolean Primo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int contaPrimos(int start, int end) {
        int count = 0;
        for (int num = start; num <= end; num++) {
            if (Primo(num)) {
                count++;
            }
        }
        return count;
    }
}


/*
6 – Adaptar o exercício de validação de CPF da lista 01 em um formato Orientado a Objetos e
incluindo validação por RegEX.
 */
package org.me.validadorcpf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorCpf {
    private static final String REGEX_CPF = "^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2})|(\\d{11})$";

    public static boolean isCPF(String cpf) {
        String cpfNumerico = cpf.replaceAll("[^0-9]", "");

        Pattern pattern = Pattern.compile(REGEX_CPF);
        Matcher matcher = pattern.matcher(cpfNumerico);
        if (!matcher.matches()) {
            return false;
        }

        int[] digitos = new int[11];
        for (int i = 0; i < 11; i++) {
            digitos[i] = Integer.parseInt(cpfNumerico.substring(i, i + 1));
        }

        int soma1 = 0;
        for (int i = 0; i < 9; i++) {
            soma1 += digitos[i] * (10 - i);
        }
        int d1 = (soma1 * 10) % 11;
        if (d1 != digitos[9]) {
            return false;
        }

        int soma2 = 0;
        for (int i = 0; i < 10; i++) {
            soma2 += digitos[i] * (11 - i);
        }
        int d2 = (soma2 * 10) % 11;
        if (d2 != digitos[10]) {
            return false;
        }

        return true;
    }

    public static void imprimeCPF(String cpf) {
        String cpfFormatado = cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        System.out.println("CPF formatado: " + cpfFormatado);
    }
}

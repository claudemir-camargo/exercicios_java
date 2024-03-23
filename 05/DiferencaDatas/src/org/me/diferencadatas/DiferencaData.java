/*
5 – Criar um programa que receba duas datas e exiba o número de dias de diferença entre elas.
Resolver utilizando Classes e objetos, passando as datas como parâmetros. Verificar na
linguagem escolhida se há um método, função ou API específica para datas
 */
package org.me.diferencadatas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DiferencaData {
    public long calcularDiferencaEmDias(LocalDate data1, LocalDate data2) {
        return ChronoUnit.DAYS.between(data1, data2);
    }
}

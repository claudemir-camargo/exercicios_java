package diferencadataapp;

import java.time.LocalDate;
import java.util.Scanner;
import org.me.diferencadatas.DiferencaData;

public class DiferencaDataApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DiferencaData calculadora = new DiferencaData();

        System.out.print("Digite a primeira data (formato: Ano-Mês-Dia): ");
        String data1Str = scanner.next();
        LocalDate data1 = LocalDate.parse(data1Str);

        System.out.print("Digite a segunda data (formato: Ano-Mês-Dia): ");
        String data2Str = scanner.next();
        LocalDate data2 = LocalDate.parse(data2Str);

        long diferencaDias = calculadora.calcularDiferencaEmDias(data1, data2);
        System.out.println("Diferença em dias: " + Math.abs(diferencaDias));
    }
    
}

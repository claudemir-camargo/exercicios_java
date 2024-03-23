package validadorcpfapp;

import java.util.Scanner;
import org.me.validadorcpf.ValidadorCpf;

public class ValidadorCpfApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        if (ValidadorCpf.isCPF(cpf)) {
            System.out.println("CPF válido.");
            ValidadorCpf.imprimeCPF(cpf);
        } else {
            System.out.println("CPF inválido.");
        }
    }
    
}

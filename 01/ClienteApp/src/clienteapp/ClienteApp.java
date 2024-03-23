/*
 1 – Criar um programa de cadastro de Clientes com nome, endereço, Cep e CPF. Utilizar os
recursos de Classes e objetos. Encapsular todos os atributos para que possam ser alterados e
lidos apenas utilizando métodos de acesso. Para cada cliente informado, exibir os dados na tela
ao final da inserção de dados. Realizar a validação dos dados usando RegEX.
 */
package clienteapp;
import org.me.cadclientes.Cliente;

public class ClienteApp {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "Rua A, 123", 12345, 987654321);
        cliente1.exibirDadosCliente();
    }
}
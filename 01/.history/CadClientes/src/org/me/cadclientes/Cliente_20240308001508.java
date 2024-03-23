/*
 1 – Criar um programa de cadastro de Clientes com nome, endereço, Cep e CPF. Utilizar os
recursos de Classes e objetos. Encapsular todos os atributos para que possam ser alterados e
lidos apenas utilizando métodos de acesso. Para cada cliente informado, exibir os dados na tela
ao final da inserção de dados. Realizar a validação dos dados usando RegEX.
 */
package org.me.cadclientes;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Cliente {
    private String nome;
    private String endereco;
    private int cep;
    private int cpf;

    public Cliente(String nome, String endereco, int cep, int cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (validarNome(nome)) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido. Deve conter apenas letras e espaços.");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        if (validarCep(cep)) {
            this.cep = cep;
        } else {
            System.out.println("CEP inválido. Deve conter exatamente 5 dígitos.");
        }
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        if (validarCpf(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido. Deve conter exatamente 11 dígitos.");
        }
    }

    public void exibirDadosCliente() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("CEP: " + cep);
        System.out.println("CPF: " + cpf);
    }

    private boolean validarNome(String nome) {
        String regex = "^[A-Za-z\\s]+$";
        return nome.matches(regex);
    }

    private boolean validarCep(int cep) {
        String regex = "^\\d{5}$";
        return String.valueOf(cep).matches(regex);
    }

    private boolean validarCpf(int cpf) {
        String regex = "^\\d{11}$";
        return String.valueOf(cpf).matches(regex);
    }
}
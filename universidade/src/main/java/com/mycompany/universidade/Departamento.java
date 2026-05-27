/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade;

/**
 *
 * @author Luan yudi
 */
public class Departamento {
    private String codigo;
    private String nome;
    private Funcionario[] funcionarios;
    private int contFunc;

    public Departamento(String codigo, String nome, int capacidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.funcionarios = new Funcionario[capacidade];
        this.contFunc = 0;
    }

    public void adicionarFuncionario(Funcionario f) {
        if (contFunc < funcionarios.length) {
            funcionarios[contFunc++] = f;
        } else {
            System.out.println("Capacidade maxima atingida no departamento " + nome);
        }
    }

    public Funcionario[] getFuncionarios() {
        Funcionario[] copia = new Funcionario[contFunc];
        for (int i = 0; i < contFunc; i++) {
            copia[i] = funcionarios[i];
        }
        return copia;
    }

    public double calcularTotalSalarios() {
        double total = 0;
        for (int i = 0; i < contFunc; i++) {
            total += funcionarios[i].calcularSalario();
        }
        return total;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}



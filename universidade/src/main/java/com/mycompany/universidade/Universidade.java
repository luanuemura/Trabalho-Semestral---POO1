/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade;

/**
 *
 * @author Luan yudi
 */
public class Universidade {
    private String nome;
    private Departamento[] departamentos;
    private int contDep;

    public Universidade(String nome, int capacidade) {
        this.nome = nome;
        this.departamentos = new Departamento[capacidade];
        this.contDep = 0;
    }

    public void adicionarDepartamento(Departamento d) {
        if (contDep < departamentos.length) {
            departamentos[contDep++] = d;
        } else {
            System.out.println("Capacidade maxima de departamentos atingida em " + nome);
        }
    }
    
    public Departamento[] getDepartamentos() {
        Departamento[] copia = new Departamento[contDep];
        for (int i = 0; i < contDep; i++) {
            copia[i] = departamentos[i];
        }
        return copia;
    }

    public int getContDep() {
        return contDep;
    }

    public String getNome() {
        return nome;
    }
}

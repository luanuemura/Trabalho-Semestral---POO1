/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade;

/**
 *
 * @author Luan yudi
 */
abstract class Docente extends Funcionario {
    protected String titulacao;
    
    public Docente(String codigo, String nome, double salarioBase, String nivel, String titulacao){
        super(codigo, nome, salarioBase, nivel);    
        this.titulacao = titulacao;
    }
    
    public abstract double calcularSalario();

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}

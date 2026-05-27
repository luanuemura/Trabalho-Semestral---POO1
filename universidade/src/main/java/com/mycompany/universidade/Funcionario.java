/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade;

/**
 *
 * @author Luan yudi
 */
public abstract class Funcionario {
    protected final String codigo;
    protected String nome;
    protected double salarioBase;
    protected String nivel;
    
    public Funcionario(String codigo, String nome, double salarioBase, String nivel){
        this.codigo = codigo;
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.nivel = nivel;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSalario(){
        return salarioBase;
    }
    
    public void setSalario(double salarioBase){
        if(salarioBase >= 0)
            this.salarioBase = salarioBase;
        else 
            System.out.println("Salario nao pode ser negativo");
    }
    
    public void exibir() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.printf("Salario: R$ %.2f\n", calcularSalario());
    }
    
    public String getNivel(){
        return nivel;
    }
    
    public void setNivel(String nivel){
        this.nivel = nivel;
    }
    
    public abstract double calcularSalario();
}

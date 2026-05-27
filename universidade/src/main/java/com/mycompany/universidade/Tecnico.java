/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade;

/**
 *
 * @author Luan yudi
 */
public class Tecnico extends Funcionario {
    protected String funcao;
    
    public Tecnico (String codigo, String nome, double salarioBase, String nivel, String funcao){
        super(codigo, nome, salarioBase, nivel);
        this.funcao = funcao;
    }
    
    @Override
    public double calcularSalario(){
        double adicional = switch(nivel){
            case "T1" -> Constantes.ADICIONAL_T1;
            case "T2" -> Constantes.ADICIONAL_T2;
            default -> throw new IllegalArgumentException("Nivel invalido: " + nivel);
        };
        return salarioBase * (1 + adicional);
    }
    
    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Funcao: " + funcao);
        System.out.println("Tipo: Tecnico");
    }
    
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}

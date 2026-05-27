/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade;

/**
 *
 * @author Luan yudi
 */
public class Substituto extends Docente{
    protected int cargaH;
    
    public Substituto(String codigo, String nome, double salarioBase, String nivel, String titulacao, int cargaH){
        super(codigo, nome, salarioBase, nivel, titulacao);
        this.cargaH = cargaH;
    }
    
    @Override
    public double calcularSalario(){
        double adicional = switch(nivel){
            case "S1" -> Constantes.ADICIONAL_S1;
            case "S2" -> Constantes.ADICIONAL_S2;
            default -> throw new IllegalArgumentException("Nivel invalido: " + nivel);
        };
        return salarioBase * (1 + adicional);
    }
    
    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Carga Horaria: " + cargaH);
        System.out.println("Tipo: Docente Substituto");
    }

    public int getCargaH() {
        return cargaH;
    }

    public void setCargaH(int cargaH) {
        this.cargaH = cargaH;
    }
    
    
}

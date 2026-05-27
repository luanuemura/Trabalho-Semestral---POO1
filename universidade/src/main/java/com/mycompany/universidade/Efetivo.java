/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade;

/**
 *
 * @author Luan yudi
 */
public class Efetivo extends Docente{
    protected String area;
    
    public Efetivo(String codigo, String nome, double salarioBase, String nivel, String titulacao, String area){
        super(codigo, nome, salarioBase, nivel, titulacao);
        this.area = area;
    }
    
    @Override
    public double calcularSalario(){
        double adicional = switch(nivel){
            case "D1" -> Constantes.ADICIONAL_D1;
            case "D2" -> Constantes.ADICIONAL_D2;
            case "D3" -> Constantes.ADICIONAL_D2;
            default -> throw new IllegalArgumentException("Nivel invalido: " + nivel);
        };
        return salarioBase * (1 + adicional + Constantes.ACRESCIMO_EFETIVO);
    }
    
    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Area: " + area);
        System.out.println("Tipo: Docente Efetivo");
    }


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
}

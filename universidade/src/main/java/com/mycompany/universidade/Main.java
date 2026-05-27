/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
// teste para ver se os metodos estao funcionandos
package com.mycompany.universidade;

/**
 *
 * @author Luan yudi
 */
public class Main {

    public static void main(String[] args) {
         // Criando universidade com capacidade para 5 departamentos
        Universidade unesp = new Universidade("UNESP", 5);
        ControladorUniversidade ctrl = new ControladorUniversidade(unesp);

        Departamento dcc = new Departamento("D01", "Ciência da Computação", 10);
        Departamento dmat = new Departamento("D02", "Matemática", 10);

        unesp.adicionarDepartamento(dcc);
        unesp.adicionarDepartamento(dmat);

        Tecnico t1 = new Tecnico("T001", "João", 3000, "T1", "Laboratório");
        Tecnico t2 = new Tecnico("T002", "Ana", 3200, "T2", "Secretário");

        Efetivo e1 = new Efetivo("E001", "Carlos", 5000, "D1", "Doutorado", "Exatas");
        Efetivo e2 = new Efetivo("E002", "Fernanda", 5500, "D3", "Livre-Docente", "Humanas");

        Substituto s1 = new Substituto("S001", "Bruna", 4000, "S2", "Mestrado", 24);

        dcc.adicionarFuncionario(t1);
        dcc.adicionarFuncionario(e1);
        dcc.adicionarFuncionario(s1);

        dmat.adicionarFuncionario(t2);
        dmat.adicionarFuncionario(e2);

        ctrl.exibirRelatorioGeral();
        ctrl.exibirResumoDepartamentos();
        ctrl.exibirDepartamentosComGastoEntre(5000, 20000);
        ctrl.exibirFuncionariosComSalarioEntre(3500, 7000);
        ctrl.exibirTodosFuncionarios();
        ctrl.exibirTodosTecnicos();
        ctrl.exibirTodosDocentes();
        ctrl.exibirTodosEfetivos();
        ctrl.exibirTodosSubstitutos();
        ctrl.exibirInfoDepartamentoPorCodigo("D01");
        ctrl.buscarFuncionarioPorCodigo("E002");
        ctrl.buscarFuncionarioPorNome("Ana");
    }
}

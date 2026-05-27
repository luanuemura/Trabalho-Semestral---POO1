package com.mycompany.universidade;

public class ControladorUniversidade {
    private Universidade universidade;

    public ControladorUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    private String formatarFuncionario(Funcionario f) {
        StringBuilder sb = new StringBuilder();
        sb.append("Código: ").append(f.getCodigo()).append("\n");
        sb.append("Nome: ").append(f.getNome()).append("\n");
        sb.append("Salário: R$ ").append(String.format("%.2f", f.calcularSalario())).append("\n");
        return sb.toString();
    }

    public String exibirRelatorioGeral() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Relatório Geral ===\n");
        for (Departamento d : universidade.getDepartamentos()) {
            sb.append("Departamento: ").append(d.getNome()).append("\n");
            for (Funcionario f : d.getFuncionarios()) {
                sb.append(formatarFuncionario(f)).append("---\n");
            }
            sb.append(String.format("Total gasto: R$ %.2f\n\n", d.calcularTotalSalarios()));
        }
        return sb.toString();
    }

    public String exibirResumoDepartamentos() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Resumo dos Departamentos ===\n");
        for (Departamento d : universidade.getDepartamentos()) {
            sb.append("Departamento: ").append(d.getNome()).append("\n");
            sb.append("Quantidade de Funcionários: ").append(d.getFuncionarios().length).append("\n");
            sb.append(String.format("Gasto total: R$ %.2f\n\n", d.calcularTotalSalarios()));
        }
        return sb.toString();
    }

    public String exibirDepartamentosComGastoEntre(double ini, double fim) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("=== Departamentos com gasto entre R$ %.2f e R$ %.2f ===\n", ini, fim));
        for (Departamento d : universidade.getDepartamentos()) {
            double total = d.calcularTotalSalarios();
            if (total >= ini && total <= fim) {
                sb.append("Departamento: ").append(d.getNome()).append("\n");
                sb.append(String.format("Gasto: R$ %.2f\n\n", total));
            }
        }
        return sb.toString();
    }

    public String exibirFuncionariosComSalarioEntre(double ini, double fim) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("=== Funcionários com salário entre R$ %.2f e R$ %.2f ===\n", ini, fim));
        for (Departamento d : universidade.getDepartamentos()) {
            for (Funcionario f : d.getFuncionarios()) {
                double salario = f.calcularSalario();
                if (salario >= ini && salario <= fim) {
                    sb.append(formatarFuncionario(f)).append("---\n");
                }
            }
        }
        return sb.toString();
    }

    public String exibirTodosFuncionarios() {
        StringBuilder sb = new StringBuilder("=== Todos os Funcionários ===\n");
        for (Departamento d : universidade.getDepartamentos()) {
            for (Funcionario f : d.getFuncionarios()) {
                sb.append(formatarFuncionario(f)).append("---\n");
            }
        }
        return sb.toString();
    }

    public String exibirTodosTecnicos() {
        StringBuilder sb = new StringBuilder("=== Técnicos ===\n");
        for (Departamento d : universidade.getDepartamentos()) {
            for (Funcionario f : d.getFuncionarios()) {
                if (f instanceof Tecnico) {
                    sb.append(formatarFuncionario(f)).append("---\n");
                }
            }
        }
        return sb.toString();
    }

    public String exibirTodosDocentes() {
        StringBuilder sb = new StringBuilder("=== Docentes ===\n");
        for (Departamento d : universidade.getDepartamentos()) {
            for (Funcionario f : d.getFuncionarios()) {
                if (f instanceof Docente) {
                    sb.append(formatarFuncionario(f)).append("---\n");
                }
            }
        }
        return sb.toString();
    }

    public String exibirTodosEfetivos() {
        StringBuilder sb = new StringBuilder("=== Docentes Efetivos ===\n");
        for (Departamento d : universidade.getDepartamentos()) {
            for (Funcionario f : d.getFuncionarios()) {
                if (f instanceof Efetivo) {
                    sb.append(formatarFuncionario(f)).append("---\n");
                }
            }
        }
        return sb.toString();
    }

    public String exibirTodosSubstitutos() {
        StringBuilder sb = new StringBuilder("=== Docentes Substitutos ===\n");
        for (Departamento d : universidade.getDepartamentos()) {
            for (Funcionario f : d.getFuncionarios()) {
                if (f instanceof Substituto) {
                    sb.append(formatarFuncionario(f)).append("---\n");
                }
            }
        }
        return sb.toString();
    }

    public String exibirInfoDepartamentoPorCodigo(String codigo) {
        for (Departamento d : universidade.getDepartamentos()) {
            if (d.getCodigo().equalsIgnoreCase(codigo)) {
                StringBuilder sb = new StringBuilder();
                sb.append("=== Informações do Departamento: ").append(d.getNome()).append(" ===\n");
                for (Funcionario f : d.getFuncionarios()) {
                    sb.append(formatarFuncionario(f)).append("---\n");
                }
                sb.append(String.format("Total gasto: R$ %.2f\n", d.calcularTotalSalarios()));
                return sb.toString();
            }
        }
        return "Departamento não encontrado.";
    }

    public String buscarFuncionarioPorCodigo(String codigo) {
        for (Departamento d : universidade.getDepartamentos()) {
            for (Funcionario f : d.getFuncionarios()) {
                if (f.getCodigo().equalsIgnoreCase(codigo)) {
                    return formatarFuncionario(f);
                }
            }
        }
        return "Funcionário não encontrado.";
    }

    public String buscarFuncionarioPorNome(String nome) {
        for (Departamento d : universidade.getDepartamentos()) {
            for (Funcionario f : d.getFuncionarios()) {
                if (f.getNome().equalsIgnoreCase(nome)) {
                    return formatarFuncionario(f);
                }
            }
        }
        return "Funcionário não encontrado.";
    }
}

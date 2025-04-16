package ex8.sistemaFuncionarios;

public class Funcionario {
    protected String nome;
    protected double salarioBase;


    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }


    public double calcularSalario() {
        return salarioBase;
    }


    public void exibirSalario() {
        System.out.println(nome + " - Salário Final: R$ " + String.format("%.2f", calcularSalario()));
    }
}

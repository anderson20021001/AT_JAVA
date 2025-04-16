package ex8.sistemaFuncionarios;

public class sistemaFuncionarios {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Carlos Silva", 5000);
        Funcionario estagiario = new Estagiario("Ana Souza", 2000);


        System.out.println("=== Folha de Pagamento ===");
        gerente.exibirSalario();
        estagiario.exibirSalario();
    }
}

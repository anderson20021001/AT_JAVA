package ex8.contaBancaria;

public class ContaBancaria {
    private String titular;
    private double saldo;


    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }


    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Método para sacar dinheiro (se houver saldo suficiente)
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    // Método para exibir o saldo atual
    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo Atual: R$ " + String.format("%.2f", saldo));
    }
}

package ex6.gerenciadorAlunos;

public class Aluno {
    private String nome;
    private String matricula;
    private double nota1, nota2, nota3;

    // Construtor
    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Método para calcular a média das notas
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    // Método para verificar se o aluno foi aprovado
    public void verificarAprovacao() {
        double media = calcularMedia();
        System.out.println("Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Média Final: " + String.format("%.2f", media));

        if (media >= 7) {
            System.out.println("Situação: Aprovado ✅");
        } else {
            System.out.println("Situação: Reprovado ❌");
        }
    }
}

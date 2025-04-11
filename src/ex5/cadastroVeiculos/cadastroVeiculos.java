package ex5.cadastroVeiculos;

public class cadastroVeiculos {
    public static void main(String[] args) {

        Veiculo carro1 = new Veiculo("ABC-1234", "Toyota Corolla", 2020, 25000);
        Veiculo carro2 = new Veiculo("XYZ-5678", "Honda Civic", 2018, 45000);


        System.out.println("Detalhes dos Veículos:");
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();


        System.out.println("Registrando viagens...");
        carro1.registrarViagem(500);
        carro2.registrarViagem(1200);


        System.out.println("\nDetalhes após viagens:");
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }
}

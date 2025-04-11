package ex9.registroCompras;

public class RegistroCompras {
    private String produto;
    private int quantidade;
    private double precoUnitario;


    public RegistroCompras(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }


    public String exibirCompra() {
        double total = quantidade * precoUnitario;
        return String.format("Produto: %s | Quantidade: %d | Preço Unitário: R$ %.2f | Total: R$ %.2f",
                produto, quantidade, precoUnitario, total);
    }

    // Método para salvar os dados em formato adequado
    public String salvarCompra() {
        return produto + ";" + quantidade + ";" + precoUnitario;
    }
}

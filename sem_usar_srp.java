// Classe que faz várias coisas, violando o SRP
class Pedido {
    private double valor;

    public Pedido(double valor) {
        this.valor = valor;
    }

    public double calcularTotal() {
        return valor;
    }

    // Violação do SRP: processar pagamento está fora da responsabilidade de um pedido
    public void processarPagamento(String metodoPagamento) {
        System.out.println("Processando pagamento de " + calcularTotal() + " usando " + metodoPagamento);
    }

    // Violação do SRP: gerar recibo está fora da responsabilidade de um pedido
    public void gerarRecibo() {
        System.out.println("Recibo gerado para o pedido de valor total: " + calcularTotal());
    }
}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(150.0);
        pedido.processarPagamento("Cartão de Crédito");
        pedido.gerarRecibo();
    }
}

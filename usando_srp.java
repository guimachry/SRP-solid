// Classe responsável por representar um pedido
class Pedido {
    private double valor;

    public Pedido(double valor) {
        this.valor = valor;
    }

    // Responsabilidade única: calcular o total do pedido
    public double calcularTotal() {
        return valor;
    }
}

// Classe responsável por processar pagamentos
class ProcessadorPagamento {
    // Responsabilidade única: processar o pagamento de um pedido
    public void processar(Pedido pedido, String metodoPagamento) {
        double total = pedido.calcularTotal();
        System.out.println("Processando pagamento de " + total + " usando " + metodoPagamento);
    }
}

// Classe responsável por gerar recibos
class GeradorRecibo {
    // Responsabilidade única: gerar o recibo de um pedido
    public void gerarRecibo(Pedido pedido) {
        System.out.println("Recibo gerado para o pedido de valor total: " + pedido.calcularTotal());
    }
}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(150.0);
        ProcessadorPagamento pagamento = new ProcessadorPagamento();
        GeradorRecibo recibo = new GeradorRecibo();

        pagamento.processar(pedido, "Cartão de Crédito");
        recibo.gerarRecibo(pedido);
    }
}

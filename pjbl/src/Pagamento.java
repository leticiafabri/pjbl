

import java.time.LocalDate;

public class Pagamento {
    protected double valor;
    protected LocalDate dataPagamento;
    protected String metodoPagamento;

    public Pagamento(double valor, LocalDate dataPagamento, String metodoPagamento){
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.metodoPagamento = metodoPagamento;
    }


    public void pagarCredito(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com sucesso no crédito.");
    }

    public void pagarDebito(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com sucesso no débito.");
    }
}
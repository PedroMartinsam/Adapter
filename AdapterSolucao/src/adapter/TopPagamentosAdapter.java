package adapter;

import Pagamento.TopPagamentos;

public class TopPagamentosAdapter implements Gateway{

    public TopPagamentos topPagamentos;
    public String numeroCartao;
    public String cvv;
    public double valor;
    public int parcelas;

    public TopPagamentosAdapter(){
        this.topPagamentos = new TopPagamentos();
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public void setCVV(String cvv) {
        this.cvv = cvv;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public boolean validarCartao(){
        return true;
    }

    public boolean realizarPagamento(){
        this.topPagamentos.setValorTotal(this.valor);
        this.topPagamentos.setCartao(this.numeroCartao, this.cvv);
        this.topPagamentos.setQuantidadeParcelas(this.parcelas);
        return this.topPagamentos.realizarPagamento();
    }
}

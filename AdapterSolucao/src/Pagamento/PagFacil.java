
package Pagamento;


public class PagFacil {
    
    final double taxaPagamento = 0.4;
    final double juroMensal = 0.5;

    public double valor;
    public int parcelas;
    public String numeroCartao;
    public String cvv;

    public void setValor(double valor)
    {
        this.valor = valor;
    }

    public void setParcelas(int parcelas)
    {
        this.parcelas = parcelas;
    }

    public void setNumeroCartao(String numeroCartao)
    {
        this.numeroCartao = numeroCartao;
    }

    public void setCVV(String cvv)
    {
        this.cvv = cvv;
    }

    public boolean validarCartao()
    {
        return true;
    }

    public boolean realizarPagamento()
    {
        return true;
    }
    
}

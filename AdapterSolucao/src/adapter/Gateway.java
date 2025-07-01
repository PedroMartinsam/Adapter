package adapter;

public interface Gateway {

    public void setValor(double valor);
    public void setParcelas(int parcelas);
    public void setNumeroCartao(String numeroCartao);
    public void setCVV(String cvv);
    public boolean validarCartao();
    public boolean realizarPagamento();
}

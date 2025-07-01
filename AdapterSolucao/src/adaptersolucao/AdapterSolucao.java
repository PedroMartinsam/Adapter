
package adaptersolucao ;

import Cobranca.Cobranca;
import adapter.PagFacilAdapter;
import adapter.TopPagamentosAdapter;

public class AdapterSolucao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Configura a Cobranca");

        Cobranca cobranca = new Cobranca();
        cobranca.setValor(100);
        cobranca.setNumeroCartao("999999999999");
        cobranca.setCVV("163");

        cobranca.setGateway(new PagFacilAdapter());
        cobranca.validarCartao();
        cobranca.realizarPagamento();

        cobranca.setGateway(new TopPagamentosAdapter());
        cobranca.validarCartao();
        cobranca.realizarPagamento();
    }
    
}

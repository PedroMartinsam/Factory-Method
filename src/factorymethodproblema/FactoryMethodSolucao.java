package factorymethodproblema;

import boletobancario.Banco;
import boletobancario.bancocaixa.BancoCaixa;
import boletobancario.bancodobrasil.BancoDoBrasil;


public class FactoryMethodSolucao {

    
    public static void main(String[] args) {

        System.out.println("=== Banco Caixa ===");
        Banco bancoCaixa = new BancoCaixa();
        bancoCaixa.gerarBoleto(10, 100);
        bancoCaixa.gerarBoleto(30, 100);
        bancoCaixa.gerarBoleto(60, 100);

        System.out.println("\n=== Banco do Brasil ===");
        Banco bancoDoBrasil = new BancoDoBrasil();
        bancoDoBrasil.gerarBoleto(10, 100);
        bancoDoBrasil.gerarBoleto(30, 100);
        bancoDoBrasil.gerarBoleto(60, 100);
    }
}

package boletobancario.bancodobrasil;

import boletobancario.Banco;
import boletobancario.Boleto;
import boletobancario.bancodobrasil.BancoDoBrasilBoleto10Dias;
import boletobancario.bancodobrasil.BancoDoBrasilBoleto30Dias;
import boletobancario.bancodobrasil.BancoDoBrasilBoleto60Dias;


public class BancoDoBrasil extends Banco {

    @Override
    protected Boleto criarBoleto(int vencimento, double valor) {
        Boleto boleto = null;

        switch (vencimento) {
            case 10:
                boleto = new BancoDoBrasilBoleto10Dias(valor);
                break;
            case 30:
                boleto = new BancoDoBrasilBoleto30Dias(valor);
                break;
            case 60:
                boleto = new BancoDoBrasilBoleto60Dias(valor);
                break;
            default:
                System.out.println("Vencimento indisponível");
        }

        return boleto;
    }
}


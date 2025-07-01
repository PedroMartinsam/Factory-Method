package boletobancario.bancocaixa;

import boletobancario.Banco;
import boletobancario.Boleto;
import boletobancario.bancocaixa.BancoCaixaBoleto10Dias;
import boletobancario.bancocaixa.BancoCaixaBoleto30Dias;
import boletobancario.bancocaixa.BancoCaixaBoleto60Dias;


public class BancoCaixa extends Banco {

    @Override
    protected Boleto criarBoleto(int vencimento, double valor) {
        Boleto boleto = null;

        switch (vencimento) {
            case 10:
                boleto = new BancoCaixaBoleto10Dias(valor);
                break;
            case 30:
                boleto = new BancoCaixaBoleto30Dias(valor);
                break;
            case 60:
                boleto = new BancoCaixaBoleto60Dias(valor);
                break;
            default:
                System.out.println("Vencimento indisponível");
        }

        return boleto;
    }
}

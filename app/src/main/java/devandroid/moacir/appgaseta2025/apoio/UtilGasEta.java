package devandroid.moacir.appgaseta2025.apoio;

public class UtilGasEta {
    public static void metodoNaoEstatico(){}


    public static String calcularMelhorOPcao(double gasolina, double etanol){

        double precoIdeal = gasolina * 0.70;
        String mensagemDeRetorno;

        if(etanol<=precoIdeal){
            mensagemDeRetorno = "Abastecer com Etanol";
        }
        else{
            mensagemDeRetorno = "Abastecer com Gasolina";
        }

        return mensagemDeRetorno;

    }
    public static String mensagem(){

        return "Qualquer mensagem";

    }}
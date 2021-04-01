package TiposDeAnuncio;

public class Texto extends Anuncio {

    public Texto(String descricao, int diasDuracaoAnuncio) {
        super(descricao, diasDuracaoAnuncio);
    }

    @Override
    public double calculaPreco() {
        double precoTotal = 1.5;
        if(diasDuracaoAnuncio > 3){
            precoTotal += (diasDuracaoAnuncio - 3) * 1.5;
        }
        return precoTotal;
    }
}

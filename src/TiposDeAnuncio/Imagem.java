package TiposDeAnuncio;

public class Imagem extends Anuncio {

    public Imagem(String descricao, int diasDuracaoAnuncio) {
        super(descricao, diasDuracaoAnuncio);
    }

    @Override
    public double calculaPreco() {
        double precoTotal = 2;

        if (diasDuracaoAnuncio > 2) {
            precoTotal += (this.diasDuracaoAnuncio - 2) * 1.5;
        }

        return precoTotal;


    }
}

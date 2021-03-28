package TiposDeAnuncio;

public class Imagem extends Anuncio {

    public Imagem(String descricao, int diasDuracaoAnuncio) {
        super(descricao, diasDuracaoAnuncio);
    }

    @Override
    public double calculaPreco() {
        return 2.0;
    }
}

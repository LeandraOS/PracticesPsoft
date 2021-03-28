package TiposDeAnuncio;

public class Video extends Anuncio {

    public Video(String descricao, int diasDuracaoAnuncio) {
        super(descricao, diasDuracaoAnuncio);
    }

    @Override
    public double calculaPreco() {
        return diasDuracaoAnuncio * 3.0;
    }

    @Override
    public int calculaPontos(){
        int pontos = 1;
        if (diasDuracaoAnuncio > 1){
            pontos++;
        }
        return pontos;
    }
}

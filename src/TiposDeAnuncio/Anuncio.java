package TiposDeAnuncio;

public abstract class Anuncio {

    protected String descricao;
    protected int diasDuracaoAnuncio;

    public Anuncio(String descricao, int diasDuracao) {
        this.descricao = descricao;
        this.diasDuracaoAnuncio = diasDuracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDiasDuracao() {
        return diasDuracaoAnuncio;
    }

    public void setDiasDuracao(int diasDuracao) {
        this.diasDuracaoAnuncio = diasDuracao;
    }
    public int calculaPontos(){
        return 1;
    }

    public abstract double calculaPreco();


}

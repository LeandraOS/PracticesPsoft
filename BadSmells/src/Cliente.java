import TiposDeAnuncio.Anuncio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private int totalPontos;
    private List<Anuncio> listaDeAnuncios;

    public Cliente(String nome) {
        this.nome = nome;
        this.totalPontos = 0;
        this.listaDeAnuncios = new ArrayList();
    }

    public void addAnuncio(Anuncio anuncio) {
        listaDeAnuncios.add(anuncio);
    }

    public String getNome() {
        return nome;
    }
    public String imprimeInformacoesCliente(double precoTotal){
        String informacoes = "Historico de compras de anuncios por " + getNome() + "\n" +
                getTipohistoricoAnuncios() +
                "Total devido é " + String.valueOf(precoTotal) + "\n" +
                "Voce ganhou " + String.valueOf(totalPontos) + " pontos";

        return informacoes;
    }

    public double calculaPrecoTotal(){
        double precoTotal = 0;

        for(Anuncio anuncio: listaDeAnuncios){
            precoTotal  += anuncio.calculaPreco();
            totalPontos += anuncio.calculaPontos();
        }
        return precoTotal;
    }

    public String historico() {
        double precoTotal = this.calculaPrecoTotal();
        return imprimeInformacoesCliente(precoTotal);

    }

    private String getTipohistoricoAnuncios(){
        String tipoAnuncio = "";
        for(Anuncio anuncio : listaDeAnuncios){
            tipoAnuncio += anuncio.getDescricao() + "\n";
        }
        return tipoAnuncio;
    }
}
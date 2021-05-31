import TiposDeAnuncio.Anuncio;
import TiposDeAnuncio.Imagem;
import TiposDeAnuncio.Texto;
import TiposDeAnuncio.Video;

public class Main {
    public static void main(String[] args) {
        Anuncio anuncioVideo = new Video("Este é o anuncio de Video", 3);
        Cliente clienteVideo = new Cliente("Leandra");
        clienteVideo.addAnuncio(anuncioVideo);
        String saídaVideo = clienteVideo.historico();
        System.out.println(saídaVideo + "\n");

        Anuncio anuncioImagem = new Imagem("Este é o anuncio de Imagem", 2);
        Cliente clienteImagem = new Cliente("Leandra");
        clienteImagem.addAnuncio(anuncioImagem);
        String saídaImagem = clienteImagem.historico();
        System.out.println(saídaImagem + "\n");

        Anuncio anuncioTexto = new Texto("Este é o anuncio de Texto", 3);
        Cliente cliente = new Cliente("Leandra");
        cliente.addAnuncio(anuncioTexto);
        String saídaTexto = cliente.historico();
        System.out.println(saídaTexto);
    }
}

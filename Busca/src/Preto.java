import java.util.List;

public class Preto extends Cor{

    @Override
    public void assumiu(No no, List<No> list) {
        list.add(no);
    }
}

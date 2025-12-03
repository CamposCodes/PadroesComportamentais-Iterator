package padroescomportamentais.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Estoque implements Iterable<Produto> {

    private List<Produto> produtos = new ArrayList<Produto>();

    public Estoque(Produto... produtos) {
        this.produtos = Arrays.asList(produtos);
    }

    @Override
    public Iterator<Produto> iterator() {
        return produtos.iterator();
    }

}

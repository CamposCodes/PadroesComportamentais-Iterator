package padroescomportamentais.iterator;

import java.util.Iterator;

public class GerenciadorEstoque {

    public static Integer contarProdutosDisponiveis(Estoque estoque) {
        int quantidade = 0;
        for (Produto produto : estoque) {
            if (produto.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarBebidasDisponiveis(Estoque estoque) {
        int quantidade = 0;
        for (Produto produto : estoque) {
            if (produto.getTipo() == TipoProduto.BEBIDA && produto.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarComidasDisponiveis(Estoque estoque) {
        int quantidade = 0;
        for (Produto produto : estoque) {
            if (produto.getTipo() == TipoProduto.COMIDA && produto.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalProdutosEstoque(Estoque estoque) {
        int quantidade = 0;
        for (Iterator p = estoque.iterator(); p.hasNext(); ) {
            quantidade++;
            p.next();
        }
        return quantidade;
    }

    public static Integer contarTotalPorTipo(Estoque estoque, TipoProduto tipo) {
        int quantidade = 0;
        for (Produto produto : estoque) {
            if (produto.getTipo() == tipo) {
                quantidade++;
            }
        }
        return quantidade;
    }

}

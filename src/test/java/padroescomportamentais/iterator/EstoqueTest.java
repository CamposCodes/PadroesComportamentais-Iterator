package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstoqueTest {

    @Test
    void deveContarProdutosDisponiveis() {
        Estoque estoque = new Estoque(
                new Produto("Café", true, TipoProduto.BEBIDA),
                new Produto("Suco", true, TipoProduto.BEBIDA),
                new Produto("Bolo", false, TipoProduto.COMIDA),
                new Produto("Sanduíche", true, TipoProduto.COMIDA)
        );
        assertEquals(3, GerenciadorEstoque.contarProdutosDisponiveis(estoque));
    }

    @Test
    void deveContarBebidasDisponiveis() {
        Estoque estoque = new Estoque(
                new Produto("Café", true, TipoProduto.BEBIDA),
                new Produto("Suco", false, TipoProduto.BEBIDA),
                new Produto("Bolo", true, TipoProduto.COMIDA),
                new Produto("Sanduíche", true, TipoProduto.COMIDA)
        );
        assertEquals(1, GerenciadorEstoque.contarBebidasDisponiveis(estoque));
    }

    @Test
    void deveContarComidasDisponiveis() {
        Estoque estoque = new Estoque(
                new Produto("Café", true, TipoProduto.BEBIDA),
                new Produto("Suco", true, TipoProduto.BEBIDA),
                new Produto("Bolo", true, TipoProduto.COMIDA),
                new Produto("Sanduíche", false, TipoProduto.COMIDA)
        );
        assertEquals(1, GerenciadorEstoque.contarComidasDisponiveis(estoque));
    }

    @Test
    void deveContarTotalProdutosEstoque() {
        Estoque estoque = new Estoque(
                new Produto("Café", true, TipoProduto.BEBIDA),
                new Produto("Suco", false, TipoProduto.BEBIDA),
                new Produto("Bolo", true, TipoProduto.COMIDA),
                new Produto("Sanduíche", false, TipoProduto.COMIDA)
        );
        assertEquals(4, GerenciadorEstoque.contarTotalProdutosEstoque(estoque));
    }

    @Test
    void deveContarTotalPorTipo() {
        Estoque estoque = new Estoque(
                new Produto("Café", true, TipoProduto.BEBIDA),
                new Produto("Suco", false, TipoProduto.BEBIDA),
                new Produto("Bolo", true, TipoProduto.COMIDA),
                new Produto("Sanduíche", false, TipoProduto.COMIDA)
        );
        assertEquals(2, GerenciadorEstoque.contarTotalPorTipo(estoque, TipoProduto.BEBIDA));
        assertEquals(2, GerenciadorEstoque.contarTotalPorTipo(estoque, TipoProduto.COMIDA));
    }

}

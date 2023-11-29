package strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveretornarPrecoCheio() {
        Produto produto = new Produto();
        produto.PrecoCheio(100.0f);
        assertEquals(100.0f, produto.getPreco());
    }

    @Test
    void deveretornarPrecoVarejo() {
        Produto produto = new Produto();
        produto.PrecoDescontoVarejo(100.0f);
        assertEquals(80.0f, produto.getPreco());
    }

    @Test
    void deveretornarPrecoAtacado() {
        Produto produto = new Produto();
        produto.PrecoDescontoAtacado(100.0f);
        assertEquals(50.0f, produto.getPreco());
    }

}

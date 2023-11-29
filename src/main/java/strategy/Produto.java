package strategy;

public class Produto {

    private float preco;

    public float getPreco() {
        return preco;
    }

    public void PrecoCheio(float preco) {
        Calculadora calculadora = new Calculadora(preco);
        this.preco = calculadora.calcular(new OperacaoPrecoCheio());
    }

    public void PrecoDescontoVarejo(float preco) {
        Calculadora calculadora = new Calculadora(preco);
        this.preco = calculadora.calcular(new OperacaoPrecoVarejo());
    }

    public void PrecoDescontoAtacado(float preco) {
        Calculadora calculadora = new Calculadora(preco);
        this.preco = calculadora.calcular(new OperacaoPrecoAtacado());
    }
}

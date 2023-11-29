package strategy;

public class OperacaoPrecoVarejo implements Operacao {
    public float calcular(float valor1) {
        return (float) (valor1 * 0.8);
    }
}

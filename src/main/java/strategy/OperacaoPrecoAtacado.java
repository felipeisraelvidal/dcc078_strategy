package strategy;

public class OperacaoPrecoAtacado implements Operacao {
    public float calcular(float valor1) {
        return (float) (valor1 *0.5);
    }
}

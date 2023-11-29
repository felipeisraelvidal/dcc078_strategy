package strategy;

public class Calculadora {

    private float valor1;

    public Calculadora(float valor1) {
        this.valor1 = valor1;
    }

    public float calcular(Operacao operacao) {
        return operacao.calcular(valor1);
    }
}

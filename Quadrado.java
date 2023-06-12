public class Quadrado {
    private double tamanhoLado;

    public void mudarValorLado(double novoValor) {
        tamanhoLado = novoValor;
    }

    public double retornarValorLado() {
        return tamanhoLado;
    }

    public double calcularArea() {
        return tamanhoLado * tamanhoLado;
    }
}

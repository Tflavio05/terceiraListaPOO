
public class Calculadora {

    public double adicao(double a, double b) {
        return a + b;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double divisao(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultadoSoma = calculadora.adicao(5, 3);
        double resultadoSubtracao = calculadora.subtracao(8, 2);
        double resultadoMultiplicacao = calculadora.multiplicacao(4, 6);
        double resultadoDivisao = calculadora.divisao(10, 2);

        System.out.println("Resultado da adição: " + resultadoSoma);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
        System.out.println("Resultado da divisão: " + resultadoDivisao);
    }
}



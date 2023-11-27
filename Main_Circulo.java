//Crie uma classe chamada "Círculo" com um construtor que recebe o raio como
// parâmetro e um método para calcular a área do círculo.
// Em seguida, crie um objeto "meuCirculo" e calcule a área.

public class Main_Circulo {
    public static void main(String[] args) {
        Circulos meuCirculo = new Circulos(5.0);
        double area = meuCirculo.calcularArea();
        System.out.println("A área do círculo é: " + area);

    }
}

import java.io.IOException;
import java.util.Scanner;

public class desafioTriangulo {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double maior;
        double soma;
        boolean triangulo;

        if (A + B > C && A + C > B && B + C > A) {
            triangulo = true;
        } else {
            triangulo = false;
        }

        soma = A + B + C;
        maior = ((A + B) * C) / 2;

        if (triangulo) {
            System.out.print("Perimetro = " + String.format("%.1f", soma));
        } else {
            System.out.print("Area = " + String.format("%.1f", maior));
        }

        leitor.close();
    }

}
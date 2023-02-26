import java.util.*;

public class desafioQuitandaDoSeuZe {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

        int totalKg = morangos + macas;
        double totalCliente = 0;

        if (morangos <= 5) {
            totalCliente += morangos * 2.5;
        } else {
            totalCliente += morangos * 2.2;
        }

        if (macas <= 5) {
            totalCliente += macas * 1.8;
        } else {
            totalCliente += macas * 1.5;
        }

        if (totalKg > 8 || totalCliente > 25) {
            totalCliente *= 0.9;
        }

        System.out.println(totalCliente);

        input.close();
    }
}
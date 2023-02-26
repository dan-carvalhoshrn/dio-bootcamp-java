import java.util.*;

public class desafioDragao {

    public static void main(String[] args) {
        int casos, poderDeLuta;

        Scanner ler = new Scanner(System.in);

        casos = ler.nextInt();

        for (int i = 0; i < casos; i++) {
            poderDeLuta = ler.nextInt();

            if (poderDeLuta <= 8000) {
                System.out.println("Inseto!");
            } else {
                System.out.println("Mais de 8000!");
            }
        }

        ler.close();
    }
}
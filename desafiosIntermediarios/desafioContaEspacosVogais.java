import java.util.Scanner;

public class desafioContaEspacosVogais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase = input.nextLine().toLowerCase();
        input.close();
        
        int espacos = 0;
        int vogais = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == ' ') {
                espacos++;
            } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++;
            }
        }
        
        System.out.println("Espacos em branco: " + espacos + " Vogais: " + vogais);
        
        input.close();
    }
}
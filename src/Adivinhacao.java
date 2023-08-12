import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int chute = 0;
        int tentativas = 7;

        for (int i = 0; i < tentativas; i++) {
            System.out.println("Tente adivinhar o número (entre 0 e 100): ");
            chute = leitura.nextInt();
            if(chute == numeroAleatorio) {
                System.out.println("Você acertou!");
                break;
            } else {
                if(chute > numeroAleatorio) {
                    System.out.println("Não acertou. O número é menor. Tentativa %d de %d".formatted(i+1, tentativas));
                } else {
                    System.out.println("Não acertou. O número é maior. Tentativa %d de %d".formatted(i+1, tentativas));
                }
            }
        }

        System.out.println("O número secreto é " + numeroAleatorio);
    }
}

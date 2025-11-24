import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        /*
        * ESTRUTURA DO WHILE
        * Menos utilizada, mas em alguns casos se encaixa melhor ao problema
        * O bloco de comandos executa pelo menos uma vez,
        * pois a condição é verificada no final
        *
        * do {
        *   comando 1
        *   comando 2
        * } while (condição);
        * */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", fahrenheit);
            System.out.println("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }
}

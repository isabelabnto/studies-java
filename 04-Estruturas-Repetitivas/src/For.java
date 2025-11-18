import java.util.Scanner;

public class For {
    public static void main(String[] args){
        /*
        * ESTRUTURA FOR:
        * - Estrutura de controle que repete um bloco de comandos
        * para um certo intervalo de valores
        * QUANDO USAR ESTRUTURA FOR
        * - Quando se sabe a quantidade de repetições, ou o intevalo de valores
        *
        * IMPORTANTE:
        * A estrutura for é ótima para se fazer uma repetição
        * basead em CONTAGEM:
        * for (int i = 0; i < 5; i++) {
        *       System.out.println("Valor de i: " + i);
        * }
        * resultado:
        * Valor de i: 0 <--- (
        * Valor de i: 1
        * Valor de i: 2
        * Valor de i: 3
        * Valor de i: 4
        * */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int soma = 0;
        for(int i = 0; i < n; i++){
            int x = scan.nextInt();
            soma += x;
        }

        System.out.println(soma);

        System.out.println("=========================");
        System.out.println("CONTAGEM");
        for (int i = 0; i <= 4; i++) {
            System.out.println("Valor de i: " + i);
        }

        System.out.println("=========================");
        System.out.println("CONTAGEM REGRESSIVA");
        for (int i = 4; i >= 0; i--){
            System.out.println("Valor de i: " + i);
        }

        scan.close();
    }
}

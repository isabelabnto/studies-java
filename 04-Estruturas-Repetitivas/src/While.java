import java.util.Scanner;

public class While {
    public static void main(String[] args){
        /*
        * ESTRUTURA REPETITIVA "enquanto"
        * É uma estrutura de cont role que repete
        * um bloco de comandos enquanto uma
        * condição for verdadeira
        *
        * Quando usar: quando não se sabe previamente
        * a quantidade de repetições que será realizada
        * */

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int somaNumeros = 0;

        while (x != 0){
            x = scan.nextInt();
            somaNumeros += x;
        }
        System.out.println(somaNumeros);
        scan.close();
    }
}

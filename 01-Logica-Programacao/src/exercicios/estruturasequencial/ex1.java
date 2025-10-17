/*
* Faça um programa para ler dois valores inteiros,
* e depois mostrar na tela a soma desses números com uma
* mensagem explicativa, conforme exemplos.
* */

package exercicios.estruturasequencial;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int soma = numero1 + numero2;

        System.out.printf("SOMA = %d", soma);

        scan.close();
    }
}

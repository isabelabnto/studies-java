/*
* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
*/
package exercicios.estruturarepetitiva;
import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int senha = 2002;
        int tentativa = scan.nextInt();

        while(tentativa != senha){
            System.out.println("Senha invalida");
            tentativa = scan.nextInt();
        }
        System.out.println("Acesso permitido");
        scan.close();
    }
}

/*
* Faça um programa para ler o valor do raio de um círculo,
* e depois mostrar o valor da área deste círculo com quatro
* casas decimais conforme exemplos.
* */

package exercicios.estruturasequencial;
import java.util.Scanner;
import java.util.Locale;

public class ex2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double raioDoCirculo, areaCirculo;

        System.out.print("Digite o valor do Raio do círculo: ");
        raioDoCirculo = scan.nextDouble();

        areaCirculo = Math.PI * Math.pow(raioDoCirculo, 2);
        System.out.printf("A=%.4f%n", areaCirculo);
        scan.close();
    }
}

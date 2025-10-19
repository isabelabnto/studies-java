/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/

package exercicios.estruturasequencial;
import java.util.Scanner;
import java.util.Locale;

public class ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigoPeca1, codigoPeca2, quantidadePecas1, quantidadePecas2;
        double valorUnitarioPeca1, valorUnitarioPeca2;

        codigoPeca1 = sc.nextInt();
        quantidadePecas1 = sc.nextInt();
        valorUnitarioPeca1 = sc.nextDouble();

        codigoPeca2 = sc.nextInt();
        quantidadePecas2 = sc.nextInt();
        valorUnitarioPeca2 = sc.nextDouble();

        double valorTotalPagar = (valorUnitarioPeca1 * quantidadePecas1) + (valorUnitarioPeca2 * quantidadePecas2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotalPagar);

        sc.close();
    }
}

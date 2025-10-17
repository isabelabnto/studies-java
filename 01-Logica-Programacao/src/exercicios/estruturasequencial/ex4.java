/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais. */

package exercicios.estruturasequencial;
import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario;
        double horasTrabalhadas, valorHoraTrabalhada, salarioFuncionario;

        System.out.print("Digite o número do funcionário: ");
        numeroFuncionario = sc.nextInt();
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = sc.nextDouble();
        System.out.print("Digite o valor que o funcionário recebe por hora: ");
        valorHoraTrabalhada = sc.nextDouble();

        salarioFuncionario = horasTrabalhadas * valorHoraTrabalhada;
        System.out.printf("NUMBER: %d\nSALARY: U$ %.2f", numeroFuncionario, salarioFuncionario);
        sc.close();
    }
}

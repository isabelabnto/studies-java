/*
* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
* */

package exercicios.estruturarepetitiva;
import java.util.Scanner;

public class while3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int qtdClientesGasolina = 0, qtdClientesDiesel = 0, qtdClientesAlcool = 0, codigoSelecionado = 0;


        while(true){

            if(codigoSelecionado != 4){
                System.out.println("OPÇÕES DE COMBUSTÍVEL:");
                System.out.printf("1.Álcool%n 2.Gasolina%n 3.Diesel%n 4.Fim%n");
                codigoSelecionado = scan.nextInt();
            }
            if (codigoSelecionado == 4){
                System.out.printf("MUITO OBRIGADO%n");
                System.out.printf("QUANTIDADE CLIENTES GASOLINA = %d%n", qtdClientesGasolina);
                System.out.printf("QUANTIDADE CLIENTES DIESEL = %d%n", qtdClientesDiesel);
                System.out.printf("QUANTIDADE CLIENTES ÁLCOOL = %d%n", qtdClientesAlcool);
                break;
            } else if (codigoSelecionado == 1) {
                qtdClientesAlcool++;
            } else if (codigoSelecionado == 2) {
                qtdClientesGasolina++;
            } else if (codigoSelecionado == 3) {
                qtdClientesDiesel++;
            }
            else {
                System.out.println("OPÇÃO NÃO DISPONIEL");
                System.out.println("OPÇÕES DE COMBUSTIVEL");
                System.out.printf("1.Álcool%n 2.Gasolina%n 3.Diesel%n 4.Fim%n");
                codigoSelecionado = scan.nextInt();
            }
        }
        scan.close();
    }
}

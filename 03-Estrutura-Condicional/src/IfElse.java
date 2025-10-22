import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        // ESTRUTURA CONDICIONAL é:
        /*
        * Uma estrutura de controle que permite definir que um
        * certo bloco de comandos somente será executado
        * dependendo de uma condição
        *
        * */

        int x = 5;


        if (x < 0) {
            System.out.println("Comando executado");
        }
        else {
            System.out.println("Comando dois");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas horas?");
        int horas = scan.nextInt();
        if (horas < 5) {
            System.out.println("Boa Madrugada");
        }
        else if (horas < 12) {
            System.out.println("Bom dia");
        }
        else if (horas < 18) {
            System.out.println("Boa tarde");
        }
        else {
            System.out.println("Boa noite");
        }
        scan.close();
    }
}

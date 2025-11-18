/*
*  Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
* */
package exercicios.estruturarepetitiva;
import java.util.Scanner;

public class while2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, y;
        x = scan.nextInt();
        y = scan.nextInt();
        while (true) {
            if(x == 0 || y == 0){
                break;
            }
            else if (x > 0 && y > 0) {
                System.out.println("primeiro quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro quadrante");
            } else {
                System.out.println("quarto quadrante");
            }
            x = scan.nextInt();
            y = scan.nextInt();
        }
        scan.close();
    }
}

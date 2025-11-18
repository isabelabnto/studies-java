/*
* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
* */

package exercicios.estruturarepetitiva;
import java.util.Scanner;

public class for1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        for(int i = 0; i < x; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
        scan.close();
    }
}

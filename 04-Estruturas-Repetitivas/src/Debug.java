import java.util.Scanner;
import java.util.Locale;

/*
* rodar programa passo a passo
* utilizando breakpoints
* */

public class Debug {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double largura = scan.nextDouble();
        double comprimento = scan.nextDouble();
        double metroQuadrado = scan.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);

        scan.close();
    }
}

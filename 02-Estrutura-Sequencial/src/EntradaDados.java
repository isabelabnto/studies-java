import java.util.Scanner;
import java.util.Locale;

public class EntradaDados {
    public static void main(String[] args) {
        /*
        Entrada de dados em java:
        Scanner - Objeto
        Scanner scan = new Scanner(Sysyem.in)
        import java.util.Scanner;
        scan.close() quando não for mais usar o objeto
        */
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        String teste;
        teste = scan.next();
        System.out.println("Teste: " + teste);

        char ch;
        ch = scan.next().charAt(0); // next().charAt(0) - ler char
        System.out.println("CH: " + ch);

        int x = scan.nextInt(); // nextInt() - ler numeros inteiros
        System.out.println("X: " + x);

        double y = scan.nextDouble(); // nextDouble - ler numeros de ponto flutuante (5
        System.out.println("Y: " + y);

        double teste2;
        int teste3, teste4;
        teste2 = scan.nextDouble();
        teste3 = scan.nextInt();
        teste4 = scan.nextInt();
        System.out.printf("Testes: %f, %d, %d", teste2, teste3, teste4);

        // Limpa buffer de leitura
        scan.nextLine();

        // Ler texto ate a quebra de linha
        String a, b, c;
        a = scan.nextLine();
        b = scan.nextLine();
        c = scan.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);



    }
}

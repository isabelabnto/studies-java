import java.util.Locale;

public class SaidaDados {

    public static void main(String[] args) {
        /*
        println --> quebra de linha
        print --> sem quebra de linha
        printf --> print com format

        Locale para definir qual padrão de linguagem:
        Locale.setDefault(Locale.US);
         */
        System.out.print("Ola Mundo - ");
        System.out.println("Hello World");

        /*
        Para usar o  format do java:
        */
        // formata para duas casas decimais e quebra linha:
        // %.2f // %n
        double x = 32.23435;
        System.out.printf("%.2f%n", x); // 32,23
        //Locale.setDefault(Locale.US); // define o Locale para US(padrão US)
        System.out.printf("%.4f%n", x); // 32.2344

        /*
        %f = ponto flutuante
        %d = inteiro
        %s = string
        %c = char
        %n = quebra de linha
        */

        // EXERCICIO FIXAÇÃO:

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.9013;

        System.out.println("Product:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which age is %.2f%n", product2, price2);
        System.out.printf("%nRecord: %d years old, code %d and gender %c%n", age, code, gender);
        System.out.printf("%nMeasure with decimal places: %f%n", measure);
        System.out.printf("Rouded (three decimal places: %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}

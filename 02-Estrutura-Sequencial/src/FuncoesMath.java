import java.util.Locale;

public class FuncoesMath {
    public static void main(String[] args) {
        /*
        * ALGUMAS FUNÇÔES MÁTEMATICAS EM JAVA
        * Math.sqrt(); - raiz quandrada
        * Math.pow(); - potência
        * Math.abs; - valor absoluto de um número
        * */
        Locale.setDefault(Locale.US);
        double x = 8.0;
        double raizQuadrada, potencia, valorAbsoluto;

        raizQuadrada = Math.sqrt(x);
        potencia = Math.pow(x, 2);
        valorAbsoluto = Math.abs(x);

        System.out.printf("Raiz quadrada de {%.2f} = %.2f %n", x, raizQuadrada);
        System.out.printf("Potencia de {%.2f} = %.2f %n", x, potencia);
        System.out.printf("Valor absoluto de {%.2f} = %.2f%n", x, valorAbsoluto);

        /* Fórmula de bhaskara */
        double a = 5;
        double b = 10;
        double c = 2;

        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("DELTA = %.2f%n", delta);
        System.out.printf("X1 = %.2f%n", x1);
        System.out.printf("X2 = %.2f%n", x2);
    }
}

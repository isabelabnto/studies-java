public class Ex1 {
    public static void main(String[] args) {
        //Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B.
        //A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o
        //valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados
        //nas variáveis.

        int A = 4;
        int B = 5;

        System.out.printf("Variavel A: %d %n", A);
        System.out.printf("Variavel B: %d %n", B);

        int C = A;
        A = B;
        B = C;

        System.out.printf("Variavel A: %d %n", A);
        System.out.printf("Variavel B: %d %n", B);

    }
}
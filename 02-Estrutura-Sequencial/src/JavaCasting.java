public class JavaCasting {
    // PROCESSAMENTO DE DADOS
    // Comando de atribuição
    // <variavel> = <expressao> (= lê-se "recebe")
    public static void main(String[] args) {
        // Casting
        // Casting: Conversão implicita dos valores
        // para fazer um casting, irei avisar para o compilador que quero o resultado de uma coisa como número double
        int a, b;
        double resultado;
        a = 5;
        b = 2;
        resultado = a / b;
        System.out.println(resultado); // Resultado sem Casting = 2.0
        resultado = (double) a /  b; // Fazendo Casting
        System.out.println(resultado); // Resultado com Casting 2.5

        // Converter o tipo de dado que a variavel receber
        double c;
        int d;
        c = 5.0;
        // d = c; // compilador vai dizer que não pode converter de double para int
        // para fazer essa conversão(tendo em mente que pode ter uma possivel perda de informação:
        d = (int) c;
    }
}

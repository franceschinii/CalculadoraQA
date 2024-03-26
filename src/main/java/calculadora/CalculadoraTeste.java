package calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        // Cenário de teste 1: Adição de dois valores
        int somar = calc.soma(3, 7);
        System.out.println("Caso 1: " + somar);

        // Cenário de teste 2: Adição de dois valores com um sendo zero
        somar = calc.soma(3, 0);
        System.out.println("Caso 2: " + somar);

        // Cenário de teste 3: Adição de dois valores zero
        somar = calc.soma(0, 0);
        System.out.println("Caso 3: " + somar);

        // Cenário de teste 4: Adição de dois valores com um sendo negativo
        somar = calc.soma(3, -1);
        System.out.println("Caso 4: " + somar);

        // Cenário de teste 1: Subtração de dois valores
        int subtrair = calc.subtracao(3, 7);
        System.out.println("Caso 1: " + subtrair);

        // Cenário de teste 2: Subtração de dois valores com um sendo zero
        subtrair = calc.subtracao(3, 0);
        System.out.println("Caso 2: " + subtrair);

        // Cenário de teste 3: Subtração de dois valores zero
        subtrair = calc.subtracao(0, 0);
        System.out.println("Caso 3: " + subtrair);

        // Cenário de teste 4: Subtração de dois valores com um sendo negativo
        subtrair = calc.subtracao(3, -1);
        System.out.println("Caso 4: " + subtrair);

        // Cenário de teste 1: Multiplicação de dois valores
        double multiplicar = calc.multiplicacao(3, 7);
        System.out.println("Caso 1: " + multiplicar);

        // Cenário de teste 2: Multiplicação de dois valores com um sendo zero
        multiplicar = calc.multiplicacao(3, 0);
        System.out.println("Caso 2: " + multiplicar);

        // Cenário de teste 3: Multiplicação de dois valores zero
        multiplicar = calc.multiplicacao(0, 0);
        System.out.println("Caso 3: " + multiplicar);

        // Cenário de teste 4: Multiplicação de dois valores com um sendo negativo
        multiplicar = calc.multiplicacao(3, -1);
        System.out.println("Caso 4: " + multiplicar);

        // Cenário de teste 1: Divisão de dois valores
        double dividir = calc.divisao(3, 7);
        System.out.println("Caso 1: " + dividir);

        // Cenário de teste 2: Divisão de dois valores com um sendo zero
        dividir = calc.divisao(3, 0);
        System.out.println("Caso 2: " + dividir);

        // Cenário de teste 3: Divisão de dois valores zero
        dividir = calc.divisao(0, 0);
        System.out.println("Caso 3: " + dividir);

        // Cenário de teste 4: Divisão de dois valores com um sendo negativo
        dividir = calc.divisao(3, -1);
        System.out.println("Caso 4: " + dividir);
    }
}

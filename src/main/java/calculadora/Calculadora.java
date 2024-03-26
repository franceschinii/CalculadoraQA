package calculadora;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculadora {
    /**
     * Efetua a soma de dois números inteiros.
     *
     * @param num1 O primeiro número a ser somado.
     * @param num2 O segundo número a ser somado.
     * @return O resultado da operação de adição.
     */
    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Efetua a subtração entre dois números inteiros.
     *
     * @param minuendo O número do qual será subtraído.
     * @param subtraendo O número a ser subtraído.
     * @return O resultado da operação de subtração.
     */
    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Efetua a multiplicação de dois números decimais.
     *
     * @param multiplicando O primeiro número a ser multiplicado.
     * @param multiplicador O segundo número a ser multiplicado.
     * @return O resultado da operação de multiplicação.
     */
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Executa a divisão entre dois números decimais.
     *
     * @param dividendo O número que será dividido.
     * @param divisor O divisor.
     * @return O resultado da operação de divisão.
     */
    public double dividir(double num1, double num2) {
        return num1 / num2;
    }
}
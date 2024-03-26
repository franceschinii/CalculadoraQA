
    import main.java.calculadora
    import main.junit.jupiter.api.Assertions;
    import main.junit.jupiter.api.Test;

    /**
     * Classe de teste para a classe Calculadora, usando JUnit 5.
     * Testa os métodos da classe Calculadora em cenários diversos.
     * Este teste utiliza as anotações do JUnit 5.
     *
     * Autor: André de Lima Franceschini
     */
    public class JUnitCalculadoraTeste {
        Calculadora calc = new Calculadora();

        /**
         * Testa o método somar da classe Calculadora.
         * Verifica a soma de dois números inteiros em diferentes cenários.
         */
        @Test
        public void somarDoisNumeros() {
            int soma = calc.somar(10, 20);
            Assertions.assertEquals(30, soma);

            //Cenário de teste 2: Soma de dois valores sendo um zero
            soma = calc.somar(3, 0);
            Assertions.assertEquals(3, soma);

            //Cenário de teste 3: Soma de dois valores sendo ambos zero
            soma = calc.somar(0, 0);
            Assertions.assertEquals(0, soma);

            //Cenário de teste 4: Soma de dois valores sendo um negativo
            soma = calc.somar(3, -1);
            Assertions.assertEquals(2, soma);
        }

        /**
         * Testa o método subtrair da classe Calculadora.
         * Verifica a subtração de dois números inteiros em diferentes cenários.
         */
        @Test
        public void subtrairDoisNumeros() {
            int subtrair = calc.subtrair(10, 2);
            Assertions.assertEquals(8, subtrair);

            //Cenário de teste 1: Subtração de dois valores
            subtrair = calc.subtrair(3, 7);
            Assertions.assertEquals(-4, subtrair);

            //Cenário de teste 2: Subtração de dois valores sendo um zero
            subtrair = calc.subtrair(3, 0);
            Assertions.assertEquals(3, subtrair);

            //Cenário de teste 3: Subtração de dois valores sendo ambos zero
            subtrair = calc.subtrair(0, 0);
            Assertions.assertEquals(-0, subtrair);

            //Cenário de teste 4: Subtração de dois valores sendo um negativo
            subtrair = calc.subtrair(3, -1);
            Assertions.assertEquals(4, subtrair);
        }

        /**
         * Testa o método multiplicar da classe Calculadora.
         * Verifica a multiplicação de dois números inteiros em diferentes cenários.
         */
        @Test
        public void multiplicarDoisNumeros() {
            //Cenário de teste 1: Multiplicação de dois valores
            double multiplicacao = calc.multiplicar(3, 7);
            Assertions.assertEquals(21, multiplicacao);

            //Cenário de teste 2: Multiplicação de dois valores sendo um zero
            multiplicacao = calc.multiplicar(3, 0);
            Assertions.assertEquals(0, multiplicacao);

            //Cenário de teste 3: Multiplicação, ambos valores sendo zero
            multiplicacao = calc.multiplicar(0, 0);
            Assertions.assertEquals(0, multiplicacao);

            //Cenário de teste 4: Multiplicação de dois valores sendo um negativo
            multiplicacao = calc.multiplicar(3, -1);
            Assertions.assertEquals(-3, multiplicacao);
        }

        /**
         * Testa o método dividir da classe Calculadora.
         * Verifica a divisão de dois números em diferentes cenários.
         */
        @Test
        public void dividirDoisNumeros() {
            //Cenário de teste 1: Divisão de dois valores
            double divisao = calc.dividir(4, 2);
            Assertions.assertEquals(2, divisao);

            //Cenário de teste 2: Divisão por zero
            divisao = calc.dividir(3, 0);
            Assertions.assertEquals(Double.POSITIVE_INFINITY, divisao);

            //Cenário de teste 3: Divisão, ambos valores sendo zero
            divisao = calc.dividir(0, 0);
            Assertions.assertTrue(Double.isNaN(divisao));

            //Cenário de teste 4: Divisão de dois valores sendo um negativo
            divisao = calc.dividir(3, -1);
            Assertions.assertEquals(-3, divisao);
        }
    }
}

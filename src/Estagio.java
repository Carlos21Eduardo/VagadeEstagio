import java.util.Scanner;

public class Estagio {

    public static void main(String[] args) {
        // Exercício 1: Soma de variáveis com loop
        int INDICE = 13, SOMA = 0, K = 0;
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("Exercício 1: O valor da soma é: " + SOMA); // Resultado: 91

        // Exercício 2: Verificar se um número pertence à sequência de Fibonacci
        int num = 21; // Número pré-definido para verificar
        int a = 0, b = 1, temp;
        boolean pertence = false;

        // Verificando se o número pertence à sequência de Fibonacci
        if (num == 0 || num == 1) {
            pertence = true;
        } else {
            while (b <= num) {
                temp = b;
                b = a + b;
                a = temp;
                if (b == num) {
                    pertence = true;
                    break;
                }
            }
        }

        if (pertence) {
            System.out.println("Exercício 2: O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("Exercício 2: O número " + num + " não pertence à sequência de Fibonacci.");
        }

        // Exercício 3: Faturamento diário
        double[] faturamento = {1000.0, 2000.0, 0.0, 500.0, 3000.0, 1500.0, 0.0, 4000.0}; // Dados pré-definidos
        double menorFaturamento = Double.MAX_VALUE; // Inicializa como o maior valor possível
        double maiorFaturamento = Double.MIN_VALUE; // Inicializa como o menor valor possível
        double somaFaturamento = 0;
        int diasComFaturamento = 0;

        // Calculando menor, maior e soma do faturamento
        for (double valor : faturamento) {
            if (valor > 0) {
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }

        double mediaFaturamento = somaFaturamento / diasComFaturamento;
        int diasAcimaDaMedia = 0;
        // Contando dias acima da média
        for (double valor : faturamento) {
            if (valor > mediaFaturamento) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Exercício 3: Menor faturamento: " + menorFaturamento);
        System.out.println("Maior faturamento: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);

        // Exercício 4: Percentual de faturamento por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;

        System.out.println("Exercício 4: Percentual de SP: " + (sp / total) * 100 + "%");
        System.out.println("Percentual de RJ: " + (rj / total) * 100 + "%");
        System.out.println("Percentual de MG: " + (mg / total) * 100 + "%");
        System.out.println("Percentual de ES: " + (es / total) * 100 + "%");
        System.out.println("Percentual de Outros: " + (outros / total) * 100 + "%");

        // Exercício 5: Inverter uma string
        String str = "Estagio"; // String pré-definida para teste
        String invertida = "Estagio";

        // Invertendo a string sem usar funções prontas
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);
        }

        System.out.println("Exercício 5: String invertida: " + invertida);
    }
}
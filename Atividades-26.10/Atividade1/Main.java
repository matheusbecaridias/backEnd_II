import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Define o Locale para aceitar ponto decimal (ex: 2500.50)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        double[] salarios = new double[5];
        double soma = 0;
        double maiorSalario = Double.NEGATIVE_INFINITY;

        // 1. Cadastrar os salários dos 5 funcionários
        System.out.println("=== Cadastro de Salários ===");
        for (int i = 0; i < salarios.length; i++) {
            System.out.printf("Digite o salário do %dº funcionário: R$ ", i + 1);
            salarios[i] = scanner.nextDouble();
            soma += salarios[i];

            // Verifica e atualiza o maior salário
            if (salarios[i] > maiorSalario) {
                maiorSalario = salarios[i];
            }
        }

        // 2. Calcular a média salarial
        double media = soma / salarios.length;

        // 3. Contar quantos funcionários ganham acima da média
        int acimaDaMedia = 0;
        for (double salario : salarios) {
            if (salario > media) {
                acimaDaMedia++;
            }
        }

        // 4. Exibir todos os salários cadastrados com suas respectivas classificações
        System.out.println("\n=== Lista de Salários e Classificação ===");
        for (int i = 0; i < salarios.length; i++) {
            String classificacao;
            if (salarios[i] < 2000.0) {
                classificacao = "Salário baixo";
            } else if (salarios[i] <= 5000.0) {
                classificacao = "Salário médio";
            } else {
                classificacao = "Salário alto";
            }
            System.out.printf("Funcionário %d: R$ %.2f - %s%n", i + 1, salarios[i], classificacao);
        }

        // 5. Exibir estatísticas gerais (Média, Maior Salário e Acima da Média)
        System.out.println("\n=== Estatísticas ===");
        System.out.printf("Média salarial: R$ %.2f%n", media);
        System.out.printf("Maior salário: R$ %.2f%n", maiorSalario);
        System.out.println("Funcionários com salário acima da média: " + acimaDaMedia);

        scanner.close();
    }
}
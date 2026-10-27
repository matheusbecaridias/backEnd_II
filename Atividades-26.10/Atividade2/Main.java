import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaração de arrays para armazenar os dados de 4 alunos
        String[] nomes = new String[4];
        double[] medias = new double[4];
        String[] situacoes = new String[4];
        
        // Contadores para o resumo final
        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;
        
        // Coleta de dados e processamento
        for (int i = 0; i < 4; i++) {
            System.out.println("--- Cadastro do " + (i + 1) + "º Aluno ---");
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();
            
            System.out.print("Digite a 1ª nota: ");
            double nota1 = scanner.nextDouble();
            
            System.out.print("Digite a 2ª nota: ");
            double nota2 = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer do teclado
            
            // Cálculo da média
            medias[i] = (nota1 + nota2) / 2.0;
            
            // Verificação da situação do aluno
            if (medias[i] >= 70) {
                situacoes[i] = "Aprovado";
                aprovados++;
            } else if (medias[i] >= 50) {
                situacoes[i] = "Recuperação";
                recuperacao++;
            } else {
                situacoes[i] = "Reprovado";
                reprovados++;
            }
            System.out.println();
        }
        
        // Exibição dos resultados individuais
        System.out.println("========================================");
        System.out.println("         RELATÓRIO DE DESEMPENHO        ");
        System.out.println("========================================");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Aluno: %s | Média: %.2f | Situação: %s\n", 
                              nomes[i], medias[i], situacoes[i]);
        }
        
        // Exibição do resumo final
        System.out.println("========================================");
        System.out.println("             RESUMO GERAL               ");
        System.out.println("========================================");
        System.out.println("Alunos aprovados: " + aprovados);
        System.out.println("Alunos em recuperação: " + recuperacao);
        System.out.println("Alunos reprovados: " + reprovados);
        System.out.println("========================================");
        
        scanner.close();
    }
}

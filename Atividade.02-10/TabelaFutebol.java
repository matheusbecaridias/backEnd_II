public class TabelaFutebol {

    public static void main(String[] args) {
        // Dados do Time 1
        String time1 = "Flamengo";
        int jogos1 = 10;
        int vitorias1 = 7;
        int derrotas1 = 3;
        int saldo1 = 12;
        char categoria1 = 'A';
        boolean classificado1 = true;
        int pontos1 = vitorias1 * 3;

        // Dados do Time 2
        String time2 = "Palmeiras";
        int jogos2 = 10;
        int vitorias2 = 6;
        int derrotas2 = 4;
        int saldo2 = 8;
        char categoria2 = 'A';
        boolean classificado2 = true;
        int pontos2 = vitorias2 * 3;

        // Dados do Time 3
        String time3 = "São Paulo";
        int jogos3 = 10;
        int vitorias3 = 5;
        int derrotas3 = 5;
        int saldo3 = 2;
        char categoria3 = 'B';
        boolean classificado3 = false;
        int pontos3 = vitorias3 * 3;

        // Dados do Time 4
        String time4 = "Grêmio";
        int jogos4 = 10;
        int vitorias4 = 4;
        int derrotas4 = 6;
        int saldo4 = -3;
        char categoria4 = 'B';
        boolean classificado4 = false;
        int pontos4 = vitorias4 * 3;

        // Dados do Time 5
        String time5 = "Santos";
        int jogos5 = 10;
        int vitorias5 = 2;
        int derrotas5 = 8;
        int saldo5 = -10;
        char categoria5 = 'C';
        boolean classificado5 = false;
        int pontos5 = vitorias5 * 3;
        
                // Dados do Time 6
        String time6 = "Corinthians";
        int jogos5 = 10;
        int vitorias5 = 2;
        int derrotas5 = 8;
        int saldo5 = -10;
        char categoria5 = 'C';
        boolean classificado5 = false;
        int pontos5 = vitorias5 * 3;

        // Cabeçalho da Tabela
        System.out.printf("%-12s | %-5s | %-8s | %-8s | %-5s | %-6s | %-9s | %-12s%n",
                "Time", "Jogos", "Vitórias", "Derrotas", "Saldo", "Pontos", "Categoria", "Classificado");
        System.out.println("-----------------------------------------------------------------------------------------");

        // Exibição dos Times
        System.out.printf("%-12s | %-5d | %-8d | %-8d | %-5d | %-6d | %-9c | %-12b%n",
                time1, jogos1, vitorias1, derrotas1, saldo1, pontos1, categoria1, classificado1);
        System.out.printf("%-12s | %-5d | %-8d | %-8d | %-5d | %-6d | %-9c | %-12b%n",
                time2, jogos2, vitorias2, derrotas2, saldo2, pontos2, categoria2, classificado2);
        System.out.printf("%-12s | %-5d | %-8d | %-8d | %-5d | %-6d | %-9c | %-12b%n",
                time3, jogos3, vitorias3, derrotas3, saldo3, pontos3, categoria3, classificado3);
        System.out.printf("%-12s | %-5d | %-8d | %-8d | %-5d | %-6d | %-9c | %-12b%n",
                time4, jogos4, vitorias4, derrotas4, saldo4, pontos4, categoria4, classificado4);
        System.out.printf("%-12s | %-5d | %-8d | %-8d | %-5d | %-6d | %-9c | %-12b%n",
                time5, jogos5, vitorias5, derrotas5, saldo5, pontos5, categoria5, classificado5);
        System.out.printf("%-12s | %-5d | %-8d | %-8d | %-5d | %-6d | %-9c | %-12b%n",
                time6, jogos6, vitorias6, derrotas6, saldo6, pontos6, categoria6, classificado6);
    }
}

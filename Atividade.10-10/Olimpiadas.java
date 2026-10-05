public class Olimpiadas {
    public static void main(String[] args) {
        // Informações gerais da edição dos Jogos
        int anoEdicao = 2024;
        String cidadeSede = "Paris";
        
        System.out.println("Jogos Olímpicos - " + cidadeSede + " " + anoEdicao + "\n");
        System.out.println("País | Ouro | Prata | Bronze | Total | Top 10");
        System.out.println("--------------------------------------------------");

        // País 1 (Maior número de medalhas de ouro)
        String nomePais1 = "Estados Unidos";
        int ouro1 = 40;
        int prata1 = 44;
        int bronze1 = 42;
        boolean top10Pais1 = true;
        int total1 = ouro1 + prata1 + bronze1;
        System.out.println(nomePais1 + " | " + ouro1 + " | " + prata1 + " | " + bronze1 + " | " + total1 + " | " + top10Pais1);

        // País 2
        String nomePais2 = "China";
        int ouro2 = 40;
        int prata2 = 27;
        int bronze2 = 24;
        boolean top10Pais2 = true;
        int total2 = ouro2 + prata2 + bronze2;
        System.out.println(nomePais2 + " | " + ouro2 + " | " + prata2 + " | " + bronze2 + " | " + total2 + " | " + top10Pais2);

        // País 3
        String nomePais3 = "Japão";
        int ouro3 = 20;
        int prata3 = 12;
        int bronze3 = 13;
        boolean top10Pais3 = true;
        int total3 = ouro3 + prata3 + bronze3;
        System.out.println(nomePais3 + " | " + ouro3 + " | " + prata3 + " | " + bronze3 + " | " + total3 + " | " + top10Pais3);

        // País 4
        String nomePais4 = "Austrália";
        int ouro4 = 18;
        int prata4 = 19;
        int bronze4 = 16;
        boolean top10Pais4 = true;
        int total4 = ouro4 + prata4 + bronze4;
        System.out.println(nomePais4 + " | " + ouro4 + " | " + prata4 + " | " + bronze4 + " | " + total4 + " | " + top10Pais4);

        // País 5
        String nomePais5 = "França";
        int ouro5 = 16;
        int prata5 = 26;
        int bronze5 = 22;
        boolean top10Pais5 = true;
        int total5 = ouro5 + prata5 + bronze5;
        System.out.println(nomePais5 + " | " + ouro5 + " | " + prata5 + " | " + bronze5 + " | " + total5 + " | " + top10Pais5);

        // País 6
        String nomePais6 = "Holanda";
        int ouro6 = 15;
        int prata6 = 7;
        int bronze6 = 12;
        boolean top10Pais6 = true;
        int total6 = ouro6 + prata6 + bronze6;
        System.out.println(nomePais6 + " | " + ouro6 + " | " + prata6 + " | " + bronze6 + " | " + total6 + " | " + top10Pais6);
    }
}
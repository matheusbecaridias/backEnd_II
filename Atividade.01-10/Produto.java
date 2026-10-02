public class Produto {
    // Atributos privados (Encapsulamento)
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        setPreco(preco); // Utiliza o setter para aplicar a validação no construtor
        this.quantidade = quantidade;
    }

    // --- GETTERS E SETTERS ---

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Aviso: O preço não pode ser negativo. Valor mantido: R$ " + this.preco);
        } else {
            this.preco = preco;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // --- MÉTODOS DE NEGÓCIO ---

    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
            System.out.println(qtd + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("Quantidade inválida para adição.");
        }
    }

    public boolean vender(int qtd) {
        if (qtd <= this.quantidade) {
            this.quantidade -= qtd;
            System.out.println("Venda de " + qtd + " unidade(s) realizada com sucesso!");
            return true;
        } else {
            System.out.println("Venda recusada: Estoque insuficiente! (Disponível: " + this.quantidade + ", Solicitado: " + qtd + ")");
            return false;
        }
    }

    // --- MÉTODO MAIN PARA TESTES ---

    public static void main(String[] args) {
        // Criando o produto com estoque inicial de 5
        Produto p1 = new Produto("Notebook", 3500.00, 5);

        System.out.println("--- ESTADO INICIAL ---");
        System.out.println("Produto: " + p1.getNome() + " | Preço: R$ " + p1.getPreco() + " | Estoque: " + p1.getQuantidade());

        System.out.println("\n--- TESTE 1: Tentativa de atribuir preço negativo ---");
        p1.setPreco(-150.00); // Deve imprimir aviso e manter R$ 3500.00
        System.out.println("Preço atual: R$ " + p1.getPreco());

        System.out.println("\n--- TESTE 2: Venda permitida ---");
        p1.vender(3); // Deve ter sucesso (estoque passa a ser 2)
        System.out.println("Estoque atual: " + p1.getQuantidade());

        System.out.println("\n--- TESTE 3: Venda acima do estoque (Recusa) ---");
        boolean sucessoVenda = p1.vender(4); // Deve ser recusado (tentando vender 4 tendo apenas 2)
        System.out.println("A venda foi realizada? " + sucessoVenda);
        System.out.println("Estoque atual: " + p1.getQuantidade());

        System.out.println("\n--- TESTE 4: Adicionando estoque ---");
        p1.adicionarEstoque(10); // Estoque passa a ser 12
        System.out.println("Estoque atual: " + p1.getQuantidade());
    }
}
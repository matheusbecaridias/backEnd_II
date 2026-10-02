public class Funcionario {
    // Atributos privados
    private String nome;
    private double salario;

    // 1. Construtor vazio (padrão)
    public Funcionario() {
    }

    // 2. Construtor parametrizado
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para aumentar o salário com base na porcentagem passada
    public void aumentarSalario(double porcentagem) {
        if (porcentagem > 0) {
            this.salario = this.salario + this.salario * (porcentagem / 100);
            System.out.println("Salário de " + nome + " aumentado em " + porcentagem + "%. Novo salário: R$ " + this.salario);
        } else {
            System.out.println("Porcentagem de aumento inválida.");
        }
    }

    // Método para calcular o salário anual (considerando 13 meses pelo 13º salário)
    public double calcularSalarioAnual() {
        return this.salario * 13;
    }

    // Método main para testes
    public static void main(String[] args) {
        // Criando o primeiro funcionário usando o construtor parametrizado
        Funcionario f1 = new Funcionario("Carlos Silva", 3000.00);

        // Criando o segundo funcionário usando o construtor vazio e atribuindo valores via setters
        Funcionario f2 = new Funcionario();
        f2.setNome("Maria Oliveira");
        f2.setSalario(5000.00);

        System.out.println("=== DADOS INICIAIS DA FOLHA ===");
        System.out.println("Funcionário: " + f1.getNome() + " | Salário Mensal: R$ " + f1.getSalario() + " | Salário Anual: R$ " + f1.calcularSalarioAnual());
        System.out.println("Funcionário: " + f2.getNome() + " | Salário Mensal: R$ " + f2.getSalario() + " | Salário Anual: R$ " + f2.calcularSalarioAnual());

        System.out.println("\n=== APLICANDO AUMENTOS SALARIAIS ===");
        // Aplicando 10% de aumento para o primeiro funcionário
        f1.aumentarSalario(10);

        // Aplicando 15% de aumento para o segundo funcionário
        f2.aumentarSalario(15);

        System.out.println("\n=== NOVO SALÁRIO ANUAL ===");
        System.out.println("Salário Anual de " + f1.getNome() + ": R$ " + f1.calcularSalarioAnual());
        System.out.println("Salário Anual de " + f2.getNome() + ": R$ " + f2.calcularSalarioAnual());
    }
}
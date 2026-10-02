public class ContaCorrente {
    // Atributos privados (Encapsulamento)
    private String titular;
    private double saldo;

    // Construtor
    public ContaCorrente(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            System.out.println("Saldo inicial não pode ser negativo. Inicializado com 0.0");
            this.saldo = 0.0;
        }
    }

    // --- GETTERS E SETTERS ---

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // --- MÉTODOS DE OPERAÇÃO ---

    // Método para depositar valor na conta
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado na conta de " + titular);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Método para sacar valor (sem deixar o saldo negativo)
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado na conta de " + titular);
            return true;
        } else {
            System.out.println("Saque recusado na conta de " + titular + ": Saldo insuficiente ou valor inválido.");
            return false;
        }
    }

    // Método para transferir valor para outra conta
    // Utiliza os métodos sacar() do próprio objeto e depositar() no destino
    public boolean transferir(ContaCorrente destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso para " + destino.getTitular());
            return true;
        } else {
            System.out.println("Falha na transferência para " + destino.getTitular());
            return false;
        }
    }

    // --- MÉTODO MAIN PARA TESTE ---

    public static void main(String[] args) {
        // Criando duas contas
        ContaCorrente conta1 = new ContaCorrente("Alice", 1000.00);
        ContaCorrente conta2 = new ContaCorrente("Bob", 500.00);

        System.out.println("=== SALDOS INICIAIS ===");
        System.out.println("Conta de " + conta1.getTitular() + ": R$ " + conta1.getSaldo());
        System.out.println("Conta de " + conta2.getTitular() + ": R$ " + conta2.getSaldo());

        System.out.println("\n=== REALIZANDO TRANSFERÊNCIA VÁLIDA ===");
        // Alice transfere 300 para Bob
        conta1.transferir(conta2, 300.00);

        System.out.println("\n=== REALIZANDO TENTATIVA DE TRANSFERÊNCIA INVÁLIDA ===");
        // Alice tenta transferir 1000 para Bob (mas só tem 700)
        conta1.transferir(conta2, 1000.00);

        System.out.println("\n=== SALDOS FINAIS ===");
        System.out.println("Saldo final de " + conta1.getTitular() + ": R$ " + conta1.getSaldo());
        System.out.println("Saldo final de " + conta2.getTitular() + ": R$ " + conta2.getSaldo());
    }
}
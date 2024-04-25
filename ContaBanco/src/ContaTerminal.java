import java.util.Scanner;

public class ContaTerminal {
    public int conta;
    public String agencia;
    public String nomeCliente;
    public Double saldo;

    public ContaTerminal(int conta, String agencia, String nomeCliente, Double saldo) {
        this.conta = conta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getConta() {
        return this.conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome.");
        String nomeCliente = info.nextLine();

        System.out.println("Por favor, o número da sua conta.");
        int conta = info.nextInt();
        
        info.nextLine();

        System.out.println("Por favor, digite o saldo");
        double saldo = info.nextDouble();

        info.nextLine();
        
        System.out.println("Por favor, digite o número da sua conta no formato xxxx-x");
        String agencia = info.nextLine();

        info.close();

        ContaTerminal gerandoConta = new ContaTerminal(conta, agencia, nomeCliente, saldo);

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n",
                nomeCliente, agencia, conta, saldo);
    }
}

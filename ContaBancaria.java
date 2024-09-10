public class ContaBancaria {
    String titular;
    double saldo;

    public void atbConta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Amarildo";
        conta.depositar(1000);
        conta.sacar(100);

        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo: " + conta.saldo);
    }
}

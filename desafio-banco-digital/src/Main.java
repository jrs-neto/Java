public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João");
        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);

        Banco banco = new Banco("Banco Digital");
        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        cc.depositar(200);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

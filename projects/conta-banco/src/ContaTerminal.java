import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Seja Bem Vindo ao Banco DIO, digite 0 e depois ENTER para continuar.");
        int digitoZero = scanner.nextInt();

        System.out.println("Por favor, digite seu nome e depois ENTER para continuar.");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu sobrenome e depois ENTER para continuar.");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, digite sua agencia e depois ENTER para continuar.");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta e depois ENTER para continuar.");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite seu saldo e depois ENTER para continuar.");
        double saldo = scanner.nextDouble();

        System.out.print(
                "Olá, " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, ");
        System.out.print("sua agência é " + agencia + " e conta de número " + numeroConta + ", ");
        System.out.print("seu saldo atual é: " + saldo
                + ", já está disponível para saque. Obrigado por se cadastrar no Banco DIO.");
    }
}

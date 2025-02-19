import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        final double saldoNovoCliente = 1590.35;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu usuário ");
        int numeroUsuario = scanner.nextInt();

        System.out.println("Por favor, digite o número de Agência ");
        String agencia = scanner.next();


        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco,"
                + " sua agência é " + agencia + ", conta "
                + numeroUsuario + " e seus saldo "
                + saldoNovoCliente + " já está disponível para saque.");
        }
}

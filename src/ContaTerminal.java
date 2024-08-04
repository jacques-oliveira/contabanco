import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Conta conta = new Conta();
        Scanner scan = new Scanner(System.in).useLocale(Locale.getDefault());
        System.out.println("***Criando uma conta***\nDigite o nome de usuário para a conta");
        conta.nomeCliente = scan.next();
        System.out.println("Por favor, digite o número da Agência !");
        conta.agencia = scan.next();
        System.out.println("Por favor, Digite o número da Conta");
        conta.numeroConta = scan.nextInt();
        System.out.println("Digite o saldo");
        conta.saldo = scan.nextDouble();

        System.out.println("Olá Cliente, " + conta.nomeCliente
                            .concat(", obrigado por criar uma conta em nosso banco,")
                            .concat("sua agência é ")
                            .concat(conta.agencia)
                            .concat(", conta " + conta.numeroConta)
                            .concat(" e seu saldo " + conta.saldo)
                            .concat(" já está disponível para saque."));
    }
}
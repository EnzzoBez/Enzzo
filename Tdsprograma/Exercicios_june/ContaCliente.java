import java.util.Scanner;

public class ContaCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta do cliente: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Digite o saldo atual: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o valor do débito: ");
        double debito = scanner.nextDouble();

        System.out.print("Digite o valor do crédito: ");
        double credito = scanner.nextDouble();

        double saldoAtual = saldo - debito + credito;

        System.out.printf("O saldo atual da conta %s é: R$ %.2f%n", numeroConta, saldoAtual);

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
        
        scanner.close();
    }
}
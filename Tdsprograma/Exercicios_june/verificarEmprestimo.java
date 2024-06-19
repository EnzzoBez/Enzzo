import java.util.Scanner;

public class verificarEmprestimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Entre com o valor da prestação: ");
        double valorPrestacao = scanner.nextDouble();

        double limitePrestacao = 0.3 * salarioBruto;

        if (valorPrestacao <= limitePrestacao) {
            System.out.println("Empréstimo pode ser concedido.");
        } else {
            System.out.println("Empréstimo NÃO pode ser concedido.");
        }

        scanner.close();
    }
}
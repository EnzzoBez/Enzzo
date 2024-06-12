import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite a comissão fixa por carro vendido: ");
        double comissaoPorCarro = scanner.nextDouble();

        System.out.print("Digite o número de carros vendidos: ");
        int numeroDeCarrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas efetuadas: ");
        double valorTotalDasVendas = scanner.nextDouble();

        double salarioFinal = salarioFixo + (comissaoPorCarro * numeroDeCarrosVendidos) + (0.05 * valorTotalDasVendas);

        System.out.printf("O salário final do vendedor é: R$ %.2f%n", salarioFinal);
        
        scanner.close();
    }
}
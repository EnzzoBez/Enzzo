import java.util.Scanner;

public class CalcularSalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int numCarrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double valorTotalVendas = scanner.nextDouble();

        System.out.print("Digite o salário fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor por carro vendido: ");
        double valorPorCarro = scanner.nextDouble();

        double comissaoFixaPorCarro = 100.0; // Assumindo uma comissão fixa de 100 por carro

        double salarioFinal = salarioFixo + (numCarrosVendidos * valorPorCarro) + (0.05 * valorTotalVendas) + (numCarrosVendidos * comissaoFixaPorCarro);

        System.out.println("O salário final do vendedor é: " + salarioFinal);

        scanner.close();
    }
}

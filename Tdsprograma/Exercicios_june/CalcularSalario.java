import java.util.Scanner;

public class CalcularSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.print("Digite o número de horas trabalhadas em um mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = scanner.nextDouble();

        scanner.close();

        double salarioTotal = calcularSalarioTotal(horasTrabalhadas, salarioPorHora);

        System.out.println("O salário total do funcionário é: R$ " + salarioTotal);
    }

    public static double calcularSalarioTotal(int horasTrabalhadas, double salarioPorHora) {
        int horasSemanais = 40;
        int semanasNoMes = 4;
        double salarioTotal = 0;

        if (horasTrabalhadas > horasSemanais * semanasNoMes) {
            int horasExtras = horasTrabalhadas - (horasSemanais * semanasNoMes);
            salarioTotal = (horasSemanais * semanasNoMes * salarioPorHora) +
                    (horasExtras * salarioPorHora * 1.5); 
        } else {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        }

        return salarioTotal;
    }
}
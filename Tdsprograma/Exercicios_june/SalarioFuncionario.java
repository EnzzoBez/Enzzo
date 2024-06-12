import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = scanner.nextDouble();

        int horasSemanais = 40;
        int semanasNoMes = 4;
        int horasMensais = horasSemanais * semanasNoMes;
        
        double salarioTotal;
        
        if (horasTrabalhadas > horasMensais) {
            int horasExtras = horasTrabalhadas - horasMensais;
            double valorHoraExtra = salarioPorHora * 1.5;
            salarioTotal = (horasMensais * salarioPorHora) + (horasExtras * valorHoraExtra);
        } else {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        }

        System.out.printf("O salário total do funcionário é: R$ %.2f%n", salarioTotal);
        
        scanner.close();
    }
}
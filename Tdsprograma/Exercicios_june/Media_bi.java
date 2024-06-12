import java.util.Scanner;

public class Media_bi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota do primeiro bimestre: ");
        double notaBimestre1 = input.nextDouble();

        System.out.print("Digite a nota do segundo bimestre: ");
        double notaBimestre2 = input.nextDouble();

        double mediaSemestral = (4 * notaBimestre1 + 6 * notaBimestre2) / 10;

        System.out.println("A média semestral é: " + mediaSemestral);

        input.close();
    }
}
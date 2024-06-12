import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = input.nextDouble();

        double temperaturaCelsius = (5.0 / 9.0) * (temperaturaFahrenheit - 32);

        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius);

        input.close(); 
    }
}
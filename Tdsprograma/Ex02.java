import java.util.Scanner;
public class Ex02{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        double numero1 = ler.nextDouble();
        System.out.println("Insira o segundo Número: ");
        double numero2 =  ler.nextDouble();

        double resultado = numero1 + numero2;

        System.out.println("O resultado da soma é: " + resultado);
    }
}
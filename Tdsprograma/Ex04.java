import java.util.Scanner;

public class Ex04{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
    System.out.print("Insira o primeiro número: ");
    double num1 = sc.nextDouble();
    System.out.print("Insira o segundo número: ");
    double num2 = sc.nextDouble();
    
    double result = num1 + num2;
    
    if(result>10){
        System.out.println("A soma é maior que 10");
    } else if(result<10){
        System.out.println("A soma é menor que 10");
    }
    }
}
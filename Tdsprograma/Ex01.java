import java.util.Scanner;
public class  Ex01{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String nome = ler.next();
        System.out.println("Insira sua idade: ");
        int idade = ler.nextInt();

        System.out.println(nome);
        System.out.println(idade);
    } 
}

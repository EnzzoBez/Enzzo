
import java.util.Arrays;
import java.util.Scanner;

public class Ex07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];

        for(int i=0; i<arr.length; i++){
            System.out.print("Digite algum nome: ");
            String nome = sc.next();
            arr[i] = nome;
        }
        Arrays.sort(arr);
        for(int j=0; j<arr.length; j++){
            System.out.println(arr[j]);
        }
    }
}
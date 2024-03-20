import java.util.Scanner;

public class Ex06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        
        for(int i=0; i<array.length; i++){
            System.out.print("Insira os números: ");
            int num = sc.nextInt();
            array[i] = num;
        }
        for(int j=array.length - 1; j>=0; j--){
            System.out.println(array[j]);
        }
    }
}
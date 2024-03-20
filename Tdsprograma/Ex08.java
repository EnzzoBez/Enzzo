import java.util.Arrays;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                System.out.print("Linha " + (i+1) + " Coluna " + (j+1)+ " : ");
                int num = sc.nextInt();
                mat[i][j] = num;
            }
        }
        System.out.print(Arrays.deepToString(mat));
    }
}
import java.util.Arrays;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] mat = new String[2][3];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print("Linha " + (i+1) + " Coluna " + (j+1)+ " : ");
                String num = sc.next();
                mat[i][j] = num;
            }
        }
        
        exibirMat(mat);
    }
    
    public static void exibirMat(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
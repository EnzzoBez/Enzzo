import java.util.Scanner;

public class ComparacaoVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tamanho = 15;
        
        int[] V1 = new int[tamanho];
        int[] V2 = new int[tamanho];
        
        System.out.println("Digite os valores para o vetor V1:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("V1[" + i + "]: ");
            V1[i] = scanner.nextInt();
        }
        
        System.out.println("\nDigite os valores para o vetor V2:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("V2[" + i + "]: ");
            V2[i] = scanner.nextInt();
        }
        
        int contador = 0;
        
        for (int i = 0; i < tamanho; i++) {
            if (V1[i] == V2[i]) {
                contador++;
            }
        }
        
        System.out.println("\nQuantidade de números iguais nas mesmas posições em V1 e V2: " + contador);
        
        scanner.close();
    }
}

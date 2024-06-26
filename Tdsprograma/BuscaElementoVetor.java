import java.util.Scanner;

public class BuscaElementoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tamanho = 16;
        int[] vetor = new int[tamanho];
        
        System.out.println("Digite os " + tamanho + " valores do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        System.out.print("\nDigite o número que deseja buscar no vetor: ");
        int numeroBusca = scanner.nextInt();
        
        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == numeroBusca) {
                contador++;
            }
        }
        
        if (contador > 0) {
            System.out.println("\nO número " + numeroBusca + " aparece " + contador + " vezes no vetor.");
        } else {
            System.out.println("\nO número " + numeroBusca + " não foi encontrado no vetor.");
        }
        
        scanner.close();
    }
}

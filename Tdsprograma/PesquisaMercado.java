import java.util.Scanner;

public class PesquisaMercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalEntrevistados = 10;
        int pessoasSim = 0;
        int pessoasNao = 0;
        int mulheresSim = 0;
        int homensNao = 0;
        int mulheresTotal = 0;
        int homensTotal = 0;
        
        for (int i = 0; i < totalEntrevistados; i++) {
            System.out.println("Informe o sexo (F/M) do entrevistado " + (i + 1) + ":");
            char sexo = scanner.next().charAt(0);
            
            System.out.println("Resposta do entrevistado " + (i + 1) + " (sim ou não):");
            String resposta = scanner.next().toLowerCase();
            
            if (resposta.equals("sim")) {
                pessoasSim++;
                if (sexo == 'F' || sexo == 'f') {
                    mulheresSim++;
                    mulheresTotal++;
                } else if (sexo == 'M' || sexo == 'm') {
                    homensTotal++;
                }
            } else if (resposta.equals("não") || resposta.equals("nao")) {
                pessoasNao++;
                if (sexo == 'M' || sexo == 'm') {
                    homensNao++;
                    homensTotal++;
                } else if (sexo == 'F' || sexo == 'f') {
                    mulheresTotal++;
                }
            } else {
                System.out.println("Resposta inválida. Por favor, digite 'sim' ou 'não'.");
                i--; // para repetir a iteração atual
            }
        }
        
        double percentualMulheresSim = (mulheresTotal > 0) ? (double) mulheresSim / mulheresTotal * 100 : 0;
        double percentualHomensNao = (homensTotal > 0) ? (double) homensNao / homensTotal * 100 : 0;
        
        System.out.println("\nResultados da pesquisa:");
        System.out.println("Número de pessoas que responderam sim: " + pessoasSim);
        System.out.println("Número de pessoas que responderam não: " + pessoasNao);
        System.out.printf("Porcentagem de mulheres que responderam sim: %.2f%%\n", percentualMulheresSim);
        System.out.printf("Porcentagem de homens que responderam não: %.2f%%\n", percentualHomensNao);
        
        scanner.close();
    }
}

public class TrocarVa {
    public static void main(String[] args) {
        int A = 10;
        int B = 25;

        
        int troca = A;
        A = B;
        B = troca;

        System.out.println("Ja que o valor anterior foi trocado, A fica igual a: " + A);
        System.out.println("Ja que o valor anterior foi trocado, B fica igual a: " + B);

    }
}
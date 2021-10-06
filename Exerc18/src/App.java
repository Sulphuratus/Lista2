public class App {
    public static void main(String[] args) throws Exception {
        
        int A [] = {1, 0, 5, -2, -5, 7};
        
        int soma;

        soma = A[0] + A[1] + A[5];

        System.out.println("A soma de A0, A1 e A3 é: " + soma);

        A[4] = 100;

        for ( int i = 0; i < 6; i++){
            System.out.println("A" + i + " = " + A[i]);
        }
    }
}

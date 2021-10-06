import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int A [] = new int [10];
        int B [] = new int [10];
        int C [] = new int [10];

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite cada número do vetor A e tecle ENTER: ");
        
        for ( int i = 0; i < 10; i++){
            A[i] = leia.nextInt();
        }

        System.out.println("Digite cada número do vetor B e tecle ENTER: ");
        
        for ( int i = 0; i < 10; i++){
            B[i] = leia.nextInt();
        }
        System.out.println("O vetor C da diferença entre A-B é: ");
        for ( int i = 0; i < 10; i++){
            C[i] = A[i] - B[i];
            System.out.print(C[i]);
        }
    }
}

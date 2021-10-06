import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int vet [] = new int [10];
        int cont, j;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite cada valor do vetor e tecle ENTER: ");

        for (int i = 0; i < 10; i++){
            vet [i] = leia.nextInt();
        }

        for ( int i = 0; i < 10; i++){
            cont = 0;
            for ( j = i+1; j <= 9; j++){
                if ( vet [j] == vet [i] ){
                    cont ++ ;
                } 
            }

            if ( cont > 0 && cont < 2 ){
                System.out.println("O valor " + vet[i] + " é repetido.");
            }   
        }
    }
}

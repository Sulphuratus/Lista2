import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int vet [] = new int [8];
        int x, y, soma;
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite cada número do vetor e aperte ENTER: ");

        for ( int i = 0; i < 8; i++){
            vet [i] = leia.nextInt();
        }
        System.out.println("Digite a posição X desejada: ");
        x = leia.nextInt();
        
        System.out.println("Digite a posição Y desejada: ");
        y = leia.nextInt();

        soma = vet[x] + vet[y];

        System.out.println("\nA soma dos valores das posições " 
        + x + " e " + y + " é: " + soma);
    }
}

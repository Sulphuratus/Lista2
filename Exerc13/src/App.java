import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int n, maior, menor;

        Scanner leia = new Scanner(System.in);

        System.out.println("\nDigite um número inteiro qualquer: ");
        n = leia.nextInt();
        maior = menor = n;

        while ( n >= 0 ){
            System.out.println("Digite um número inteiro: ");
            n = leia.nextInt();
            if ( n > maior ){
                maior = n;
            }
            if ( n < menor && n >= 0){
                menor = n;
            }
        }
        
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n, maior;
        int num = 0, cont = 1;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite quantos números a serem lidos: ");
        n = leia.nextInt();
        maior = num;

        for ( int i = 0; i < n; i++){
            System.out.println("Digite um número: ");
            num = leia.nextInt();
            if ( num > maior ){
                maior = num;
            }else if ( maior == num ){
                cont ++;
            }
        }
     System.out.println("\nO maior número é o " + maior
     + " e aparece " + cont + " vezes.\n");
    
    }
}

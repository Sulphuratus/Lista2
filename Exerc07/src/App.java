import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int num;
        int soma = 0;

        Scanner leia = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){
            System.out.println("Digite o valor correspondente a número " + i);
            num = leia.nextInt();
            soma = soma + num;
        }
        
        System.out.println("\nA soma dos 10 numeros é: " + soma);
    }
}

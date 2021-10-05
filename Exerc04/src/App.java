
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int num;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        num = leia.nextInt();

        for ( int i = 1; i <= 5; i++){
            System.out.println(i*num);
            }
        }

    }

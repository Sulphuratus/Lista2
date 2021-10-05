import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int num;
        int div = 1;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número positivo: ");
        num = leia.nextInt();

        System.out.println("\nOs divisores de " + num + " são: ");

        while( div <= num){
            if ( num % div == 0){
                //System.out.println("" + div + " é divisor");
                if (num == div){
                    System.out.print( div + "." );
                }else{System.out.print( div + ", " );
                    }
                div++;
            }else{
                div++;
            }
        }System.out.print("\n\n" );   
    }
}

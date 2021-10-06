import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int num[] = new int [5];
        double media;
        double soma = 0;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite cada número e aperte ENTER: ");

        for ( int i = 0; i < 5; i++){
            num [i]= leia.nextInt();
            soma = soma + num [i];
        }
        media = soma / 5;
        System.out.print("\nA média dos números ");

        for ( int i = 0; i < 5; i++){
        System.out.print(num[i]);
            if ( i != 4 ){
                System.out.print(", ");
            }else{
                System.out.println(" = " + media + "\n");
            }
        }
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num [] = new int [6];
        Scanner leia = new Scanner(System.in);

        for ( int i = 0; i < 6; i++){
            System.out.println("Digite o " + (i+1) 
            + "º número inteiro: ");
            num [i]= leia.nextInt();
        }

        System.out.print("\nOs números digitados são: ");
        
        for ( int i = 0; i < 6; i++){
            if ( i != 5){
                System.out.print( num [i] + ", "); 
            }else{
                System.out.print( num [i] + ". ");
            }
        }

    }
}

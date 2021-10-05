import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int num [] = new int [6];
        Scanner leia = new Scanner(System.in);

        for ( int i = 0; i < 6; i++){
            System.out.println("\nDigite o " + (i+1) 
            + "º número inteiro: ");
            num [i]= leia.nextInt();
        }
        System.out.print("\nOs números digitados na ordem inversa são: ");
        
        for ( int i = 5; i >= 0; i--){
            if ( i != 0){
                System.out.print( num [i] + ", "); 
            }else{
                System.out.print( num [i] + ". ");
            }
        }System.out.println("\n");
    }
}

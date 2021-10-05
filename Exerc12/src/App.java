import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        int cont, init;
        double hn = 0;
        //int init = 1;

        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o número do n-ésimo termo da série (n): ");
        cont = leia.nextInt();

        for (double i = 1; i <= cont; i++){
            if ( i == 1 ){
                init = 1;
                hn = init;
            }else{
                init = 0;
                hn = hn + init + 1 / i;
            } 
        }
                
        System.out.println("O valor de Hn é: " + hn);
    }
}

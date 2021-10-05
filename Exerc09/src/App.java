import java.util.Scanner;

// PROGRAMA QUE LÊ UM NÚMERO INTEIRO E APRESENTA SEUS DIVISORES INTEIROS 
// COM A SOMA DE TODOS MENOS O PRÓPRIO NÚMERO

public class App {
    public static void main(String[] args) throws Exception {
        
        int num;
        int cont = 0;
        int soma = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número positivo: ");
        num = leia.nextInt();

        System.out.print("\nA soma dos divisores de " + num + " é: ");

        for (int i = 1; i < num; i++){
            
            if ( num % i == 0 ){
                System.out.print( i );
                soma = soma + i;
                cont = 0;

                for ( int j = i; j < num; j++){
                    if ( num % (j) == 0){
                        cont ++;
                    } 
                }
                
                if ( cont == 1){
                    System.out.print(" = ");
                }else{
                    System.out.print(" + ");
                    }
            }

        }

        System.out.print( soma + "." );
        
        System.out.print("\n\n" );   
    }

}

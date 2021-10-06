import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int [][] matriz1 = new int [3][3];
        int [][] matriz2 = new int [3][3];
        int [][] soma = new int [3][3];
        int [][] mult = new int [3][3];


        
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite cada elemento da matriz M1 e teche ENTER: ");

        for ( int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1.length; j++){
                matriz1[i][j] = leia.nextInt();
            }
        }

        System.out.println("Digite cada elemento da matriz M2 e teche ENTER: ");

        for ( int i = 0; i < matriz2.length; i++){
            for (int j = 0; j < matriz2.length; j++){
                matriz2[i][j] = leia.nextInt();
            }
        } 

        // SOMA DAS MATRIZES
        System.out.println("\nResultado da soma das matrizes:");
        for ( int i = 0; i < matriz2.length; i++){
            for (int j = 0; j < matriz2.length; j++){
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
                if ( soma[i][j] >= 0 && soma[i][j] <= 9){
                    System.out.print(soma [i][j] + "   ");
                }else if ( soma[i][j] >= 10 && soma[i][j] <= 99){
                    System.out.print(soma [i][j] + "  ");
                } else if ( soma[i][j] >= 100 && soma[i][j] <= 999){
                    System.out.print(soma [i][j] + " ");
                }
                //System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        } 

        // PRODUTO DAS MATRIZES
        System.out.println("\nResultado do produto das matrizes:");
        for ( int i = 0; i < matriz2.length; i++){
            for (int j = 0; j < matriz2.length; j++){
                mult[i][j] = 0;
                for ( int k = 0; k < mult.length; k++){
                    mult[i][j] += matriz1[i][k] * matriz2[k][j];
                }
                if ( mult[i][j] >= 0 && mult[i][j] <= 9){
                    System.out.print(mult [i][j] + "   ");
                }else if ( mult[i][j] >= 10 && mult[i][j] <= 99){
                    System.out.print(mult [i][j] + "  ");
                } else if ( mult[i][j] >= 100 && mult[i][j] <= 999){
                    System.out.print(mult [i][j] + " ");
                }
                //System.out.print(mult[i][j] + "   ");
            }
        System.out.println();
        }

        System.out.println("\nFIM!");
    }
}

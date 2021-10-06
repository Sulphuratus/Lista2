import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int [][] matriz = new int [5][5];
        int maior, menor;
        Scanner leia = new Scanner(System.in);

        for ( int i = 0; i < matriz.length; i++){
            for ( int j = 0; j < matriz.length; j++){
                System.out.println("Digite o termo M"+i+j+": ");
                matriz[i][j] = leia.nextInt();
            }
        }
        
        System.out.println("\nMatriz no formato matemático: ");
        for ( int i = 0; i < matriz.length; i++){
            for ( int j = 0; j < matriz.length; j++){
                if ( matriz[i][j] >= 0 && matriz[i][j] <= 9){
                    System.out.print(matriz [i][j] + "   ");
                }else if ( matriz[i][j] >= 10 && matriz[i][j] <= 99){
                    System.out.print(matriz [i][j] + "  ");
                } else if ( matriz[i][j] >= 100 && matriz[i][j] <= 999){
                    System.out.print(matriz [i][j] + " ");
                }
                //System.out.print(matriz [i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println("\nDiagonal principal: ");
        for ( int i = 0; i < matriz.length; i++){
            for ( int j = 0; j < matriz.length; j++){
                if ( i == j ){
                    if ( matriz[i][j] >= 0 && matriz[i][j] <= 9){
                        System.out.print(matriz [i][j] + "   ");
                    }else if ( matriz[i][j] >= 10 && matriz[i][j] <= 99){
                        System.out.print(matriz [i][j] + "  ");
                    } else if ( matriz[i][j] >= 100 && matriz[i][j] <= 999){
                        System.out.print(matriz [i][j] + " ");
                    }
                    //System.out.print(matriz [i][j] + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\nDiagonal secundária: ");
        for ( int i = 0; i < matriz.length; i++){
            for ( int j = 0; j < matriz.length; j++){
                if ( (i + j) == (matriz.length - 1) ){
                    if ( matriz[i][j] >= 0 && matriz[i][j] <= 9){
                        System.out.print(matriz [i][j] + "   ");
                    }else if ( matriz[i][j] >= 10 && matriz[i][j] <= 99){
                        System.out.print(matriz [i][j] + "  ");
                    } else if ( matriz[i][j] >= 100 && matriz[i][j] <= 999){
                        System.out.print(matriz [i][j] + " ");
                    }
                    //System.out.print(matriz [i][j] + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        System.out.println("\nTríângulo superior: ");
        for ( int i = 0; i < matriz.length; i++){
            for ( int j = 0; j < matriz.length; j++){
                if ( (i + j) <= (matriz.length - 1) ){
                    if ( matriz[i][j] >= 0 && matriz[i][j] <= 9){
                        System.out.print(matriz [i][j] + "   ");
                    }else if ( matriz[i][j] >= 10 && matriz[i][j] <= 99){
                        System.out.print(matriz [i][j] + "  ");
                    } else if ( matriz[i][j] >= 100 && matriz[i][j] <= 999){
                        System.out.print(matriz [i][j] + " ");
                    }
                    //System.out.print(matriz [i][j] + "   ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\nTríângulo inferior: ");
        for ( int i = 0; i < matriz.length; i++){
            for ( int j = 0; j < matriz.length; j++){
                if ( (i + j) >= (matriz.length - 1) ){
                    if ( matriz[i][j] >= 0 && matriz[i][j] <= 9){
                        System.out.print(matriz [i][j] + "   ");
                    }else if ( matriz[i][j] >= 10 && matriz[i][j] <= 99){
                        System.out.print(matriz [i][j] + "  ");
                    } else if ( matriz[i][j] >= 100 && matriz[i][j] <= 999){
                        System.out.print(matriz [i][j] + " ");
                    }
                    //System.out.print(matriz [i][j] + "   ");
                }else{
                    System.out.print("    ");
                }
            }
            System.out.println();
        }

        menor = maior = matriz[0][0];
        System.out.println("\nMaior e menor valor da matriz M[10][10]: ");
        for ( int i = 0; i < matriz.length; i++){
            for ( int j = 0; j < matriz.length; j++){
                if ( matriz[i][j] > maior ){
                    maior = matriz[i][j];
                }
                
                if ( matriz[i][j] < menor ){
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        
    }
}

import java.util.Scanner;

// EXERC03 LISTA2 - PROGRAMA QUE LÊ UM NÚMERO INTEIRO E IMPRIME
// UMA LISTA COM OS NÚMEROS NATURAIS ÍMPARES ATÉ ELE.

public class App {
    public static void main(String[] args) throws Exception {
        
        int num;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        num = leia.nextInt();

        System.out.println("");

        for (int i = 0; i <= num; i++){
            if ( i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
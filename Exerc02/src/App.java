import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

// EXERC02.LISTA2 - PROGRAMA QUE LÊ UM INTEIRO POSITIVO E IMPRIME A
// LISTA DE TODOS OS NÚMEROS NATURAIS ATÉ ELE EM ORDEM DECRESCENTE.

public class App {
    public static void main(String[] args) throws Exception {

        float num = 0;
        int limite;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        num = leia.nextFloat();
        limite = (int) num;
        

        if ( num < 0 || num % 1 != 0){
            System.out.println("Número não é inteiro ou menor que zero, programa encerrado!");
        }else{
            System.out.println("\n");
            for ( int i = limite; i >= 0; i--){
                System.out.println(i);
            }
        }
    }
}

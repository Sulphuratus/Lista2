import java.util.Scanner;

//import javax.swing.JOptionPane;

// EXERC01.LISTA2 - PROGRAMA QUE LÊ UM INTEIRO POSITIVO E IMPRIME
// A LISTA DE TODOS OS NÚMEROS NATURAIS ATÉ ELE EM ORDEM CRESCENTE. 

public class App {
    public static void main(String[] args) throws Exception {

        float num = 0;

// LEITURA E APRESENTAÇÃO DOS DADOS PELO CONSOLE
        Scanner leia = new Scanner(System.in);

        System.out.println("\nDigite um número inteiro positivo: ");
        num = leia.nextFloat();

        if (num < 0 || num % 1 != 0){
            System.out.println("Número não é inteiro positivo, fim do programa!!");
            }else{
                for (int i = 0; i <= num; i++){
                System.out.println(i);
                }
            }

        /*String temp = JOptionPane.showInputDialog(null, "Digite um número inteiro positivo: ", "Entrada do número", JOptionPane.INFORMATION_MESSAGE);
        num = Integer.parseInt(temp);

        for (int i = 0; i <= num; i++){
            JOptionPane.showMessageDialog(null, i, "Lista", JOptionPane.INFORMATION_MESSAGE);
        }*/

    }
}

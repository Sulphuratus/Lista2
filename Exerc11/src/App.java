import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        int num;
        int fibo = 0;
        int ante = 1;
        int inicio = 1;

        Scanner leia = new Scanner(System.in);

    
        System.out.println("Digite o número correspondente a posição desejada na sequência de Fibonacci: ");
    
        num = leia.nextInt();

        if ( num == 0 ){
            System.out.println("O termo " + num + " da sequência de Fibonacci é: " + num);
        }else if ( num == 1 ){
            System.out.println("O " + num + "º termo da sequência de Fibinacci é : " + num);
        }else if ( num == 2 ){
            System.out.println("O " + (num) + "º termo da sequência de Fibonacci é : " + (num-1));
        }else{
            for (int i = 3; i <= num; i++){
                fibo = inicio + ante;
                inicio = ante;
                ante = fibo;
            }
            System.out.println("O " + num + "º termo da sequência de Fibonacci é: " + fibo);
        }   
        //System.out.println("O " + num + "º termo da sequência de Fibonacci é: " + fibo);
    }
}

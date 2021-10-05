// EXERC05 - PROGRAMA QUE IMPRIME OS 50 PRIMEIROS NÚMEROS PARES

public class App {
    public static void main(String[] args) throws Exception {
        
        int contador = 0, soma = 0;
        int num = 0;

        while( contador <= 50 ){

            if ( num % 2 == 0 ){
                //System.out.println(num);
                soma = soma + num;
                contador++;
            }
            num++;
        }System.out.println("\nA soma dos primeiros 50 números pares é: " + soma);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        
        int soma = 0;

        for ( int i = 0; i < 1000; i++){
            if ( i % 3 == 0 || i % 5 == 0 ){
                soma = soma + i;
            }
        }
        System.out.println("\nA soma dos números naturais múltiplos de 3 e 5 até 1000 é: " + soma);
        System.out.println("\n");
    }
}

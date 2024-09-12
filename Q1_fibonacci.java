import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1_fibonacci {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        ArrayList<Integer> fibonacci = new ArrayList<>();

        // Adicionando as 2 posições principais
        fibonacci.add(0);
        fibonacci.add(1);

        // Tratando o erro caso a entrada seja 0
        if(fibonacci.get(0) == numero) {
            System.out.println("O número " + numero + " pertence a sequência de fibonacci!");
            return;
        }


        // Enquanto o valor do Fibonacci atual for menor ou igual ao valor que queremos validar, ele irá criar a próxima posição da sequência
        int i = 1;
        while (fibonacci.get(i) <= numero) {

            // Verificando se o número atual da sequência de fibonacci é igual ao número que está sendo validado
            if(fibonacci.get(i) == numero) {
                System.out.println("O número " + numero + " pertence a sequência de fibonacci!");
                break;
            } 

            // Criando a próxima posiçao da sequência
            fibonacci.add(fibonacci.get(i) + fibonacci.get(i-1));

            // Incrementando o i
            i++;
        }

        // Se ele percorreu até chegar no número de entrada e não encontrou nenhum valor, esse valor não tem na sequência de fibonacci 
        System.out.println("Infelizmente, o número " + numero + " não pertence a sequência de fibonacci!");

    }
    
}
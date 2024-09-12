import java.util.Scanner;

public class Q2_letraA {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String palavra = input.nextLine();
        String auxiliar = palavra.toLowerCase();

        int contadorDeA = 0;
        for (int i = 0; i < auxiliar.length(); i++) {
            
            if(auxiliar.charAt(i) == 'a') {
                contadorDeA++;
            }

        }

        if(contadorDeA > 0) {
            System.out.println("\n A string '" + palavra + "' contém a letra A (em maiúsculo ou minúsculo) e ele aparece " + contadorDeA + " vezes! \n");
        } else {
            System.out.println("A string '" + palavra + "' não contém a letra A (em maiúsculo ou minúsculo)!");
        }
    }

}

package AtividadeDois;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto com 100 caracteres, no máximo:");
        String texto = scanner.nextLine();

        if (texto.length()>100){
            texto = texto.substring(0, 100);
        }

        System.out.println("Agora, digite um caractere para difinir as substrings:");
        char c = scanner.next().charAt(0);

         String[] partes = texto.split(Character.toString(c));

        
        System.out.println("\nSubstrings obtidas:");
        for (String parte : partes) {
            System.out.println(parte);
        }

        int ultimaPos = -1; 
        boolean encontrou = false;

        System.out.println("\nSubstrings obtidas:");
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == c && i > ultimaPos) {
                String sub = texto.substring(0, i + 1);
                System.out.println(sub);
                ultimaPos = i; 
                encontrou = true;
            }
        }

        scanner.close();
    }

}
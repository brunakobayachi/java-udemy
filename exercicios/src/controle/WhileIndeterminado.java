package controle;

import java.until.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        java.util.Scanner entrada = new Scanner(System.in);
        
        String valor = "";
        
        while(!valor.equalsIgnoreCase("sair")) {
            System.out.println("Voce diz: ");
            valor = entrada.nextLine();
        }
        entrada.close();
    }
}

package fundamentos;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        // Scanner entrada = new Scanner(System.in);

        Byte b = 100;
        Short s = 1000;
        // Integer i = Integer.parseInt(entrada.next());
        Integer i = Integer.parseInt("3000");
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i);
        System.out.println(l/3);
        
        Float f = 123.2230F;
        System.out.println(f);
        
        Double d  = 1235.556666;
        System.out.println(d);
        
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());
        // entrada.close();
        
        Character c =   '#';
        System.out.println(c+ "...");
    }

}

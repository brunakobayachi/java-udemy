package classe;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Bruna";
        u1.email = "b@b.com";
        
        Usuario u2 = new Usuario();
        u2.nome = "Bruna";
        u2.email = "b@b.com";
        
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u1 == u1);
        System.out.println(u1.equals(u1));
        
        System.out.println(u1.equals(new Date()));
    }
}

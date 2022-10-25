package desafio;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Bruna", 60.0);
        Comida c1 = new Comida("Arroz", 0.233);
        Comida c2 = new Comida("Carne", 0.683);  
        
        double p1c = p1.comer(c1);
        System.out.println(p1c);
        
        p1c = p1.comer(c2);
        System.out.println(p1c);
        
    }
}

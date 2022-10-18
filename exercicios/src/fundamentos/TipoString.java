package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal!".charAt(5));
        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.equalsIgnoreCase("boa tarde"));
    
        var nome = "Bruna";
        var sobrenome = "Kobayachi";
        var idade = 22;
        var salario = 2312.22;
        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome);
        System.out.printf("Nome: %s %s e ganha R$ %.2f", nome, sobrenome, salario);
    
        String frase = String.format("\nA senhora %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
        System.out.println(frase);
    }
}

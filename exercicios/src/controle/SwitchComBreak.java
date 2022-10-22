package controle;

public class SwitchComBreak {
    public static void main(String[] args) {
        String conceito = "";
        int nota = 7;
        switch(nota) {
            case 10:
                conceito = "A";
                break;
            case 9:
                conceito = "A";
            case 8: case 7:
                conceito = "B";
            
        }
        System.out.println("O conceito e "+ conceito);
    }
}

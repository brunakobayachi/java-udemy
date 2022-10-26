package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Quantos alunos?");
        int qtdeAlunos = entrada.nextInt();
        
        System.out.println("Quantas notas por aluno?");
        int qtdeNotas = entrada.nextInt();
        
        double notasTurma[][] = new double [qtdeAlunos][qtdeNotas]; 
        
        double total = 0;
        for (int i = 0; i < notasTurma.length; i++) {
            for (int j = 0; j < notasTurma[i].length; j++) {
                System.out.printf("Informe a nota %d do aluno %d: ", i + 1, j + 1);
                notasTurma[i][j] = entrada.nextDouble();
                total += notasTurma[i][j];
            }
        }
        
        
        double media = total/(qtdeAlunos*qtdeNotas);
        System.out.println("A media da turma e" + media);
        
        for(double[] notasAluno: notasTurma) {
            System.out.println(Arrays.toString(notasAluno));
        }
        
        entrada.close();
    }
}

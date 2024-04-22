import java.util.Scanner;

public class Evaluaciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = -1;

        while (nota != -1){
            mediaEvaluaciones += nota;
            nota = teclado.nextDouble();
            totalEvaluaciones++;
        }

        System.out.println("El promedio de las notas es : " + mediaEvaluaciones/totalEvaluaciones);
    }
}

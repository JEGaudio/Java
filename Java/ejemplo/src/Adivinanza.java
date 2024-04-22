import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contadorIntentos = 0;
        int numeroRandom = new Random().nextInt(100);
        int numeroIngresado;
        boolean condicionSalida = true;

        while (condicionSalida){
            System.out.println("Ingrese un numero del 1 al 100");
            numeroIngresado = teclado.nextInt();
            if (numeroIngresado<numeroRandom) {
                System.out.println("El numero secreto es mayor");
                contadorIntentos++;
            } else if (numeroIngresado>numeroRandom) {
                System.out.println("El numero secreto es menor");
                contadorIntentos ++;
            } else {
                System.out.println("Has adivinado el numero!!!!");
                condicionSalida = false;
            }

            if (contadorIntentos == 5) {
                condicionSalida = false;
                System.out.println("""
                        Se acabaron los intentos!
                        El numero era : 
                        """ + numeroRandom);
            }
        }

        //System.out.println(numeroRandom);
    }
}

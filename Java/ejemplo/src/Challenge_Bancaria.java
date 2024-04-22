import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

class UsuarioBancario {
        String nombre;
        String cuenta;
        double saldo;
        String pass;

        public void entregarDatos(){
            System.out.println(String.format("""
                **************************************
                
                Nombre del cliente: %s
                Tipo de cuenta: %s
                Saldo diponible: %.2f$
                """,nombre,cuenta,saldo));

        }

        public boolean VerificarPass (String nom, String password){
            //System.out.println(nom.equals(nombre) && password.equals(pass));
            return (nom.equals(nombre) && password.equals(pass));
        }
}


public class Challenge_Bancaria {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        UsuarioBancario usuar1 = new UsuarioBancario();
        usuar1.nombre = "Juan";
        usuar1.cuenta = "Cuenta Corriente";
        usuar1.saldo = 1599.99;
        usuar1.pass = "1234";
//        String nombreCliente = "Juan";
//        String tipoCuenta = "Cuenta Corriente";
//        double saldoDisponible = 1599.99;
        String nombreIgresado ="";
        String passIngresado ="";
        boolean seguirPreguntando = true;
        double montoIngresado = 0;

        System.out.println("Indicar nombre: ");
        nombreIgresado = teclado.nextLine();
        System.out.println("Indicar clave: ");
        passIngresado = teclado.nextLine();

        if (!usuar1.VerificarPass(nombreIgresado,passIngresado)){
            System.out.println("Datos ingresados de manera incorrecta");
            return;
        }

        while  (seguirPreguntando){
            usuar1.entregarDatos();
            switch (menu()){
                case 1:
                    System.out.println("Tu saldo actual es de: " + usuar1.saldo+"$");
                    break;
                case 2:
                    System.out.println("Indica el monto a retirar: ");
                    montoIngresado = teclado.nextDouble();
                    if (montoIngresado>usuar1.saldo){
                        System.out.println("No tienes suficiente saldo");
                    }
                    else {
                        usuar1.saldo -= montoIngresado;
                    }
                    break;
                case 3:
                    System.out.println("Indica el monto a depositar: ");
                    montoIngresado = teclado.nextDouble();
                    usuar1.saldo += montoIngresado;
                    break;
                case 9:
                    seguirPreguntando = false;
                    System.out.println("Saliendo del programa. Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("No has ingresado una opcion valida");
            }
        }


    }

    public static int menu (){
        Scanner teclado = new Scanner(System.in);
        System.out.println("""
                **************************************
                ** Escriba el numero de la opcion deseada **
                1 - Consulta saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """);
        return teclado.nextInt();
    }
}

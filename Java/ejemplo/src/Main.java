//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        System.out.println("Bienvenido a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        double media = (12 + 6.0 + 9.0 )/3;
        //utilizar textblock
        String sinopsis = String.format("""
                Matrix es una paradoja.
                La mejor pelicula del fin del milenio
                Fue lanzada en: %d
                La nota fue de: %.2f
                la media es de: %.2f
                """,fechaDeLanzamiento,notaDeLaPelicula,media);

        System.out.println(sinopsis);

        String clasificacion = "";

        for (int i=0;i<(int) media/2;i++){
            clasificacion += '\u2B50';
        }
        if (media%2 != 0) {
            //para los casos con coma
        }
        System.out.println(clasificacion);

    }
}
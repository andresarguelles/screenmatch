import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio""";
        System.out.println("Pelicula: " + nombre);
        System.out.println(sinopsis);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);
        int usuariosQueHanCalificado = 3;
        double sumaEvaluacionUsuario = 0;
        for (int i = 0; i < usuariosQueHanCalificado; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a " + nombre);
            double notaUsuario = teclado.nextDouble();
            sumaEvaluacionUsuario += notaUsuario;
        }
        double mediaEvaluacionUsuario = sumaEvaluacionUsuario/usuariosQueHanCalificado;
        System.out.println("La media calculada para " + nombre + " es: " + mediaEvaluacionUsuario);
    }
}
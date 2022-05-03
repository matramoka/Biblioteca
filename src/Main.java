import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(2);

        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<Socio> socios = new ArrayList<>();

        Biblioteca biblioteca = new Biblioteca(libros, socios);

        Derecho libro = new Derecho("El mio Cid", 1203, 2, Estado.DISPONIBLE, yesterday, new Socio(null));
        Derecho libro2 = new Derecho("Legislacion", 234, 2, Estado.DISPONIBLE, yesterday, new Socio(null));
        Derecho libro3 = new Derecho("peri", 587, 2, Estado.DISPONIBLE, yesterday, new Socio(null));
        Derecho libro4 = new Derecho("putin", 134, 2, Estado.DISPONIBLE, yesterday, new Socio(null));
        libros.add(libro);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);

        biblioteca.prestarLibro();
        //libro.tiempoPrestamoRestante();
        biblioteca.devolverLibro();

        }


}
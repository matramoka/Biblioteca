import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Socio> socios;

    public int librosDisponibles() {

        int librosDisponibles = 0;

        for (Libro libro : libros) {

            if (libro.getEstado().equals(Estado.DISPONIBLE)) {
                librosDisponibles++;
            }
        }

        return librosDisponibles;
    }

    public void prestarLibro() {

        Scanner buffer = new Scanner(System.in);


        System.out.println("Ingrese Libro deseado: ");
        String nombreLibro = buffer.nextLine();

        for (Libro libro : libros) {

            if (nombreLibro.equals(libro.getTitulo()) && libro.getEstado().equals(Estado.DISPONIBLE)) {

                System.out.println("Ingrese Socio que se lleva el libro: ");
                String socio = buffer.nextLine();

                libro.setSocio(new Socio(socio));
                libro.setEstado(Estado.NO_DISPONIBLE);
                libro.setFechaPrestado(null);
                System.out.println("El socio: " + libro.getSocio().getNombre() + " se llevo el libro "
                + libro.getTitulo() + " el día " + libro.getFechaPrestado());
            }
        }
    }

    public void devolverLibro() {

        Scanner buffer = new Scanner(System.in);


        System.out.println("Ingrese Libro a devolver: ");
        String nombreLibro = buffer.nextLine();

        for (Libro libro : libros) {

            if (nombreLibro.equals(libro.getTitulo()) && libro.getEstado().equals(Estado.NO_DISPONIBLE)) {

                libro.setSocio(new Socio(null));
                libro.setEstado(Estado.DISPONIBLE);
                libro.setFechaPrestado(null);

                System.out.println("El socio devolvio el libro "
                        + libro.getTitulo() + " hoy, " + LocalDate.now());

            }
        }
    }

    public Biblioteca(ArrayList<Libro> libros, ArrayList<Socio> socios) {
        this.libros = libros;
        this.socios = socios;
    }
}

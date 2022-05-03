import java.time.LocalDate;

public class Matematica extends Libro {

    private final int cantSemanas = averiguarSemanas();
    private  int cantCapitulos;
    public int averiguarSemanas(){
        int cantSemanas = 0;
        if (cantCapitulos == 1){
            cantSemanas =1;
        }else {
            cantSemanas = 3;
        }
       return cantSemanas;
    }

    public int getCantSemanas() {
        return cantSemanas;
    }

    public int getCantCapitulos() {
        return cantCapitulos;
    }

    public void setCantCapitulos(int cantCapitulos) {
        this.cantCapitulos = cantCapitulos;
    }

    @Override
    public void tiempoPrestamoTotal() {
        System.out.println("El tiempo de prestamo permitido es de " + this.cantSemanas + " semanas");
    }

    public Matematica(String titulo, int ISBN, int cantCapitulos, Estado estado, LocalDate fechaPrestado, Socio socio, int cantCapitulos1) {
        super(titulo, ISBN, cantCapitulos, estado, fechaPrestado, socio);
        this.cantCapitulos = cantCapitulos1;
    }

    @Override
    public void tiempoPrestamoRestante() {
        return;
    }
}

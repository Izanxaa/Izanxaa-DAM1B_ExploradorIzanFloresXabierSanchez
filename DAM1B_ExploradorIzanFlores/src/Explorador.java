import Clases.Posicion;

import java.util.Random;

public class Explorador {
    private String nombre;
    private Clases.Posicion posicionActual;

    public static final int ARRIBA = 1;
    public static final int ABAJO = 2;
    public static final int DERECHA = 3;
    public static final int IZQUIERDA = 4;

    // Constructor
    public Explorador(String nombre){
        this.nombre = nombre;
        Random random = new Random();
        // Primera columna y fila aleatoria
        this.posicionActual = new Posicion(random.nextInt(6), 0);
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public Posicion getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Posicion posicionActual) {
        this.posicionActual = posicionActual;
    }

    // metodo moverse, me he decantado por hacer un switch porque me parecia la opcion de bucle mas sencilla y facil de ver para este caso

    public void moverse(int direccion) {
        switch (direccion) {
            case ARRIBA = {
                    if ( >)
            }
        }
    }
}

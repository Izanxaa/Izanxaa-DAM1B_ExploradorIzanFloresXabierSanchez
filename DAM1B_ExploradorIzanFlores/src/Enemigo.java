import Clases.Posicion;

import java.util.Random;

    public class Enemigo {
        private Clases.Posicion posicionActual;

        public static final int ARRIBA = 1;
        public static final int ABAJO = 2;
        public static final int DERECHA = 3;
        public static final int IZQUIERDA = 4;

        // Constructor
        public Enemigo(Clases.Posicion posicion){
            this.posicionActual = posicion;
        }

        // Getters y setters

        public void setPosicionActual(Posicion posicionActual) {
            this.posicionActual = posicionActual;
        }

        public Posicion getPosicionActual() {
            return posicionActual;
        }

        // Metodo moverse

        public void moverse (int direccion) {

        }

    }

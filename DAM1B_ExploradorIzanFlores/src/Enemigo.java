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
            /*En este caso he decidido hacer la funcion con un array, el primero es arriba por lo tanto debemos restarle
            uno a la fila, el siguiente es abajo por lo que sumamos una fila, el siguiente es derecha por lo que sumamos
            una columna y el ultimo es izquierda por lo que restamos una columna*/
            int [][] movimientos = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};

            // Comprobamos que la direccion este entre nuestras opciones
            if (direccion >= 1 && direccion <= 4) {
                int modificadoX = movimientos[direccion -1][0];
                int modificadoY = movimientos[direccion -1][1];

                int nuevaX = posicionActual.getCoordenadaFila() + modificadoX;
                int nuevaY = posicionActual.getCoordenadaCol() + modificadoY;

                // verificamos que no nos salgamos de los limites del mapa

                if (nuevaX >= 0 && nuevaX < 20 && nuevaY >= 0 && nuevaY < 6) {
                    posicionActual.setCoordenadaFila(nuevaX);
                    posicionActual.setCoordenadaCol(nuevaY);
                }
            }
        }

    }

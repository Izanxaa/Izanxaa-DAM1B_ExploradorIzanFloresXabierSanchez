import Clases.Posicion;

import java.util.Random;

public class Mapa {
    private char[][] tablero = new char[6][20]; // Tablero 6x20
    private Clases.Posicion posTesoro;                // Posición del tesoro
    private Clases.Posicion posJugador;               // Posición del jugador
    private Clases.Posicion[] posicionesEnemigos = new Clases.Posicion[3]; // Posiciones de enemigos
    private Clases.Posicion[] posicionesTrampas = new Clases.Posicion[3];  // Posiciones de trampas

    // Constructor
    public Mapa() {
        // Inicializar el tablero con espacios vacíos (' ')
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 20; j++) {
                tablero[i][j] = ' ';
            }
        }

        Random random = new Random();

        // Colocar al jugador
        posJugador = new Clases.Posicion(random.nextInt(6), random.nextInt(20));
        tablero[posJugador.getCoordenadaFila()][posJugador.getCoordenadaCol()] = 'J';

        // Colocar enemigos
        for (int i = 0; i < posicionesEnemigos.length; i++) {
            Posicion posicionEnemigo;
            do {
                posicionEnemigo = new Posicion(random.nextInt(6), random.nextInt(20));
            } while (!esPosicionLibre(posicionEnemigo));
            posicionesEnemigos[i] = posicionEnemigo;
            tablero[posicionEnemigo.getCoordenadaFila()][posicionEnemigo.getCoordenadaCol()] = 'E';
        }

        // Colocar trampas
        for (int i = 0; i < posicionesTrampas.length; i++) {
            Posicion posicionTrampa;
            do {
                posicionTrampa = new Posicion(random.nextInt(6), random.nextInt(20));
            } while (!esPosicionLibre(posicionTrampa));
            posicionesTrampas[i] = posicionTrampa;
            tablero[posicionTrampa.getCoordenadaFila()][posicionTrampa.getCoordenadaCol()] = 'T';
        }

        // Colocar el tesoro
        do {
            posTesoro = new Posicion(random.nextInt(6), random.nextInt(20));
        } while (!esPosicionLibre(posTesoro));
        tablero[posTesoro.getCoordenadaFila()][posTesoro.getCoordenadaCol()] = 'T';
    }

    // Verificar si una posición está libre
    private boolean esPosicionLibre(Posicion posicion) {
        return tablero[posicion.getCoordenadaFila()][posicion.getCoordenadaCol()] == ' ';
    }

    // Mostrar el tablero
    public void mostrar() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Getters
    public char[][] getTablero() {
        return tablero;
    }

    public Posicion getPosTesoro() {
        return posTesoro;
    }

    public Posicion getPosJugador() {
        return posJugador;
    }

    public Posicion[] getPosicionesEnemigos() {
        return posicionesEnemigos;
    }

    public Posicion[] getPosicionesTrampas() {
        return posicionesTrampas;
    }
}

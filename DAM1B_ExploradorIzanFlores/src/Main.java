import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Creo el mapa
        Mapa mapa = new Mapa();
        boolean juegoTerminado = false;

        System.out.println("**************************************");
        System.out.println("Bienvenido al juego del explorador");
        System.out.println("**************************************");

        while (!juegoTerminado) {
            // Muestra el mapa
            mapa.mostrar();

            // Debajo del mapa mostramos las instrucciones
            System.out.println("\nW = Arriba    A = Izquierda    S = Abajo    D = Derecha");
            System.out.println("¿Que accion quieres realizar?");

            // Leer opcion del jugador
            // El comando toUpperCase hace que la cadena de texto, en este caso 1 caracter este en mayusculas
            // Y el comando charAt0 extrae el primer caracter
            char accionJugador = scanner.nextLine().toUpperCase().charAt(0);

            // Mover al jugador
            Explorador.moverse(accionJugador,mapa);
        }
    }
}
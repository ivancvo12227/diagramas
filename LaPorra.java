import java.util.Scanner;

public class LaPorra {

    public static void main(String[] args) {
        // Declaramos las variables
        int maxNumeros;
        int numSorteo;
        int[] numerosJugadores;

        // Pedimos al usuario los datos necesarios
        Scanner sc = new Scanner(System.in);
        System.out.println("Juego de la porra");

        // Pedimos el número máximo de números
        do {
            System.out.println("Introduce el número máximo de números (mínimo 24, máximo 50):");
            maxNumeros = sc.nextInt();
        } while (maxNumeros < 24 || maxNumeros > 50);

        // Pedimos el número de jugadores
        System.out.println("¿Cuántos jugadores van a jugar? (mínimo 2, máximo 50):");
        numJugadores = sc.nextInt();

        // Generamos los números de los jugadores
        numerosJugadores = new int[numJugadores];
        for (int i = 0; i < numJugadores; i++) {
            numerosJugadores[i] = (int) (Math.random() * maxNumeros + 1);
        }

        // Realizamos el sorteo
        numSorteo = (int) (Math.random() * maxNumeros + 1);

        // Comprobamos los ganadores
        int ganadores = 0;
        for (int i = 0; i < numJugadores; i++) {
            if (numerosJugadores[i] == numSorteo) {
                ganadores++;
            }
        }

        // Mostramos los resultados
        if (ganadores == 1) {
            System.out.println("El ganador es el jugador " + (ganadores + 1));
        } else if (ganadores > 1) {
            System.out.println("Han ganado " + ganadores + " jugadores");
            for (int i = 0; i < numJugadores; i++) {
                if (numerosJugadores[i] == numSorteo) {
                    System.out.println("El jugador " + (i + 1) + " ha ganado");
                }
            }
        } else {
            System.out.println("No hay ganadores");
        }
    }
}
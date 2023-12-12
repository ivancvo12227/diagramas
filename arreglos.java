import java.util.Arrays;
import java.util.Scanner;

public class arreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo1, arreglo2, arreglo3;
        int n = 0, opcion = 0;


        while (opcion != 2) {
            //Menu para el usuario
            System.out.println("""
                
                -----MENU-----
                1. Ingresar arreglos para uso del algoritmo.
                2. Salir""");
            try {
                System.out.println("Escoja una opcion por favor: ");
                //Opcion del menu
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1 -> {
                        boolean validInput = false;
                        while (!validInput) {
                            //Digitar el tamaño de los 2 arreglos
                            try {
                                System.out.println("Por favor digita de que tamaño desee los arreglos: ");
                                n = Integer.parseInt(sc.nextLine());
                                if (n < 1) {
                                    System.out.println("Tienes que poner un numero positivo.");
                                } else {
                                    validInput = true;
                                }
                            } catch (NumberFormatException nfe) {
                                System.out.println("Digita un numero correcto");
                            }
                        }
                        //Digitar los numeros que contenga el primer arreglo
                        arreglo1 = new int[n];
                        System.out.println("Digita los numeros del primer arreglo: ");
                        boolean validInput2 = false;
                        while (!validInput2) {
                            try {
                                for (int i = 0; i < n; i++) {
                                    System.out.println("Numero: " + (i + 1));
                                    arreglo1[i] = Integer.parseInt(sc.nextLine());
                                }
                                validInput2 = true;
                            } catch (NumberFormatException nfe) {
                                System.out.println("Digita un numero correcto");
                                System.out.println("Digita los numeros del primer arreglo de nuevo por favor.");
                            }
                        }
                        //Digitar los numeros que contengan el segundo arreglo
                        arreglo2 = new int[n];
                        System.out.println("Digita los numeros del segundo arreglo: ");
                        boolean validInput3 = false;
                        while (!validInput3) {
                            try {
                                for (int i = 0; i < n; i++) {
                                    System.out.println("Numero: " + (i + 1));
                                    arreglo2[i] = Integer.parseInt(sc.nextLine());
                                }
                                validInput3 = true;
                            } catch (NumberFormatException nfe) {
                                System.out.println("Digita un numero correcto");
                                System.out.println("Digita los numeros del segundo arreglo de nuevo por favor.");
                            }
                        }
                        //Algoritmo para crear el tercer areglo
                        arreglo3 = new int[n];
                        for (int i = 0; i < n; i++) {
                            arreglo3[i] = arreglo1[i] * arreglo2[n - (i + 1)];
                        }
                        //Imprimir los arreglos
                        System.out.println("Este es el arreglo 1: " + Arrays.toString(arreglo1) +
                                "\nEste es el arreglo 2: " + Arrays.toString(arreglo2) +
                                "\nEste es el arreglo resultante: " + Arrays.toString(arreglo3));
                    }
                    //Opcion por si el usuario desea salir
                    case 2 -> System.out.println("Saliendo...");
                    default -> System.out.println("Elige una opcion correcta.");
                }
            } catch(NumberFormatException nfe){
                System.out.println("Digite una opcion correcta.");
            }
        }
    }
}

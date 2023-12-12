import java.util.HashMap;
import java.util.Random;
import java.util.Map;
import java.util.Scanner;

public class Juego_de_Dados_13Caras {
    public static void main(String[] args) {
        /*
         * 13 jqk baraja  
         *                      A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P        
         * tomar lo numeros del 1,2,3,4,5,6,7,8,9-10-10-10-10
         * jqk valen 10 (Ya)
         * 
         * condicion 1: si saca doble uno, GANA
         * condicion 2: si saca una letra y el 1, GANA
         * condicion 3: si saca lertra y 2, REPITE
         * condicion 4: cualquira que de 14, MEDIOGANA
         * condicion 5: Al precionar 9 salir (HECHO)
         * condicion 6: Que me genere un valor aleatorio (HECHO)
         */
        //Creamos nuestro diccionario de objeto de HashMap
        Map<String, Integer> diccionarioDadoValores = new HashMap<>();
        Random random = new Random(); // Generamos nuestro objto random
        Random aletariedad = new Random();
        Scanner ingreso = new Scanner(System.in); // Generamos nuestro objeto Scanner para ingresar texto por teclado
        
        // Creamos una variable boolean donde va a verificar que es la primera partida
        boolean esPrimertirada = true;
        int puntopartida = 0, numeroJugadas; // dos variables una para guardar el numero de partidas y la otra va a ser un contador de una sumatoria a evaluar
        
        // Agregamos elementos al nuestro diccionario diccionario(clave, valor)
        diccionarioDadoValores.put("Carta AA", 11);
        diccionarioDadoValores.put("Carta A", 1);
        diccionarioDadoValores.put("Carta 2", 2);
        diccionarioDadoValores.put("Carta 3", 3);
        diccionarioDadoValores.put("Carta 4", 4);
        diccionarioDadoValores.put("Carta 5", 5);
        diccionarioDadoValores.put("Carte 6", 6);
        diccionarioDadoValores.put("Carta 7", 7);
        diccionarioDadoValores.put("Carte 8", 8);
        diccionarioDadoValores.put("Carta 9", 9);
        diccionarioDadoValores.put("Carta 10", 10);
        diccionarioDadoValores.put("Carta J", 10);
        diccionarioDadoValores.put("Carta Q", 10);
        diccionarioDadoValores.put("Carta K", 10);

        System.out.println("JUEGO DE DADOS con 13 caras");
        System.out.println("-----------------------------\n");
        
        int finalizacionBucleWhile; //Variable para evaluar la finalizacion del juego
        System.out.print("Si quieres comenzar el juego ¡NO! PRESIONES EL NUMERO 9: ");
        finalizacionBucleWhile = ingreso.nextInt(); // Ingresamos por texto utilizando el objeto Scanner

        while (finalizacionBucleWhile != 9) { // Evaluar si el numero que preciose es diferente que 9

            System.out.println("Ingrese el el numero de lanzadas que quiere hacer");
            numeroJugadas = ingreso.nextInt();
            
            for (int i = 1; i < numeroJugadas + 1; i++) { // Recorre el numero de lanzamientos
                System.out.println("PARTIDA: " + i);
                
                //Imprimir aleaatoriamente un contenido del diccionario
                //System.out.println("\nImprimiendo aleatoriamente un contenido del diccionario:");
                //imprimirContenidoAleatorio(diccionarioDadoValores);

                // Imprmimos aleatoriamente el valor del nuestra lista utilizando un metodo
                System.out.println("\n Imprimiendo aleatoriamente el valor del diccionario:");
                imprimirValorAleatorio(diccionarioDadoValores);

                // Asignamos el mismo metodo a dos variables carta 1 y carta 2
                int carta1 = imprimirValorAleatorio(diccionarioDadoValores); // Esto me deberia imprimir un valor al azar del diccionario actual
                int carta2 = imprimirValorAleatorio(diccionarioDadoValores); // Esto me deberia imprimir un valor al azar del diccionario actual

                int sumados = carta1 + carta2;
                System.out.println("carta 1: "+carta1);
                System.out.println("carta 2: "+carta2);
                System.out.println("\nsumatoria de cartas aleatorias: "+sumados+"");

                if (sumados == 14){
                    System.out.println("¡Medio Ganaste con 20 y medio!\n");
                    break;
                }else if (sumados == 20 || sumados == 2){
                    System.out.println("Ganaste\n");
                    break;
                }else if(sumados==12){
                    System.out.println("Cambio de juego");
                }else if(sumados==3||sumados==4||sumados==5||sumados==6||sumados==7||sumados==8||
                    sumados==9||sumados==10||sumados==11||sumados==13||sumados==15||
                    sumados==16||sumados==17||sumados==18||sumados==19){
                    System.out.println("Nos has cumplido con las normas del juego PERDISTE POR MALO");
                }
                System.out.println();
            }
            System.out.print("¿Quieres continuar el juego? ¡NO! PRESIONES EL NUMERO 9: ");
            finalizacionBucleWhile = ingreso.nextInt();
            System.out.println();
            
        }
        System.out.println("FUERA DEL JUEGO");
    }
    // Metoo para imrpimir aleatoriamente un contenido del diccionario
    private static void imprimirContenidoAleatorio(Map<String, Integer> diccionarioAleato){
        Random randomDentro = new Random(); // Creamos otro objeto random para que nos genere elementos al azar

        // Obtenemos una lista de las llavves y seleccionamos una al azar
        Object[] listaDeLlaves = diccionarioAleato.keySet().toArray();

        // Guardamos en una variable en nuestra lista de llaves pero dentro utilizamos el random para generar algo aleatorio
        String llaveAleatoria = (String) listaDeLlaves[randomDentro.nextInt(listaDeLlaves.length)];

        // Imprimimos la llave aleatoria y el valor asociado
        System.out.println(llaveAleatoria + ": " + diccionarioAleato.get(llaveAleatoria));

    }

    private static int imprimirValorAleatorio(Map<String, Integer> dicvalorAleatorio){
        Random ValorAlea = new Random(); // Creamos un random que es el que nos servira para darnos un valor aleatorio
        
        //Obtenemos una lista de valores y selecionamos una al azar
        Object[] listaDeValores = dicvalorAleatorio.values().toArray();


        // Guardamos en una variable los valores que obtuvimos de nuestro diccionario y utilizamos un random para que nos genere un valor aleatorio
        int valoresAleatorios = (Integer) listaDeValores[ValorAlea.nextInt(listaDeValores.length)];

        // Buscamos la llave asociada al valor correspondiente
        String llavePerteneciente = null;
        for (Map.Entry<String, Integer> entry: dicvalorAleatorio.entrySet()){
            if (entry.getValue().equals(valoresAleatorios)){
                llavePerteneciente = entry.getKey();
                break;
            }
        }        
        // Imprimimos la llave aleatorio y el valor asociado
        //System.out.println("valor: "+valoresAleatorios+", llave: "+ llavePerteneciente);
        return valoresAleatorios;
    }
}
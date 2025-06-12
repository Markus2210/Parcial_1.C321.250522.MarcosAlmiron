/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AgenciaEspacial agencia = new AgenciaEspacial();
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE GESTION DE EXPEDICIONES ESPACIALES---");
            System.out.println("1.Agregar nave (Exploracion, Carguero o Crucero Estelar) ");
            System.out.println("2.Mostrar todas las naves registradas");
            System.out.println("3.Iniciar mision de exploracion");
            System.out.println("4.Mostrar naves ordenadas por nombre");
            System.out.println("5.Mostrar naves ordenadas por anio de lanzamiento descendente");
            System.out.println("6.Mostrar naves ordenadas por capacidad de tripulacion descendente ");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = leerEntero(sc);

            switch (opcion) {
                case 1:
                    agregarNave(sc, agencia);
                    break;
                case 2:
                    agencia.mostrar();
                    break;
                case 3:
                    agencia.iniciarExploracion();
                    break;
                case 4:
                    Collections.sort(agencia.naves);
                    agencia.mostrar();
                    break;
                case 5:
                    Collections.sort(agencia.naves, new ComparadorAniLanzamientoDesc());
                    agencia.mostrar();
                    break;
                case 6:
                    Collections.sort(agencia.naves, new ComparadorCapacidadTripulacionDesc());
                    agencia.mostrar();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 7);
    }

    private static void agregarNave(Scanner sc, AgenciaEspacial agencia) {
        System.out.println("---Tipo de nave---\n1.Exploracion\n2.Carguero\n3.Crucero Estelar");
        int tipo = leerEntero(sc);

        System.out.println("Nombre de la nave: ");
        String nombre = sc.nextLine();
        if (nombre.isEmpty()) {
            System.out.println("Nombre invalido.");
            return;
        }
        System.out.println("Año de lanzamiento: ");
        int anio = leerEntero(sc);
        if (anio < 0) {
            System.out.println("Anio invalido.");
            return;
        }

        System.out.println("Capacidad de Triupulacion: ");
        int tripulacion = leerEntero(sc);

        switch (tipo) {
            case 1:
                String mision;
                while (true) {
                    System.out.println("-Tipo de Mision (CARTOGRAFIA | INVESTIGACION | CONTACTO): ");
                    mision = sc.nextLine().toUpperCase();
                    if (mision.equals("CARTOGRAFIA") || mision.equals("INVESTIGACION") || mision.equals("CONTACTO")) {
                        break;
                    } else {
                        System.out.println("Misión inválida. Intente nuevamente.");
                    }
                }
                agencia.agregarNave(new Exploracion(mision, nombre, tripulacion, anio));
                break;
            case 2:
                System.out.println("Capacidad de carga(100-500): ");
                int carga = sc.nextInt();
                agencia.agregarNave(new Carguero(carga, nombre, tripulacion, anio));
                break;
            case 3:
                System.out.println("Cantidad de pasajeros: ");
                int pasajeros = sc.nextInt();
                agencia.agregarNave(new CrucerosEstelares(pasajeros, nombre, tripulacion, anio));
                break;
            default:
                System.out.println("Tipo invalido");

        }
    }

    private static int leerEntero(Scanner sc) {
        while (true) {
            if (sc.hasNextInt()) {
                int numero = sc.nextInt();
                sc.nextLine();
                return numero;
            } else {
                System.out.print("Ingrese un número válido: ");
            }
        }
    }
}

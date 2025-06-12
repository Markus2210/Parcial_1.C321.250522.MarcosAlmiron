/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author marco
 */
public class Carguero extends Nave implements Explorable {

    private final int CAPACIDADMIN = 100;
    private final int CAPACIDADMAX = 500;

    public int capacidadCarga;

    public Carguero(int capacidadCarga, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
//         if(capacidadCarga < CAPACIDADMIN){
//            capacidadCarga = CAPACIDADMIN;
//        }else if(capacidadCarga > CAPACIDADMAX){
//            capacidadCarga = CAPACIDADMAX;
//        }

        this.capacidadCarga = capacidadCarga;
        carga(capacidadCarga);

    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    private void carga(int capacidadCarga1) {
        if (capacidadCarga < CAPACIDADMIN) {
            capacidadCarga = CAPACIDADMIN;
        } else if (capacidadCarga > CAPACIDADMAX) {
            capacidadCarga = CAPACIDADMAX;
        }
    }

    @Override
    public void explorar() {
        System.out.println(this.getNombre() + " --> Iniciando Exploracion!!");
    }

    @Override
    public void mostrarNaves() {
        System.out.println("Carguero: " + getNombre() + " | Tripulacion: " + getCapacidadTripulacion() + " | Año de Lanzamiento: " + getAnioLanzamiento() + " | Carga: " + getCapacidadCarga());
    }

    @Override
    public String toString() {
        return "Carguero{" + "capacidadCarga=" + capacidadCarga + '}';
    }

}

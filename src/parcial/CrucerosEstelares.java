/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author marco
 */
public class CrucerosEstelares extends Nave{
    private int cantidadPasajeros;

    public CrucerosEstelares(int cantidadPasajeros, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

     @Override
     public void mostrarNaves(){
         System.out.println("Crucero: " + getNombre() + " | Tripulacion: " + getCapacidadTripulacion() + " | Año de Lanzamiento: " + getAnioLanzamiento() + " | Pasajeros: " + getCantidadPasajeros());
     }
    
    @Override
    public String toString() {
        return "CrucerosEstelares{" + "cantidadPasajeros=" + cantidadPasajeros + '}';
    }
    
    
    
    
}

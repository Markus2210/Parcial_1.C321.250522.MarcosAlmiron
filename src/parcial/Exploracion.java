/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author marco
 */
public class Exploracion extends Nave implements Explorable {
    private String tipoMision;

    public Exploracion(String tipoMision, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.tipoMision = tipoMision;
    }

    public String getTipoMision() {
        return tipoMision;
    }

    
    
    @Override
    public void explorar(){
        System.out.println("Iniciando Exploracion!!");
    }
    
    @Override
     public void mostrarNaves(){
         System.out.println("Exploracion " + getNombre() + " ,Tripulacion: " + getCapacidadTripulacion() + " | Año: " + getAnioLanzamiento() + ", Mision: " + getTipoMision());
     }
    
    @Override
    public String toString() {
        return "Exploracion{" + "tipoMision=" + tipoMision + '}';
    }
    
    
    
}

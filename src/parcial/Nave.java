/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

import java.util.Objects;

/**
 *
 * @author marco
 */
public abstract class Nave implements Comparable<Nave> {
    private String nombre;
    private int capacidadTripulacion;
    private int anioLanzamiento;

    public Nave(String nombre, int capacidadTripulacion, int anioLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadTripulacion() {
        return capacidadTripulacion;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }
    
    public abstract void mostrarNaves();

  
    @Override
    public int compareTo(Nave nave){
        return this.nombre.compareToIgnoreCase(nave.getNombre());
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Nave other = (Nave) obj;
        
        return getNombre().equals(other.getNombre())
                && getAnioLanzamiento() == other.getAnioLanzamiento();
    }
    
    
    
     
}

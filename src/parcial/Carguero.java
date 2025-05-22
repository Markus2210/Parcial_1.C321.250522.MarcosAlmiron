/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author marco
 */
public class Carguero extends Nave implements Explorable{
    private int capacidadCarga;

    public Carguero(int capacidadCarga, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        if(capacidadCarga < 100){
            capacidadCarga = 100;
        }else if(capacidadCarga > 500){
            capacidadCarga = 500;
        } 
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    
    @Override
    public void explorar(){
        System.out.println("Iniciando Exploracion!!");
    }
    
     @Override
     public void mostrarNaves(){
         System.out.println("Carguero " + getNombre() + " ,Tripulacion: " + getCapacidadTripulacion() + " ,Año: " + getAnioLanzamiento() + " ,Carga: " + getCapacidadCarga() );
     }
    
    
    @Override
    public String toString() {
        return "Carguero{" + "capacidadCarga=" + capacidadCarga + '}';
    }
    
    
    
     
    
}

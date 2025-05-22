/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

import java.util.Comparator;

/**
 *
 * @author marco
 */
public class ComparadorPorNombre implements Comparator<Nave>{
    @Override
    public int compare(Nave o1, Nave o2){
        return o1.getNombre().compareTo(o2.getNombre());
    }
    
}

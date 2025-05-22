/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marco
 */
public class AgenciaEspacial {

    List<Nave> naves = new ArrayList();

    public boolean naveExiste(Nave nave) {
        for (Nave n : naves) {
            if (n.getNombre().equals(nave.getNombre())
                    && n.getAnioLanzamiento() == nave.getAnioLanzamiento()) {
                return true;
            }
        }
        return false;
    }
    
    public void agregarNave(Nave nave){
        if(naveExiste(nave)){
            System.out.println(nave.getNombre() + " ya se encuenra registrada");
        }else {
            naves.add(nave);
            System.out.println(nave.getNombre() + " registrada exitosamente");
        }
    }
    
    public void mostrar(){
        for(Nave n : naves){
            n.mostrarNaves();
        }
    }
    
    public void iniciarExploracion(){
        System.out.println("Inicializando Exploracion");
        for(Nave nave : naves){
            if(nave instanceof Explorable){
                ((Explorable)nave).explorar();
            }else {
                System.out.println(nave.getNombre() + " no puede realizar la Exploracion porque es un Crucero");
            }
        }
    }
    
    
}

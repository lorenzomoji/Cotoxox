
package org.lasencinas.cotxox;

import java.util.ArrayList;
import java.util.Random;
import org.lasencinas.cotxox.Conductor;

public class PoolConductores {
    
    private ArrayList<Conductor> poolConductores = new ArrayList<>();
    
    public PoolConductores(ArrayList<Conductor> poolConductores) {
        this.poolConductores = poolConductores;
    }
    
    public ArrayList<Conductor> getPoolConductores() {
        return this.poolConductores;
    }
    
    public Conductor asignarConductor() {
        Conductor conductor = new Conductor();
        Random aleatorio = new Random();
        boolean asignado = false;
        while(asignado = false) {
            int index = aleatorio.nextInt(getPoolConductores().size());
            conductor = getPoolConductores().get(index);
            if (!conductor.isOcupado()) {
                conductor.setOcupado(true);
                asignado = true;
            }
        }
        return conductor;
    }
    
}


package org.lasencinas.cotxox;

import org.lasencinas.cotxox.Carrera;

public class Tarifa {
    
    final static double costeMilla = 1.35;
    final static double costeMinuto = 0.35;
    final static double costeMinimo = 5.00;
    final static double porcentajeComision = 0.20;
    
    public static double getCosteDistancia(double distancia) {
        
        return distancia*costeMilla;
        
    }
    
    public static double getCosteMinuto(double minuto) {
        
        return minuto*costeMinuto;
    }
    
    public static double getCosteTotalEsperado(Carrera carrera) {
        
        double costeTotal = getCosteDistancia(carrera.getDistancia() + getCosteMinuto(carrera.getTiempoEsperado()));
        return costeTotal;
    }
    
}

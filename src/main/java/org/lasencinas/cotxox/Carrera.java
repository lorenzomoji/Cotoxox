
package org.lasencinas.cotxox;

import org.lasencinas.cotxox.Conductor;
import org.lasencinas.cotxox.PoolConductores;
import org.lasencinas.cotxox.Tarifa;

public class Carrera {
    
    
    //Atributos
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private int costeTotal = 0;
    private String conductor = null;
    private String origen = null;
    private String destino = null;
    private String tarjetaCredito = null;
    private double distancia = 0;
    
    //Setters & Getters
    
    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    } 
    
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }
    
    public int getTiempoEsperado() {
        return this.tiempoEsperado;
    }
    
    public int getTiempoCarrera() {
        return this.tiempoCarrera;
    }
    
    public int getCosteTotal() {
        return this.costeTotal;
    }
    
    public String getConductor() {
        return this.conductor;
    }
    
    public String getOrigen() {
        return this.origen;
    }
    
    public String getDestino() {
        return this.destino;
    }
    
    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }
    
    public double getDistancia() {
        return this.distancia;
    }
    
    public double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado(this);
    }
    

    
}

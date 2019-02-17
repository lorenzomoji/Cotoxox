
package org.lasencinas.cotxox;


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
    
    public Carrera(int tiempoEsperado, int tiempoCarrera, int costeTotal, String conductor, String origen, String destino, String tarjetaCredito, double distancia) {
        this.tiempoEsperado = tiempoEsperado;
        this.tiempoCarrera = tiempoCarrera;
        this.costeTotal = costeTotal;
        this.conductor = conductor;
        this.origen = origen;
        this.destino = destino;
        this.tarjetaCredito = tarjetaCredito;
        this.distancia = distancia;
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
    

    
}

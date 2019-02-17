
package org.lasencinas.cotxox;

import java.util.ArrayList;


public class Conductor {
    
    private String nombre = null;
    private String modelo = null;
    private String matricula = null;
    private double valoracionMedia = 0;
    private ArrayList<Integer> valoraciones = new ArrayList<>();
    private boolean ocupado = false;
    
    public Conductor(){};
    public Conductor(String nombre){
        this.nombre = nombre;
    }; //Sobrecargamos con un diferente atributo
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public String getMatricula () {
        return this.matricula;
    }
    
    public void setValoracion(int valoracion) {
        this.valoraciones.add(valoracion);
        this.calcularValoracionMedia();
    }
    
    public double getValoracion() {
        return this.valoracionMedia;
    }
    
    public double calcularValoracionMedia() {
        int sumaValoracion = 0;
        for (int i = 0; i < valoraciones.size(); i++) {
            sumaValoracion += valoraciones.get(i);
        }
        this.valoracionMedia = sumaValoracion / this.valoraciones.size();
        return this.valoracionMedia;
    }
    
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    public boolean isOcupado() {
        return this.ocupado;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viajes;

/**
 *
 * @author Diana
 */
public class aviones {
    private String matricula;
    private int capacidad_max;
    private int horas_de_vuelo;
    private String tipo;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCapacidad_max() {
        return capacidad_max;
    }

    public void setCapacidad_max(int capacidad_max) {
        this.capacidad_max = capacidad_max;
    }

    public int getHoras_de_vuelo() {
        return horas_de_vuelo;
    }

    public void setHoras_de_vuelo(int horas_de_vuelo) {
        this.horas_de_vuelo = horas_de_vuelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}

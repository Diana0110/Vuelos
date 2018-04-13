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
public class vuelos {
    private String identificador;
    private String aeropuesto_origen;
    private String aeropuesto_destino;
    private String fecha;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getAeropuesto_origen() {
        return aeropuesto_origen;
    }

    public void setAeropuesto_origen(String aeropuesto_origen) {
        this.aeropuesto_origen = aeropuesto_origen;
    }

    public String getAeropuesto_destino() {
        return aeropuesto_destino;
    }

    public void setAeropuesto_destino(String aeropuesto_destino) {
        this.aeropuesto_destino = aeropuesto_destino;
    }
    
}

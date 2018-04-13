/*
 * 
To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package viajes;

import java.util.ArrayList;

/**
 *
 * @author Diana
 */
public class aeropuertos {
    private String ciudad;
    private String pais;
    private String siglas_unicas;
    private ArrayList <aviones> aviones_disponibles = new ArrayList();

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSiglas_unicas() {
        return siglas_unicas;
    }

    public void setSiglas_unicas(String siglas_unicas) {
        this.siglas_unicas = siglas_unicas;
    }

    public ArrayList<aviones> getAviones_disponibles() {
        return aviones_disponibles;
    }

    public void agregar_aviones(aviones avion) {
        this.aviones_disponibles.add(avion);
    }
}
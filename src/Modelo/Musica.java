
package Modelo;

import modelo.*;

import javax.swing.JTextField;

/**
 *
 * Variables, getters, setters.
 * 
 * @author David
 */
public class Musica {
    
    private String id;
    private String nombre;
    private String artista;
    private String estilo;
    private String cdvinilo;
    private String precio;

    public Musica() {
    }
    
    public Musica(String id, String nombre, String artista, String estilo, String cdvinilo, String precio) {
        this.id = id;
        this.nombre = nombre;
        this.artista = artista;
        this.estilo = estilo;
        this.cdvinilo = cdvinilo;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getCdvinilo() {
        return cdvinilo;
    }

    public void setCdvinilo(String cdvinilo) {
        this.cdvinilo = cdvinilo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    

    
}


package Controlador;

import Modelo.ConexionSQL;
import Modelo.Musica;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import vista.*;

/**
 *
 * @author David
 */
public class Control {
    ConexionSQL con=new ConexionSQL();
    
    /*
        Método insertar: retorna los campos introducidos desde los jTextField de la intterfaz.
        Con el objeto de la clase ConexionSQL, llamo al método .insertar, el cual va a insertar los campos a la Base de Datos.
    */
    public Musica insertar(String id,String nombre,String artista,String estilo,String tipo,String precio){
        Musica musicaAinsertar=new Musica();
        musicaAinsertar.setId(id);
        musicaAinsertar.setNombre(nombre);
        musicaAinsertar.setArtista(artista);
        musicaAinsertar.setEstilo(estilo);
        musicaAinsertar.setCdvinilo(tipo);
        musicaAinsertar.setPrecio(precio);
        
        con.insertar(musicaAinsertar);
        
        return musicaAinsertar;
    }

    /*
        Este método, retorna la llamada al método "mostrarTabla" del la clase ConexionSQL.
    */
    public DefaultTableModel mostrarTable(){
        return con.mostrarTabla();
    }
    
    
    

    
}

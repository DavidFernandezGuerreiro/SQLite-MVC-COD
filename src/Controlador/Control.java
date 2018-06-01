
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
    
//    public void hola(){
//        try {
//            Object datos[]=new Object[6];
//            
//            while(con.miResultSet.next()){
//                for(int i=0;i<6;i++){
//                    datos[i]=con.miResultSet.getObject(i+1);
//                }
//                modeloTabla.addRow(datos);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
//    DefaultTableModel modeloTabla=new DefaultTableModel(null,getColumnas());
//    
//    public String[] getColumnas(){
//        String columna[]=new String[]{"ID","NOMBRE","ARTISTA","ESTILO","CD/VINILO","PRECIO"};
//        return columna;
//    }
//    

    
}

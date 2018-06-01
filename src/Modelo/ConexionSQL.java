
package Modelo;

import Controlador.Control;
import controlador.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class ConexionSQL {
    Connection miConexion=null;
    
    /*
        Creamos la conexión con la Base de Datos.
    */
    public Connection entrar(){
        try{
            miConexion=DriverManager.getConnection("jdbc:sqlite:tablavinilos.db");
            System.out.println("Conexión realizada con exito");
        }catch(Exception e){
            System.out.println("ERROR "+e);
        }
        return miConexion;
    }
    
    /*
        Cerramos la conexión con la Base de Datos.
    */
    public Connection close(){
        try {
            miConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return miConexion;
    }

    //Creamos la secuencia sql para insertar datos en la tabla "TablaMusica" en todos sus campos.
    //Recogemos los datos.
    //Y los ejecutamos.
    public Musica insertar(Musica musica){
        Control cont=new Control();
        entrar();
        try{
            PreparedStatement st=miConexion.prepareStatement("insert into TablaMusica (id, nombre, artista, estilo, cdvinilo, precio) values (?,?,?,?,?,?)");
            st.setString(1, musica.getId());
            st.setString(2, musica.getNombre());
            st.setString(3, musica.getArtista());
            st.setString(4, musica.getEstilo());
            st.setString(5, musica.getCdvinilo());
            st.setString(6, musica.getPrecio());
            st.execute();

        }catch(SQLException ex){
            System.out.println("No se puedo insertar los datos"+ex.getMessage());
        }
        close();
        return musica;   
    }
    
    
//    public ResultSet miResultSet = null;
//    public ResultSet mostrarTabla(){
////        borrarTabla(); //Meto el método "borrarTabla" para que se ejecute el método
//        entrar();
//        try{
//            String sql="select id,nombre,artista,estilo,cdvinilo,precio from TablaMusica";
//            PreparedStatement miStatement=entrar().prepareStatement(sql);
//            miResultSet=miStatement.executeQuery();
//            
////            Object datos[]=new Object[6];
////            
////            while(miResultSet.next()){
////                for(int i=0;i<6;i++){
////                    datos[i]=miResultSet.getObject(i+1);
////                }
////                obxControl.modeloTabla.addRow(datos);
////            }
//            miResultSet.close();
//            
//        }catch(Exception e){
//            System.out.println(e);
//        }
////        return obxControl.modeloTabla;
//        return miResultSet;
//    }

    
    
}

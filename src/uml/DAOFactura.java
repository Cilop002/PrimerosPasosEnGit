/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;
/**
 *
 * @author Cilop002
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

public class DAOFactura {
    Database db = new Database();
    public ArrayList<Object[]> listar(){
     ArrayList<Object[]> datos = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        ResultSetMetaData meta;
        String sql ="select * from factura";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPass());
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            meta = rs.getMetaData();
            while(rs.next()){
                Object[] fila = new Object[meta.getColumnCount()];
                for(int i=0; i< fila.length; i++){
                   fila[i]=rs.getObject(i+1);                    
                }
                datos.add(fila);                   
            }
            rs.close();
 
        } catch (Exception e) {
            
        }
        return datos;
    }
    
    
}

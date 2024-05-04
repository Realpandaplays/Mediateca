package Logico;
import java.sql.Connection;
import Clases.MaterialCDClases;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * @authors Laura Pineda
 * @authors DIEGO PADILLA
 */
public class MaterialCD {

    private Connection conexion;
    
    public MaterialCD(Connection conexion){
        this.conexion = conexion;
    }
    
    //insertar material
    
    public boolean MaterialCD (MaterialCDClases MaterialCD){
        boolean rowInserted = false;
        
        try {
            String sql = "INSERT INTO cd (idInterno, titulo, artista, genero"
                    + "duracion, numCanciones, uniDisp) "
                    + "VALUES (?,?,?,?,?,?,?)";
        java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
        
        statement.setString(1, MaterialCD.getidInterno());
        statement.setString(2, MaterialCD.gettitulo());
        statement.setString(3, MaterialCD.getartista());
        statement.setString(4, MaterialCD.getgenero());
        statement.setInt(5,MaterialCD.getduracion());
        statement.setInt(6,MaterialCD.getnumCanciones());
        statement.setInt(7,MaterialCD.getuniDisp());
        
        rowInserted = statement.executeUpdate() > 0;
        statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(MaterialCDClases.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowInserted;
    }
    
    /*localizar por Código Interno*/
    public boolean localizarMaterialCD (String idInterno){
        boolean encontrado = false;
        
        try {
            String sql = "SELECT * FROM cd WHERE idInterno = ?";
            try (java.sql.PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setString(1, idInterno);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        encontrado = true;
                    }
                }
            }
        } catch (SQLException ex) {
             Logger.getLogger(MaterialCD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return encontrado;
    }
    
    /*Seleccionar un material por su código*/
    public MaterialCDClases seleccionarMaterialCD (String idInterno){
        MaterialCDClases materialCD = null;
        
        try {
            String sql = "SELECT * FROM cd WHERE idInterno = ?";
            
            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, idInterno);

            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()){
                
                String id = resultSet.getString("idInterno");
                String titulo = resultSet.getString("titulo");
                String artista = resultSet.getString("artista");
                String genero = resultSet.getString("genero");
                int duracion = resultSet.getInt("duracion");
                int numCanciones = resultSet.getInt("numCanciones");
                int uniDisp = resultSet.getInt("uniDisp");
                
                materialCD = new MaterialCDClases (id, titulo, artista, duracion, genero, numCanciones, uniDisp);
            }
            resultSet.close();
            statement.close();
        }catch (SQLException ex) {
            Logger.getLogger(MaterialCD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materialCD;
    }
    
    /*Seleccionar todos los CDs*/
    public List<MaterialCDClases> Seleccionartodos() {
    List<MaterialCDClases> materialCDs = new ArrayList<>();
    
    try {
        String sql = "SELECT *FROM cd";
        
         Statement statement = conexion.createStatement();
         ResultSet resultSet = statement.executeQuery(sql);
         
         while(resultSet.next()){
             String idInterno = resultSet.getString("idInterno");
             String titulo = resultSet.getString("titulo");
             String artista = resultSet.getString("artista");
             String genero = resultSet.getString("genero");
             int duracion = resultSet.getInt("duracion");
             int numCanciones = resultSet.getInt("numCanciones");
             int uniDisp = resultSet.getInt("uniDisp");
             
             MaterialCDClases materialCD = new MaterialCDClases (idInterno, titulo, artista, duracion, genero, numCanciones, uniDisp);
             materialCD.add(materialCDs);
         }
            resultSet.close();
            statement.close();
            
    }catch (SQLException ex) {
            Logger.getLogger(MaterialLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materialCDs;
}
    /*Actualizar material libro*/
    public boolean ActualizarMaterialCD (MaterialCDClases MaterialCD){
        boolean rowUpdated = false;
        
        try {
            String sql = "UPDATE cd SET titulo = ?, "
                    + " autor = ?, numPaginas = ?, editorial = ?, ISBN = ?,"
                    + " yearPubli = ?, uniDispo = ?"
                    + " WHERE idInterno = ?";
            
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setString(1, MaterialCD.gettitulo());
                statement.setString(2, MaterialCD.getartista());
                statement.setString(3, MaterialCD.getgenero());
                statement.setInt(5, MaterialCD.getnumCanciones());
                statement.setInt(6, MaterialCD.getduracion());
                statement.setInt(7, MaterialCD.getuniDisp());
                
                statement.setString(8, MaterialCD.getidInterno());
                
                rowUpdated = statement.executeUpdate()>0;
            }
        }catch (SQLException ex) {
            Logger.getLogger(MaterialLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowUpdated;
    }
    
    /*Eliminar material Libro*/
    public boolean EliminarMaterialCD (String idInterno){
        boolean rowDeleted = false;
        
        try {
            String sql = "DELETE FROM cd WHERE idInterno = ?";

            try (java.sql.PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setString(1, idInterno);
                
                rowDeleted = statement.executeUpdate() > 0;
            }

        } catch (SQLException ex) {
            Logger.getLogger(MaterialLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowDeleted;
    }
}

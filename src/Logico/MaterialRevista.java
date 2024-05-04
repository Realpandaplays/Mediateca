package Logico;
import java.sql.Connection;
import Clases.MaterialRevistaClases;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura Pineda
 */
public class MaterialRevista {

    private Connection conexion;
    
    public MaterialRevista(Connection conexion){
        this.conexion = conexion;
    }
    
    //insertar material
    
    public boolean insertarMaterialRevista(MaterialRevistaClases MaterialRevista){
        boolean rowInserted = false;
        
        try{
            String sql = "INSERT INTO revistas (idInterno, titulo, editorial,"
                    +"periodisidad, fechaPubli, uniDispo) "
                    +"VALUES (?,?,?,?,?,?)";
                    
            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            
            statement.setString(1, MaterialRevista.getidInterno());
            statement.setString(2, MaterialRevista.gettitulo());
            statement.setString(3, MaterialRevista.geteditorial());
            statement.setString(4, MaterialRevista.getperiodicidad());
            statement.setString(5, MaterialRevista.getfechaPubli());
            statement.setInt(6, MaterialRevista.getuniDispo());

            rowInserted = statement.executeUpdate() > 0;
            statement.close();
                   
        }catch(SQLException ex){
            Logger.getLogger(MaterialRevistaClases.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowInserted;
    }
    
    //localizar por Código Interno
    
    public boolean localizarMaterialRevista (String idInterno){
        boolean encontrado = false;
        
        try {
            String sql = "SELECT * FROM revistas WHERE idInterno = ?";
            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, idInterno);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                encontrado = true;
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
             Logger.getLogger(MaterialRevista.class.getName()).log(Level.SEVERE, null, ex);
        }
        return encontrado;
    }
    
    //Seleccionar un material por su código
    
    public MaterialRevistaClases seleccionarMaterialRevista (String idInterno){
        MaterialRevistaClases materialRevista = null;
        
        try {
            String sql = "SELECT * FROM revistas WHERE idInterno = ?";
            
            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, idInterno);

            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()){
                
                String id = resultSet.getString("idInterno");
                String titulo = resultSet.getString("titulo");
                String editorial = resultSet.getString("editorial");
                String fechaPubli = resultSet.getString("fechaPubli");
                String periodicidad = resultSet.getString("periodisidad");
                int uniDispo = resultSet.getInt("uniDispo");
                
                materialRevista = new MaterialRevistaClases (id, titulo, editorial, fechaPubli, periodicidad, uniDispo);
            }
            resultSet.close();
            statement.close();
        }catch (SQLException ex) {
            Logger.getLogger(MaterialLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materialRevista;
    }
    
    
    
    //Seleccionar todos las revistas
    
    public List<MaterialRevistaClases> Seleccionartodos() {
    List<MaterialRevistaClases> materialRevistas = new ArrayList<>();
    
    try {
        String sql = "SELECT *FROM revistas";
        
         Statement statement = conexion.createStatement();
         ResultSet resultSet = statement.executeQuery(sql);
         
         while(resultSet.next()){
             String id = resultSet.getString("idInterno");
                String titulo = resultSet.getString("titulo");
                String editorial = resultSet.getString("editorial");
                String periodicidad = resultSet.getString("periodisidad");
                String fechaPubli = resultSet.getString("fechaPubli");
                int uniDispo = resultSet.getInt("uniDispo");
             
             MaterialRevistaClases materialRevista = new MaterialRevistaClases (id, titulo, editorial, fechaPubli, periodicidad, uniDispo);
             materialRevistas.add(materialRevista);
         }
            resultSet.close();
            statement.close();
            
    }catch (SQLException ex) {
            Logger.getLogger(MaterialRevista.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materialRevistas;
}
    
    //Actualizar material revista
    
    public boolean ActualizarMaterialRevista (MaterialRevistaClases MaterialRevista){
        boolean rowUpdated = false;
        
        try {
            String sql = "UPDATE revistas SET titulo = ?, "
                    + " editorial = ?, periodisidad = ?,"
                    + " fechaPubli = ?, uniDispo = ?"
                    + " WHERE idInterno = ?";
            
            PreparedStatement statement = conexion.prepareStatement(sql);
            
            statement.setString(1, MaterialRevista.gettitulo());
            statement.setString(2, MaterialRevista.geteditorial());
            statement.setString(3, MaterialRevista.getperiodicidad());
            statement.setString(4, MaterialRevista.getfechaPubli());
            statement.setInt(5, MaterialRevista.getuniDispo());
            
            statement.setString(6, MaterialRevista.getidInterno());
            
            rowUpdated = statement.executeUpdate()>0;
            statement.close();
        }catch (SQLException ex) {
            Logger.getLogger(MaterialRevista.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowUpdated;
    }
    
    //Eliminar material revista
    
    public boolean EliminarMaterialRevista (String idInterno){
        boolean rowDeleted = false;
        
        try {
            String sql = "DELETE FROM revistas WHERE idInterno = ?";

            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, idInterno);

            rowDeleted = statement.executeUpdate() > 0;
            statement.close();

        } catch (SQLException ex) {
            Logger.getLogger(MaterialRevista.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowDeleted;
    }
    
}

package Logico;
import java.sql.Connection;
import Clases.MaterialDVDClases;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ronald
 */
public class MaterialDVD {

    private Connection conexion;

    public MaterialDVD(Connection conexion) {
        this.conexion = conexion;
    }

    public boolean insertarMaterialDVD(MaterialDVDClases MaterialDVD) {
        boolean rowInserted = false;

        try {
            String sql = "INSERT INTO dvd (idInterno, titulo, director, duracion, genero) VALUES (?,?,?,?,?)";
            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);

            statement.setString(1, MaterialDVD.getidInterno());
            statement.setString(2, MaterialDVD.gettitulo());
            statement.setString(3, MaterialDVD.getdirector());
            statement.setInt(4, MaterialDVD.getduracion());
            statement.setString(5, MaterialDVD.getgenero());

            rowInserted = statement.executeUpdate() > 0;
            statement.close();

        } catch (SQLException ex) {
            Logger.getLogger(MaterialDVD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowInserted;
    }

    public boolean localizarMaterialdvd(String idInterno) {
        boolean encontrado = false;

        try {
            String sql = "SELECT * FROM dvd WHERE idInterno = ?";
            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, idInterno);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                encontrado = true;
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MaterialDVD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return encontrado;
    }

    public MaterialDVDClases seleccionarMaterialdvd(String idInterno) {
        MaterialDVDClases materialdvd = null;

        try {
            String sql = "SELECT * FROM dvd WHERE idInterno = ?";

            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, idInterno);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {

                String id = resultSet.getString("idInterno");
                String titulo = resultSet.getString("titulo");
                String Director = resultSet.getString("director");
                int Duracion = resultSet.getInt("duracion");
                String Genero = resultSet.getString("genero");

                materialdvd = new MaterialDVDClases(id, titulo, Director, Duracion, Genero);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MaterialDVD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materialdvd;
    }

    public List<MaterialDVDClases> Seleccionartodos() {
        List<MaterialDVDClases> materialDVDClases = new ArrayList<>();

        try {
            String sql = "SELECT * FROM dvd";

            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String idInterno = resultSet.getString("idInterno");
                String titulo = resultSet.getString("titulo");
                String Director = resultSet.getString("director");
                int Duracion = resultSet.getInt("duracion");
                String Genero = resultSet.getString("genero");
                MaterialDVDClases materialdvd = new MaterialDVDClases(idInterno, titulo, Director, Duracion, Genero);
                materialDVDClases.add(materialdvd);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException ex) {
            Logger.getLogger(MaterialDVD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materialDVDClases;
    }

    public boolean ActualizarMaterialDVD(MaterialDVDClases MaterialDVD) {
        boolean rowUpdated = false;

        try {
            String sql = "UPDATE dvd SET titulo = ?, director = ?, duracion = ?, genero = ? WHERE idInterno = ?";

            PreparedStatement statement = conexion.prepareStatement(sql);

            statement.setString(1, MaterialDVD.gettitulo());
            statement.setString(2, MaterialDVD.getdirector());
            statement.setInt(3, MaterialDVD.getduracion());
            statement.setString(4, MaterialDVD.getgenero());
            statement.setString(5, MaterialDVD.getidInterno());

            rowUpdated = statement.executeUpdate() > 0;
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MaterialDVD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowUpdated;
    }

    public boolean EliminarMaterialDVD(String idInterno) {
        boolean rowDeleted = false;

        try {
            String sql = "DELETE FROM dvd WHERE idInterno = ?";

            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, idInterno);

            rowDeleted = statement.executeUpdate() > 0;
            statement.close();

        } catch (SQLException ex) {
            Logger.getLogger(MaterialDVD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowDeleted;
    }
}
